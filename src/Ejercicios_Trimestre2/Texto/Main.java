package Ejercicios_Trimestre2.Texto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce su mensaje inicial");
        String aux = sc.nextLine();
        Texto texto = new Texto(aux);

        boolean menu = true;

        while (menu) {
            Scanner escan = new Scanner(System.in);


            System.out.println("""
                    /-----------------------------------------------/
                    |           Seleccione la operación:            |
                    | 1.- Mostrar info                              |
                    | 2.- Contar vocales                            |
                    | 3.- Añadir cadena al principio                |
                    | 4.- Añadir cadena al final                    |
                    | 5.- Añadir caracter al principio              |
                    | 6.- Añadir caracter al final                  |
                    | 7.-                                           |
                    | 8.-                                           |
                    | 9.-                                           |
                    | 0.- SALIR                                     |
                    /-----------------------------------------------/
                    """);
            System.out.println("Introduce que operación desea realizar");
            int opcion = escan.nextInt();
            switch (opcion) {
                case 1 -> texto.mostrarInfoTexto();
                case 2 -> System.out.println("Su cadena tiene : " + texto.cuentaVocales() + " voacles");
                case 3 -> {
                    System.out.println("Introduce una cadena");
                    aux = sc.next();
                    texto.setCadenaPrincipio(aux);                }
                case 4 -> {
                    System.out.println("Introduce una cadena");
                    aux = sc.next();
                    texto.setCadenaFinal(aux);                }
                case 5 -> {
                    System.out.println("Introduce un caracter");
                    char charAux = texto.StringtoChar();
                    texto.setCharPrincipio(charAux);}
                case 6 -> {
                    System.out.println("Introduce un caracter");
                    char charAux = texto.StringtoChar();
                    texto.setCharFinal(charAux);}
                case 0 -> menu = false;


            }
        }
    }
}