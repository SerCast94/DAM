package Ejercicios_Trimestre2.Radio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean menu = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la frecuencia: ");
        System.out.println("Por defecto se establecerá la frecuencia 80.0Mhz.");
        double frecInicial = sc.nextDouble();
        SintonizadorFM sintonizador = new SintonizadorFM(frecInicial);
        System.out.println("Se ha creado su sintonizador en la frecuencia " + sintonizador.frecuencia + " Mhz");
        sintonizador.display();
        while(menu) {
            int opcion;
            System.out.println("Introduce que operación desea realizar");
            System.out.println("""
                ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                ┃           Seleccione la operación:            ┃
                ┃ 1.-  Subir Frecuencia                         ┃
                ┃ 2.-  Bajar Frecuencia                         ┃
                ┃ 3.-  Emisora siguiente                        ┃
                ┃ 3.-  Emisora anterior                         ┃
                ┃ 0.- SALIR                                     ┃
                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                """);
            opcion = sc.nextInt();
            switch (opcion){
                case 1 -> {sintonizador.setFrecuenciaUp();}
                case 2 -> {sintonizador.setFrecuenciaDown();}
                case 3 -> {sintonizador.setEmisoraUp();}
                case 4 -> {}

            }
        }
    }
}