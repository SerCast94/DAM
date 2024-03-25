package Ejercicios_Trimestre1;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.arraycopy;

public class ArraysQuitaRepes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud,maximo;
        System.out.println("Introduce la longitud de tu tabla");
        longitud = sc.nextInt();
        System.out.println("Introduce el valor máximo de cada elemento de tu tabla");
        maximo = sc.nextInt();
        int[] tablaDesorden = hazTabla(longitud,maximo);
        System.out.println("Su tabla desordenada es ");
        System.out.println(Arrays.toString(tablaDesorden));
        int[]resultadofinal = sinRepetidos(tablaDesorden);
        System.out.println(Arrays.toString(resultadofinal));
    }




static int[] hazTabla(int longitud, int maximo){
    int[] tablaRandom = new int[longitud];
    for(int i = 0 ; i < longitud; i++){
        tablaRandom[i]= (int) (Math.random()*maximo);
        }
    Arrays.sort(tablaRandom);
    return tablaRandom;
    }

    static int[] sinRepetidos(int t[]) {
        int inicio = 0;
        int posicionCopia = 0;
        int[] tablaDesorden;
        tablaDesorden = new int[t.length];

        for (int i = 0; i < t.length-1 && i < tablaDesorden.length-1; i++) {

            if(t[i]==t[i+1]){
               inicio++;

           }else{
               System.arraycopy(t,inicio,tablaDesorden,posicionCopia,1);
                posicionCopia++;
                inicio++;
           }
        }
        System.out.println("tu tabla desorden es: " + Arrays.toString(tablaDesorden));
        int[] tablaFinal;
        tablaFinal = new int[posicionCopia+1];
        System.arraycopy(tablaDesorden,0,tablaFinal,0,posicionCopia);
        return tablaFinal;
    }
}


