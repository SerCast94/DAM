package Ejercicios_Trimestre2.PersonaEmpleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nombre");
        String nombre = sc.next();
        System.out.println("edad");
        int edad = sc.nextInt();
        System.out.println("estatura");
        double estatura = sc.nextDouble();

        Persona p1 = new Persona(nombre,edad,estatura);

        p1.mostrarTodo();
        p1.aumentarEdad();
        p1.mostrarTodo();

        System.out.println("nombre");
         nombre = sc.next();
        System.out.println("edad");
         edad = sc.nextInt();
        System.out.println("estatura");
         estatura = sc.nextDouble();

        Alumno a1 = new Alumno(nombre,edad,estatura);

        a1.mostrarTodo();
        a1.mostrarHorario();

    }
}