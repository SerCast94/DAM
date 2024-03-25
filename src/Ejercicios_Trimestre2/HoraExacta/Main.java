package Ejercicios_Trimestre2.HoraExacta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora");
        int hora = sc.nextInt();
        System.out.println("Introduce minutos");
        int minuto = sc.nextInt();

        Hora reloj = new Hora(hora,minuto);


        System.out.println("Añade los segundo al relojExacto");

        int segundo = sc.nextInt();
        HoraExacta relojExacto = new HoraExacta(hora,minuto,segundo);

        int opcion;
        boolean salir = false;
        while(!salir) {
            System.out.println("que desea realizar");
            System.out.println("""
                    ┌────────────────────────────────────┐
                    │1. mostrar hora                     │
                    │2. cambia hora devuelve boleano     │
                    │3. cambia minuto devuelve boleano   │
                    │4. incrementa minuto                │
                    │5. incrementa seguno (RelojExacto)  │
                    │6. Compara Hora y hora exacta       │
                    │0. SALIR                            │
                    └────────────────────────────────────┘
                     """);
             opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {System.out.println("Reloj: " + reloj);
                           System.out.println("Reloj Exacto: " + relojExacto);
                            }
                case 2 -> {
                    System.out.println("Introduce la hora a la que cambiar");
                    int hora1 = sc.nextInt();
                    if (reloj.setHoraBolean(hora1)) {
                        System.out.println("se pudo cambiar");
                    } else {
                        System.out.println("no se pudo cambiar");
                    }

                }
                case 3 -> {
                    System.out.println("Introduce los minutos a la que cambiar");
                    int minuto1 = sc.nextInt();
                    boolean sepudo = reloj.setMinutosBolean(minuto1);
                    if (sepudo) {
                        System.out.println("se pudo cambiar");
                    } else {
                        System.out.println("no se pudo cambiar");
                    }
                }
                case 4 -> {
                    reloj.inc();
                    System.out.println("Se ha incrementado un minuto.");
                }
                case 5 ->{ relojExacto.inc();
                        System.out.println(relojExacto);
                }
                case 6 -> {
                    System.out.println("Son las horas iguales?");
                    System.out.println(relojExacto.equals(reloj));
                }
                case 0 -> salir = true;
                default -> System.out.println("introduzca numero válido");

            }
        }

    }
}