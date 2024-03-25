package Practicas.Practica2;

import java.util.Scanner;

class Practica2SergioCastilloMolina {
    static void ejercicio1() {

        System.out.println("La palabra secreta se ha generado, intenta adivinarla");
        String palabraSecreta = Practica2Funciones.palabraSecreta();
        char[] pSArray = palabraSecreta.toCharArray();
        System.out.println("La palabra secreta tiene " + pSArray.length + " letras");
        char[] palabraAdivinar;
        palabraAdivinar = new char[pSArray.length];

        for (int i = 0; i < pSArray.length; i++) {
            palabraAdivinar[i] = '_';
            System.out.print(palabraAdivinar[i]);
        }
        System.out.println();

        boolean ganar = false;
        int fallos = 0;
        int num =0;
        char[] letrasProbadas = new char[pSArray.length+5];

        while(!ganar) {
            char letra = Practica2Funciones.StringAChar(letrasProbadas);                    //cambia el String a un char y filtra

            letrasProbadas[num] = letra;
            num++;
            System.out.print("Ha probado las siguientes letras ");

            for (int i = 0; i < num; i++) {
                System.out.print(letrasProbadas[i] + ", ");
            }
            System.out.println();

            fallos=Practica2Funciones.comprueba(letra,pSArray,palabraAdivinar,fallos);      //comprueba letra en la palabra

            if(fallos == -1) {                                                              //si la función devuelve -1 , gana
                ganar=true;
                System.out.println("Ha ganado");

            } else if (fallos==5) {                                                         //si se llega a 5 fallos pierde
                System.out.println("Has perdido");
                break;
            }
        }
        System.out.println("Gracias por jugar al ahorcado.");

    }

    static void ejercicio2(){
        Scanner sc = new Scanner(System.in);

        int numAlumnos;
        String[] nombreAlumnos;
        int[] edadAlumnos;
        double[] notaAlumnos;
       do {
           System.out.println("Introduce el número de alumnos");
        numAlumnos = sc.nextInt();
       }while (numAlumnos <= 0 || numAlumnos > 100);                                 //num alumnos entre 1 y 100, para limitar errores de scanner

        nombreAlumnos = new String[numAlumnos];
        edadAlumnos = new int[numAlumnos];
        notaAlumnos = new double[numAlumnos];

        Practica2Funciones.datosAlumnos(nombreAlumnos, edadAlumnos, notaAlumnos, numAlumnos);
        System.out.println("---------------------------------------------------------");

        double media = 0;

        media=Practica2Funciones.calcularMedia(notaAlumnos, numAlumnos, media);     //calcula y devuelve media
        System.out.println("---------------------------------------------------------");

        Practica2Funciones.notaMedia(numAlumnos,media,notaAlumnos,nombreAlumnos);   //calcula e imprime alumnos con nota superior a la media
        System.out.println("---------------------------------------------------------");

        Practica2Funciones.notaSobresaliente(numAlumnos,notaAlumnos,nombreAlumnos); //calcula e imprime alumnos con sobresaliente
        System.out.println("---------------------------------------------------------");

        Practica2Funciones.notaNotable(numAlumnos,notaAlumnos,nombreAlumnos);          //calcula e imprime alumnos con notable
        System.out.println("---------------------------------------------------------");

        Practica2Funciones.notaAprobado(numAlumnos,notaAlumnos,nombreAlumnos);          //calcula e imprime alumnos con aprobado
        System.out.println("---------------------------------------------------------");

        Practica2Funciones.notaSuspenso(numAlumnos,notaAlumnos,nombreAlumnos);          //calcula e imprime alumnos con suspenso

    }

    static void ejercicio3(){

        Scanner sc = new Scanner(System.in);
    int numeroHechizos;

    System.out.println("Introduce el número de hechizos que quieres registrar: ");
        numeroHechizos = sc.nextInt();
    String[] nombreHechizo = new String[numeroHechizos];
    String[] descripcionHechizo = new String[numeroHechizos];

        Practica2Funciones.rellenaNombre(nombreHechizo);                                    //relleno tablas. funcion de nombre filtra para no vacio.
        Practica2Funciones.rellenaDescripcion(descripcionHechizo,nombreHechizo);            // funcion de descripcion permite no introducir descripción.

        boolean programa = true;                                                                //muestro menu

        while(programa){
            System.out.println("---------------------------------------------------------");
            System.out.println("-------BIENVENIDO AL LIBRO DE HECHIZOS DE HERMIONE-------");
            System.out.println("---------------------------------------------------------");
            System.out.println("----------------- ¿Que deseas realizar?.-----------------");
            System.out.println("---------------------------------------------------------");
            System.out.println("---------------1 - Consulta de Hechizos------------------");
            System.out.println("---------------2 - Modificación de Hechizos--------------");
            System.out.println("---------------3 - Listado de todos los Hechizos---------");
            System.out.println("---------------0 - Cerrar el libro-----------------------");
            System.out.println("---------------------------------------------------------");

            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> Practica2Funciones.consultaHechizo(nombreHechizo,descripcionHechizo);
                case 2 -> Practica2Funciones.modificaHechizo(nombreHechizo, descripcionHechizo);
                case 3 -> Practica2Funciones.listaHechizo(nombreHechizo, descripcionHechizo);
                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el conjuro para leer el libro");
            }
        }
    }

    public static void main(String[] args) {

        boolean programa = true;

        while(programa){

            System.out.println("---------------------------------------------------------");
            System.out.println("Introduce el nº correspondiente del ejercicio a realizar.");
            System.out.println("1 - Ejercicio 1.");
            System.out.println("2 - Ejercicio 2.");
            System.out.println("3 - Ejercicio 3.");
            System.out.println("0 - Salir del programa");
            System.out.println("---------------------------------------------------------");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }
        }
    }
}