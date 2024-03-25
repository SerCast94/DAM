package Ejercicios_Trimestre1;

import java.util.Scanner;
import java.util.Arrays;
public class ArraysEliminaMayores{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor máximo a mantener en la tabla");
        int valor = sc.nextInt();
        int[] t= {0,11,21,31,41,51,61,7,8,9,10};
        eliminarMayores(t,valor);



    }
   static int[] eliminarMayores(int t[], int valor){
        int indiceBusqueda = 0;
       while (indiceBusqueda < t.length && t[indiceBusqueda] != t[valor]){
           indiceBusqueda++;
       }
       if(indiceBusqueda < t.length){
           System.out.println("El índice donde se encuentra dicho elemento es la posición " + indiceBusqueda);
       }
       else {
           System.out.println("Valor no encontrado.");
       }

       while(indiceBusqueda !=-1){
           t[indiceBusqueda+1] = t[t.length-1];
           t = Arrays.copyOf(t, t.length - 1);
           System.out.println(Arrays.toString(t));
       }

       return t;
   }

}