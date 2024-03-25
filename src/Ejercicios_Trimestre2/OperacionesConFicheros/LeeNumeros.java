package Ejercicios_Trimestre2.OperacionesConFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LeeNumeros {

    Double [] lista = new Double[0];

    BufferedReader lector = null;

    void copiaNumeros(){
        Scanner sc;

            try {
                sc = new Scanner(new File("D:\\01. programación\\01. ejercicios2\\ficheros5\\untitled\\src\\NumerosReales.txt"));

                try {
                    for (int i = 0; i < lista.length+1; i++) {

                        lista[i] = sc.nextDouble();
                        lista = Arrays.copyOf(lista, lista.length+1);
                    }

                    System.out.println(Arrays.deepToString(lista));



                }catch (NullPointerException e){
                    System.out.println(e.getMessage());
                }





            } catch (IOException e) {
                System.out.println(e.getMessage());
            }finally {
                try {
                    if(lector != null){
                    lector.close();
                    System.out.println("Archivo cerrado");
                    }
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
    }

    void muestraArray(){

        System.out.println(Arrays.deepToString(lista));
    }

    void ordenaArray(){
        Arrays.sort(lista);
        System.out.println(Arrays.deepToString(lista));

    }

    void cuentaArray(){
        System.out.println(lista.length);
    }

    void sumaArray(){
        double sumatorio = 0;
        for (int i = 0; i < lista.length; i++) {
            sumatorio += lista[i];
        }
        System.out.println("La suma de los numeros es: " + sumatorio);
    }

    void mediaArray(){
        double sumatorio = 0;
        for (int i = 0; i < lista.length; i++) {
            sumatorio += lista[i];
        }

        System.out.println( "La media de los numeros es: " + sumatorio / lista.length);
    }
}
