package Utiles;


import java.util.Scanner;

public class Util {

    void asignaStringArray(String[] cadena){
        Scanner sc = new Scanner(System.in);

        for (var array : cadena ) {
            System.out.println("Introduce el número para la posición ");
            array = sc.next();}
    }
}
