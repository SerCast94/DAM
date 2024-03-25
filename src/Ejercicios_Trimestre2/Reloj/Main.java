package Ejercicios_Trimestre2.Reloj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce hora");
        int hora = sc.nextInt();
        System.out.println("Introduce minutos");
        int minuto = sc.nextInt();
        System.out.println("Introduce segundos");
        int segundo = sc.nextInt();
        Hora reloj = new Hora(hora,minuto,segundo);

        System.out.println("Son las " + reloj.getHora() + " Horas, " + reloj.getMinuto() + " Minutos y " + reloj.getSegundo() + " Segundos.");
        System.out.println("Aumente X segundos el reloj.");
        reloj.setSegundo(sc.nextInt());

        System.out.println("Son las " + reloj.getHora() + " Horas, " + reloj.getMinuto() + " Minutos y " + reloj.getSegundo() + " Segundos.");

    }
}