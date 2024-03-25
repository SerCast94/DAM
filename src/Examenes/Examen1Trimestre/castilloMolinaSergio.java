package Examenes.Examen1Trimestre;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;
class castilloMolinaSergio {

    static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int longitud;

       do {
           System.out.println("introduce la cantidad de elementos");
           longitud = sc.nextInt();
       }while(longitud < 0);

        double[] valores = new double[longitud];

        for (int i = 0; i < valores.length; i++) {

            do {
                System.out.println("Introduce valores:");
                valores[i] = sc.nextDouble();
            }while(valores[i]<0);

            System.out.println(Arrays.toString(valores));
        }

        double aux = 0;

        for (int i = 0; i < valores.length-1; i++) {
            if (valores[i] > valores[(i + 1)] && aux < valores[i]) {
                aux = valores[i];
            } else if (aux < valores[i]) {
                aux = valores[i+1];
            }

        }
        System.out.println("El valor máximo es: " + aux);


        double aux2 = 999;

        for (int i = 0; i < valores.length-1; i++) {

            if (valores[i] < valores[(i + 1)] && aux2 > valores[1]) {
                aux2 = valores[i];
            } else if (aux2 > valores[i+1]) {
                aux2= valores[i+1];
            }
        }
        System.out.println("El valor minimo es: " + aux2);


        System.out.println("función devuelve int del numero maximo:");
        System.out.println(castilloMolinaSergioFunciones.devuelve(aux));


        System.out.println("función devuelve long minimo:");
        System.out.println(castilloMolinaSergioFunciones.devuelveLong(valores));

    }




    static void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cadena de texto para comprobar si es palindromo");
        String palindromo = sc.nextLine();

        castilloMolinaSergioFunciones.compruebaPalindromo(palindromo);

        System.out.println("Introduce otra cadena de texto para comprobar si es un anagrama de la primera");
        String anagrama = sc.nextLine();

        castilloMolinaSergioFunciones.compruebaAnagrama(palindromo,anagrama);

        }


    static void ejercicio3(){
    Scanner sc = new Scanner(System.in);
        int longitud;

        do {
            System.out.println("Introduce longitud de matriz");
            longitud = sc.nextInt();
        }while(longitud < 0);

        int[][] matriz1 = new int[longitud][longitud];
        int[][] matriz2 = new int[longitud][longitud];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = (int) (Math.random()*10);
            }
        }
        System.out.println(Arrays.deepToString(matriz1));

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = (int) (Math.random()*10);
            }
        }
        System.out.println(Arrays.deepToString(matriz2));

        System.out.println("Multiplicacion de matrices");
        int[][] matrizMultiplicacion =castilloMolinaSergioFunciones.multiMatriz(matriz1,matriz2);

        System.out.println("Elementos de matriz elevados");
        int[][] matrizPotencia = castilloMolinaSergioFunciones.matrizElevada(matriz1,matriz2);

        System.out.println("mostramos matrices en forma matricial");
        System.out.println("Matriz1");
        castilloMolinaSergioFunciones.matricial(matriz1);

        System.out.println("Matriz2");
        castilloMolinaSergioFunciones.matricial(matriz2);

        System.out.println("Matriz Multiplicada");
        castilloMolinaSergioFunciones.matricial(matrizMultiplicacion);

        System.out.println("Matriz Potencia");
        castilloMolinaSergioFunciones.matricial(matrizPotencia);

    }


    public static void main(String[] args) {

        boolean programa = true;

        while(programa){

            System.out.println("---------------------------------------------------------");
            System.out.println("Introduce el nº correspondiente del ejercicio a realizar.");
            System.out.println("1 - Ejercicio 1.");
            System.out.println("2 - Ejercicio 2.");
            System.out.println("3 - Ejercicio 3.");
            System.out.println("0 - Salir del programa");
            System.out.println("---------------------------------------------------------");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }
        }
    }
}