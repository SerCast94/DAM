package Ejercicios_Trimestre2.IntrumentoPiano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Piano piano = new Piano();
        boolean menu = true;


        while(menu) {
         System.out.println("Introduce opcion");
            System.out.println("""
                    1. añade nota
                    2. muestra composición
                    3. SALIR       
                    """);
         int opcion = sc.nextInt();

            switch (opcion) {
                case 1 ->{
                    piano.add();}
                case 2 ->{
                    System.out.println("Se muestran todas las notas a continuación");
                    piano.interpretar();}

                case 3 ->menu = false;
                default -> System.out.println("Introduce opcion válida");
            }
        }
    }
}