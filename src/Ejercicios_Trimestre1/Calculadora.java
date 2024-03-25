package Ejercicios_Trimestre1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        boolean programa = true;
        while(programa){

            System.out.println("---------------------------------------------------------");
            System.out.println("Que operación quieres realizar?.");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta.");
            System.out.println("3 - Multiplicación.");
            System.out.println("4 - División");
            System.out.println("5 - Potenciación.");
            System.out.println("6 - Algoritmo de Euclides.");
            System.out.println("0 - Salir del programa");
            System.out.println("---------------------------------------------------------");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            switch (opcion){
                case 1 -> suma();
                case 2 -> resta();
                case 3 -> elegirmultiplicacion();
                case 4 -> division();
                case 5 -> potenciacion();
                case 6 -> {System.out.println("Introduce 2 numero para buscar el mínimo comun divisor con el algoritmo de Euclides");
                int numero1 = sc.nextInt();
                int numero2 = sc.nextInt();
                    System.out.println("El mínimo común multiplo es: " + euclides(numero1, numero2));
                }
                case 0 -> programa = false;
                default ->
                        System.out.println("Introduce un número valido para realizar una operación, por favor prueba de nuevo.");
            }
        }
    }
    static void suma(){
        System.out.println("Introduzca dos números para sumar");
        Scanner sc = new Scanner(System.in);
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        System.out.println("El resultado es: " + (numero1+numero2));
    }
    static void resta(){
        System.out.println("Introduzca dos números para restar");
        Scanner sc = new Scanner(System.in);
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        System.out.println("el resultado es: " + (numero1-numero2));
    }
    static void elegirmultiplicacion() {
        int eleccion;
        do {
            System.out.println("¿Quieres multiplicar 2 o 3 números?");
            Scanner sc = new Scanner(System.in);
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 2 -> {
                    System.out.println("Introduzca números a multiplicar");
                    double numero1 = sc.nextDouble();
                    double numero2 = sc.nextDouble();
                    multiplicacion(numero1, numero2);
                }
                case 3 -> {
                    System.out.println("Introduzca números a multiplicar");
                    double numero1 = sc.nextDouble();
                    double numero2 = sc.nextDouble();
                    double numero3 = sc.nextDouble();
                    multiplicacion(numero1, numero2, numero3);
                }
                default -> System.out.println("Introduce un número valido para realizar una operación, por favor prueba de nuevo.");
            }
        } while (eleccion != 2 & eleccion != 3);
    }

    static void multiplicacion(double numero1, double numero2){
   System.out.println("El resultado es: " + (numero1*numero2));
    }
    static void multiplicacion(double numero1, double numero2, double numero3){
        System.out.println("El resultado es: " + (numero1*numero2*numero3));
    }
    static void division(){
        System.out.println("Introduzca dos números para dividir");
        Scanner sc = new Scanner(System.in);
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        System.out.println("El resultado es: " + (numero1/numero2));
    }
    static void potenciacion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número para la base");
        double numero1 = sc.nextDouble();
        System.out.println("Introduzca un número para la potencia");
        double numero2 = sc.nextDouble();
        System.out.println("El resultado es: " + (Math.pow(numero1,numero2)));
    }
    static int euclides(int numero1, int numero2){
      if (numero2==0){
          return numero1;
      }
          else{ return euclides(numero2, numero1%numero2);
          }
    }
}