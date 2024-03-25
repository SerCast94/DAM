package Ejercicios_Trimestre2.LeeNumerosArray;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LeeNumeros {

    Double [] lista;

    BufferedReader lector = null;

    void copiaNumeros(){

            try {
                lector = new BufferedReader(new FileReader("D:\\01. programación\\01. ejercicios2\\ficheros4\\untitled\\src\\NumerosReales.txt")) ;
                try {
                    String cad = lector.readLine();
                    String[] subCad = cad.split(" ");
                    lista = new Double[subCad.length];
                    System.out.println("Archivo abierto");

                    for (int i = 0; i < subCad.length; i++) {
                       double num = Double.valueOf(subCad[i]);
                        lista[i] = num;
                    }
                }catch (NullPointerException e){
                    System.out.println(e.getMessage());
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }finally {
                try {
                    lector.close();
                    System.out.println("Archivo cerrado");
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
