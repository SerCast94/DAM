package Examenes.Examen2Trimestre.CastilloMolinaSergio.ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Zoo {

    Mamifero[] mamiferos = new Mamifero[2];
    Ave[] aves = new Ave[2]; //tamaño 2 para pruebas rapidas


    void comparaNombre() {


        for (int i = 0; i < mamiferos.length; i++) {
            String nombreConjunto = "";

            for (int j = 0; j < mamiferos[i].nombre.length(); j++) {

                if (mamiferos[i].nombre.charAt(j) == aves[i].nombre.charAt(j)) {

                    nombreConjunto += mamiferos[i].nombre.charAt(j);
                }

            }
            System.out.println(nombreConjunto);
        }
    }

    void mostrarInformacion(){
        System.out.println("Los animales del zoo son los siguientes:");
        System.out.println("-------AVES-------");
        for (int i = 0; i < aves.length; i++) {
            System.out.println("AVE " + i);
            System.out.println("nombre: " + aves[i].getNombre());
            System.out.println("Peso: " + aves[i].peso);
            System.out.println("Altura :" + aves[i].altura);
            System.out.println("Tiempo de incubacion: " + aves[i].getTiempoDeIncubacion());
        }
        System.out.println("-------MAMIFEROS-------");
        for (int i = 0; i < mamiferos.length; i++) {
            System.out.println("MAMIFERO " + i);
            System.out.println("Nombre: " + mamiferos[i].getNombre());
            System.out.println("Peso: " + mamiferos[i].getPeso());
            System.out.println("Altura: " + mamiferos[i].getAltura());
            System.out.println("Tiempo de gestación: " + mamiferos[i].getTiempoDeGestacion());
            System.out.println(mamiferos[i].getDeCompania());
        }
    }

    void mostrarInvertido(){
        int contador = aves.length-1;
        for (int i = 0; i < mamiferos.length; i++) {

            System.out.println(mamiferos[i].nombre);
            System.out.println(aves[contador].nombre);
            contador--;
        }
    }

    void guardarTXT(){

        try(BufferedWriter out = new BufferedWriter(new FileWriter("resultadosCastilloMolinaSergio.txt"))){

            out.write("Información del zoo");
            out.newLine();
            out.write("Aves");
            out.newLine();
            for (int i = 0; i < aves.length; i++) {
                out.write("Nombre: " + aves[i].getNombre());
                out.newLine();
                out.write("Peso: " + aves[i].getPeso());
                out.newLine();
                out.write("Altura: " + aves[i].getAltura());
                out.newLine();
                out.write("El tiempo de incubación es: " + aves[i].getTiempoDeIncubacion());
                out.newLine();
                out.write("Es animal de compañia: " + mamiferos[i].getDeCompania());
                out.newLine();
            }
            out.write("Mamiferos");
            out.newLine();
            for (int i = 0; i < mamiferos.length; i++) {
                out.write("Nombre: " + mamiferos[i].getNombre());
                out.newLine();
                out.write("Peso: " + mamiferos[i].getPeso());
                out.newLine();
                out.write("Altura: " + mamiferos[i].getAltura());
                out.newLine();
                out.write("El tiempo de incubación es: " + mamiferos[i].getTiempoDeGestacion());
                out.newLine();
                out.write("Es animal de compañia: " + mamiferos[i].getDeCompania());
                out.newLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}