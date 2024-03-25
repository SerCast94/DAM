package Ejercicios_Trimestre2.Agenda;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Agenda {

    String[] nombres = {"a"};
    String[] telefenos = {"5"};
    Contacto[] listaContactos;
    int tamanio = 20;


    void nuevoContacto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del nuevo contacto");
        String contacto = sc.nextLine();

        for (int i = 0; i < nombres.length; i++) {

            if(nombres[i].toLowerCase().contains(contacto.toLowerCase())){
                System.out.println("El contacto ya existe");
                break;

            }else {
                System.out.println("El contacto no existe, se procede a crearlo");
                System.out.println("Introduce su numero de telefono");
                String numero = sc.nextLine();
                nombres[nombres.length-1] = contacto;
                telefenos[telefenos.length-1] = numero;

                if(nombres.length < tamanio){
                    nombres = Arrays.copyOf(nombres, nombres.length+1);
                    telefenos = Arrays.copyOf(telefenos,telefenos.length+1);
                }
                break;
            }
        }

    }

    void buscarNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre a buscar");
        String contacto = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {
            if(nombres[i]!=null && nombres[i].toLowerCase().contains(contacto.toLowerCase())){
                System.out.println("Contacto encontrado");
                System.out.println("Nombre: " + nombres[i]);
                System.out.println("Telefono: " + telefenos[i]);
                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("Contacto no encontrado");
        }
    }

    void mostrarTodos(){
        System.out.println("------ Lista de Contactos ------ ");
        for (int i = 0; i < nombres.length; i++) {
            if(nombres[i] != null) {
                System.out.println("Nombres: " + nombres[i]);
                System.out.println("Telefono: " + telefenos[i]);
                System.out.println("------------------------------");
            }
        }
        
    }

    void cargar(){
        String[] aux = new String[2];
        int contador = 0;
        try(BufferedReader in = new BufferedReader(new FileReader("D:\\01. programación\\01. ejercicios2\\ficheros9\\ficheros9\\agenda.txt"))){

            String intentoLectura = in.readLine();
            while(intentoLectura!=null){
                nombres[contador] = aux[0];
                telefenos[contador] = aux[1];
                contador++;
                if (nombres.length < tamanio) {
                    nombres = Arrays.copyOf(nombres, nombres.length + 1);
                    telefenos = Arrays.copyOf(telefenos, telefenos.length + 1);
                }
                intentoLectura = in.readLine();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    void cerrar(){
        try(BufferedWriter out = new BufferedWriter(new FileWriter("D:\\01. programación\\01. ejercicios2\\ficheros9\\ficheros9\\agenda.txt"))){

            for (int i = 0; i < nombres.length; i++) {
                out.write(nombres[i]+";"+telefenos[i]);
                out.newLine();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}
