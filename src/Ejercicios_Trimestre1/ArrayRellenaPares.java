package Ejercicios_Trimestre1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRellenaPares {
    public static void main(String[] args) {


        System.out.println("Introduce la longitud máxima");
        int longitud = new Scanner(System.in).nextInt();
        System.out.println("Introduce el valor máximo del aleatorio");
        int fin = new Scanner(System.in).nextInt();


        int[] tabla = rellenaPares(longitud,fin);
        System.out.println(Arrays.toString(tabla));

    }
    static int[] rellenaPares(int longitud, int fin){

        int[] tabla = new int[longitud];

        for (int i = 0; i < tabla.length;i++){
            tabla[i]= (int) (Math.random() * fin) + 2;
            if(tabla[i]%2 != 0) i--;
        }

        Arrays.sort(tabla);

        return tabla;
    }

}
