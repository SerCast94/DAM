package Examenes.Examen1Trimestre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean programa = true;

        while(programa){

            System.out.println("""
                                                
                            ┌──────────────────────────────────────────────┐
                            │                    MENU                      │
                            │                                              │
                            │ 1.  Ejercicio1                               │
                            │ 2.  Ejercicio2                               │
                            │ 3.  Ejercicio3                               │
                            │                                              │
                            │ 0. SALIR                                     │
                            └──────────────────────────────────────────────┘
                        """);

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> castilloMolinaSergio.ejercicio1();
                case 2 -> castilloMolinaSergio.ejercicio2();
                case 3 -> castilloMolinaSergio.ejercicio3();
                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }
        }
    }
    }