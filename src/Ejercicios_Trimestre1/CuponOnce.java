package Ejercicios_Trimestre1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CuponOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Introcude su número de la loteria");
        int boleto[] = new int[6];
        int sorteo[] = new int[6];
        int conteo = 0;

        for (int i = 0; i <= boleto.length - 1; i++) {
            System.out.println("Introduzca el número " + i + " de su Lotería");
            boleto[i] = sc.nextInt();
            if(boleto[i]>= 10 || boleto[i]<0){
                i--;
                System.out.println("Introduce un número válido entre 0 y 9");
            }
        }
        Arrays.sort(boleto);
        System.out.println("Tu participación es " + Arrays.toString(boleto));


        for (int i = 0; i <= boleto.length - 1; i++) {
            sorteo[i] = (int) (Math.random() * 9);
        }
        Arrays.sort(sorteo);
        System.out.println("El sorteo ganador es " + Arrays.toString(sorteo));
        System.out.println("<------------------------------------------->");




        for (int i = 0; i <= boleto.length - 1; i++) {
            if (boleto[i] == sorteo[i]) {
                System.out.println("Ha acertado la posición " + i);
                conteo++;
            } else {
                if (boleto[i] != sorteo[i]) {
                    System.out.println("No ha acertado la posición " + i);
                }
            }
        }
    if(conteo == 6){
    System.out.println("Ganaste la puta lotería");

    }
    }
}