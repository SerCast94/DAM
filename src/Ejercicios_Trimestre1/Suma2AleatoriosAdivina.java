package Ejercicios_Trimestre1;
import java.util.Scanner;
import java.lang.Math;

public class Suma2AleatoriosAdivina {
    public static void main(String[] args) {
        int resultadousuario, resultadosuma;
        int numero1 = (int) (Math.random() * 98) + 1;
        int numero2 = (int) (Math.random() * 98) + 1;
        resultadosuma = numero1 + numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("El primer numero es: " + numero1);
        System.out.println("El segundo numero es: " + numero2);
        System.out.println("Suma los siguientes número generados aleatoriamente");
        resultadousuario = sc.nextInt();
        while(resultadosuma != resultadousuario) {
            System.out.println("Error, intenta de nuevo");
            resultadousuario = sc.nextInt();
        }
            System.out.println("¡Has ganado!");
    }
}