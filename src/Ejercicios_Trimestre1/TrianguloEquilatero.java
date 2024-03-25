package Ejercicios_Trimestre1;

import java.util.Scanner;

public class TrianguloEquilatero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero = sc.nextInt();
        sc.close();

        System.out.println();
        for(int altura = 1; altura<=numero; altura++){

            for(int espacio = 1; espacio<=numero-altura; espacio++){
                System.out.print(" ");
            }

            for(int puntos=1; puntos<=(altura*2)-1; puntos++){
                System.out.print(".");
            }

            System.out.println();
        }
    }
}