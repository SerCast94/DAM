package Practicas.Practica3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean programa = true;

        while(programa){

            System.out.println("---------------------------------------------------------");
            System.out.println("Introduce el nº correspondiente del ejercicio a realizar.");
            System.out.println("1 - Ejercicio 1.");
            System.out.println("2 - Ejercicio 2.");
            System.out.println("3 - Ejercicio 3.");
            System.out.println("0 - Salir del programa");
            System.out.println("---------------------------------------------------------");


            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> System.out.println("Ejercicio de Vehiculo, Seat y Ferrari, no tiene Main. 🐶☝️ Comprueba sus clases.");
                case 2 -> Practicas.Practica3.Ejercicio2.Main.main(new String[0]);
                case 3 -> Practicas.Practica3.Ejercicio3.Main.main(new String[0]);
                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }
        }
    }
}