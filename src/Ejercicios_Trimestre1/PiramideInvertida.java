package Ejercicios_Trimestre1;

import java.util.Scanner;

public class PiramideInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n;
        System.out.println("Introduce un número");
        System.out.println();

        n = sc.nextInt();


        for (i = n; i >=1; i--){
            j = 1;
            System.out.println();

            while(j<=i){
                System.out.print("*");
                j++;
            }
        }
        System.out.println();

    }
}