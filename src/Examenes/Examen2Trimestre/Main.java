package Examenes.Examen2Trimestre;

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
                            │                                              │
                            │ 0. SALIR                                     │
                            └──────────────────────────────────────────────┘
                        """);
            System.out.println("Introduce una opción");
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> Examenes.Examen2Trimestre.CastilloMolinaSergio.ejercicio1.Main.main(new String[0]);
                case 2 -> Examenes.Examen2Trimestre.CastilloMolinaSergio.ejercicio2.Main.main(new String[0]);
                case 0 -> programa = false;

                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }
        }






    }
}