package Ejercicios_Trimestre1;

import java.util.Arrays;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {


        int[] tablaApuesta, tablaGanadora;
        tablaGanadora = new int[6];

        for (int i = 0; i < tablaGanadora.length;i++){
            tablaGanadora[i] = (int)(Math.random() * 49) + 1;
            for (int j = 0; j < i; j++){
                if(tablaGanadora[i] == tablaGanadora[j]){
                    System.out.println("Se ha detectado el mismo número");
                    i--;
                }
            }
        }
        Arrays.sort(tablaGanadora);
        System.out.println(Arrays.toString(tablaGanadora));

        tablaApuesta = new int[6];
        for (int i = 0; i < tablaApuesta.length; i++){
            tablaApuesta[i] = new Scanner(System.in).nextInt();
            for (int j = 0; j < i; j++){
                if(tablaApuesta[i] == tablaApuesta[j] || tablaApuesta[i] < 0){
                    System.out.println("Has introducido un número que ya se encuentra en tu ticket");
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(tablaApuesta));

        int aciertos = aciertosPrimitiva(tablaApuesta, tablaGanadora);


    }

    static int aciertosPrimitiva(int[] tablaApuesta, int[] tablaGanadora){

        System.out.println("El número de la lotería ganador es :" + Arrays.toString(tablaGanadora));
        System.out.println("Mi número es: " + Arrays.toString(tablaApuesta));

        int aciertos = 0;

        for (int i= 0;i < tablaApuesta.length;i++){
            int indice = Arrays.binarySearch(tablaGanadora, tablaApuesta[i]);
            if(indice > 0){
                aciertos++;
                System.out.println("Número " + tablaApuesta[i] + " encontrado en la posición " + indice);
            }
            else {
                System.out.println("Número no encontrado");
            }
        }

        return aciertos;
    }


}
