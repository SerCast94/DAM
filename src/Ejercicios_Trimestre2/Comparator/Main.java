package Ejercicios_Trimestre2.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Integer[] listaNum = new Integer[19];

        for (int i = 0; i < listaNum.length; i++) {
            listaNum[i] = (int) (Math.random() * 100 + 1);
        }

        Comparator comparaNumeros = new Comparator() {              //constructor clase anonima
            @Override
            public int compare(Object o1, Object o2) {
                return (int)o1 - (int)o2;
            }
        };

        Comparator ordenaNumeros = new OrdenaNum();                 //constructor clase externa

        System.out.println("Lista original");
        System.out.println(Arrays.toString(listaNum));


        //Arrays.sort(listaNum,ordenaNumeros);                      //clase externa
        Arrays.sort(listaNum,comparaNumeros);                       //clase anonima
        System.out.println("Orden creciente");
        System.out.println(Arrays.toString(listaNum));


        //Arrays.sort(listaNum,ordenaNumeros.reversed());           //clase externa
        Arrays.sort(listaNum,ordenaNumeros.reversed());             //clase anonima
        System.out.println("Orden decreciente");
        System.out.println(Arrays.toString(listaNum));
    }
}