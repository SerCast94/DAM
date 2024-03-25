package Ejercicios_Trimestre1;

import java.util.Scanner;
public class ArrayCuentaEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la tabla");
        int i, n = sc.nextInt();
        int tablita[] = new int[n];

        for(i=0; i < tablita.length;i++){

            System.out.println("Introduce el número para la posición " + i + ": ");
            tablita[i]=sc.nextInt();
        }

    int sumatorio = 0, negativos = 0;
    int contadorSuma = 0, contadorNegativos = 0, contadorCeros = 0;

        for(i=0; i < tablita.length ; i++) {

            if(0 < tablita[i]){
                sumatorio += tablita[i];
                contadorSuma++;
            }
            if(0 > tablita[i]){
                negativos -= tablita[i];
                contadorNegativos++;
            }
            if(0 == tablita[i]){
                contadorCeros++;
            }
        }
    sumatorio = sumatorio/contadorSuma;
    negativos = negativos/contadorNegativos;
    System.out.println("La media de los numeros positivos es: " + sumatorio);
    System.out.println("La media de los numeros positivos es: " + negativos);
    System.out.println("El número de 0 en la lista es " + contadorCeros);
    }
}