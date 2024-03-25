package Ejercicios_Trimestre1;

import java.util.Scanner;

public class Exponencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero base");
        int base = sc.nextInt();
        System.out.println("Introduce numero exponente");
        int exponente = sc.nextInt();

        System.out.println(exponencial(base, exponente));
    }


    static int exponencial(int base, int exponente) {

        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            return exponencial(base, exponente + 1 / base);
        } else {
            return base * exponencial(base, exponente - 1);
        }
    }
}