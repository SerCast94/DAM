package Examenes.Examen2Trimestre.CastilloMolinaSergio.ejercicio1;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Persona p1 = new Persona("Sergio",30,"Calle Espiritu Santo");
        Persona p2 = new Persona("Jose",31);

        System.out.println(p1);
        p1.mostrarInfo();
        p1.hablar("Vaya mensaje");

        System.out.println(p2);
        p2.mostrarInfo();
        p2.hablar("No tengo imaginación");

        Estudiante e1 = new Estudiante("Yuna",20,"Calle Amargacena",true);
        Estudiante e2 = new Estudiante("Alex",22,"Calle Azul",false);

        e1.mostrarInfo();
        e2.mostrarInfo();

        Clase DAM = new Clase();

        DAM.insertarEstudiante(e1);
        DAM.insertarEstudiante(e2);


        DAM.mostrarInfo();






    }
}
