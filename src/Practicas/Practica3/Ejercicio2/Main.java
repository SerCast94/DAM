package Practicas.Practica3.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        Pieza pieza = null;

        while(menu){
            System.out.println("""
                ------ ♟️AJEDREZ 2.0♟️ ------
                1. Crear Peón.
                2. Crear Torre.
                3. Crear Caballo.
                4. Mover Ficha.
                5. Mostrar datos.
                0. SALIR.
                -------------------------
                """);
            System.out.println("Introduce operación");
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 ->   {
                    System.out.println("Introduce fila de inicio (0-7)");
                    int fila = sc.nextInt();
                    System.out.println("Introduce columna de inicio (0-7)");
                    int columna = sc.nextInt();
                    pieza = new Peon(fila,columna,false) ;
                }
                case 2 ->   {
                    System.out.println("Introduce fila de inicio (0-7)");
                    int fila = sc.nextInt();
                    System.out.println("Introduce columna de inicio (0-7)");
                    int columna = sc.nextInt();
                    pieza = new Torre(fila,columna,false) ;
                }
                case 3 ->   {
                    System.out.println("Introduce fila de inicio (0-7)");
                    int fila = sc.nextInt();
                    System.out.println("Introduce columna de inicio (0-7)");
                    int columna = sc.nextInt();
                    pieza = new Caballo(fila,columna,false) ;
                }
                case 4 ->   {
                    if (pieza != null) {
                    System.out.println("Introduce fila de destino");
                    int fila = sc.nextInt();
                    System.out.println("Introduce columna de destino");
                    int columna = sc.nextInt();
                    pieza.movimiento(fila,columna);
                    }else System.out.println("Primero debe crear una pieza");
                }
                case 5 ->{
                    if (pieza != null) {
                    pieza.mostrarDatos();
                    } else System.out.println("Primero debe crear una pieza");
                }
                case 0 -> menu = false;
            }
        }
    }
}
