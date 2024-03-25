package Ejercicios_Trimestre2.LeerEntero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer valor;
        valor = leerEntero();
        System.out.println("su valor entero es: " + valor);

    }

   static Integer leerEntero(){
        Integer entero = null;

        while(entero == null) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce un número entero");
                entero = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("fallaste mostro");
            }
        }
        return entero;
    }
}