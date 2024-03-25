package Ejercicios_Trimestre1;

import java.util.Scanner;
public class DecimalBinario {
    public static void main(String[] args) {

/* Realiza un programa que convierta un número decimal en su representación binaria.
Hay que tener en cuenta que desconocemos cuántas cifras tiene el número que introduce el usuario.
Por simplicidad, iremos mostrando dígito por línea. */

        Scanner sc = new Scanner(System.in);
        int numeroDecimal,cociente;

        System.out.println("Introduce numero entero: ");
        numeroDecimal = sc.nextInt();

        while (numeroDecimal >= 1) {

            System.out.print(numeroDecimal%2);
            numeroDecimal = numeroDecimal/2;

        }









    }
}