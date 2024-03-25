package Ejercicios_Trimestre1;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n;
        System.out.println("Introduce un número");
        n = sc.nextInt();

        for (i = 1; i <=n; i++){
            j = 1;
            System.out.println();

            while(j<=i){
                System.out.print("*");
                j++;
            }
        }
            }
}