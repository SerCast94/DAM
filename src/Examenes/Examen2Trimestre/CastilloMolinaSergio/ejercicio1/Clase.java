package Examenes.Examen2Trimestre.CastilloMolinaSergio.ejercicio1;

import java.util.Arrays;

public class Clase {
    Estudiante[] estudiantes = new Estudiante[0];
    final int MAXESTUDIANTES = 25;



    void insertarEstudiante(Estudiante estudiante) {

        if (estudiantes.length < MAXESTUDIANTES) {
            estudiantes = Arrays.copyOf(estudiantes, estudiantes.length + 1);
            estudiantes[estudiantes.length-1] = estudiante;
        } else System.out.println("Tamaño maximo de la clase alcanzado");

    }

    void borrarEstudiante(int posicion){

    // es con ArrayCopy pero no me auto completa el método...






    }

    void mostrarInfo(){
        System.out.println("El tamaño máximo de la clase es: " + MAXESTUDIANTES);
        System.out.println("Los estudiantes son los siguientes: ");
        System.out.println(Arrays.deepToString(estudiantes));
    }
}
