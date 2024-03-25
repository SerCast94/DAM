package Ejercicios_Trimestre2.OperacionesConFicheros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LeeNumeros leeNumeros = new LeeNumeros();

        boolean programa = true;

        while(programa){

            System.out.println("""  
                            ┌──────────────────────────────────────────────┐
                            │                    MENU                      │
                            │                                              │
                            │ 1. Copia numeros                             │
                            │ 2. Muestra Array                             │
                            │ 3. Ordena Array                              │
                            │ 4. Suma Array                                │
                            │ 5. Media Array                               │
                            │ 0. SALIR                                     │
                            └──────────────────────────────────────────────┘
                        """);
            System.out.println("Introduce una opción");
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> leeNumeros.copiaNumeros();
                case 2 -> leeNumeros.muestraArray();
                case 3 -> leeNumeros.ordenaArray();
                case 4 -> leeNumeros.sumaArray();
                case 5 -> leeNumeros.mediaArray();

                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }
        }


    }
}