package Practicas.Practica3.Ejercicio3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        int opcion;
        String nombre;
        Personaje persona = null;               // inicio a null y según cambie de rol, le asigno la clase correspondiente.

        boolean personajeCreado = false;        //para bloquear opciones si aún no se ha creado el personaje


        while (menu) {

            System.out.println("""
                    ------ 🐉LIKE A DRAGON🐉 ------
                    -------------------------
                    1. Crear Personaje.
                    2. Subir nivel.
                    3. Cambiar clase.
                    4. Mostrar información
                    0. SALIR
                    -------------------------
                    """);
            System.out.println("Seleccione una opción");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1 -> {
                    Scanner scnombre = new Scanner(System.in);      // otro scaner para evitar bug de scanner con el nextline
                    System.out.println("Introduce nombre para su Personaje.");
                    nombre = scnombre.nextLine();

                    System.out.println("""
                            ------ 🐉LIKE A DRAGON🐉 ------
                            -------------------------
                            ELIJA LA CLASE
                            1. Guerrero
                            2. Mago
                            3. Defensor
                            4. Vagabundo
                            -------------------------
                            """);

                    int opcion2 = sc.nextInt();
                    switch (opcion2) {
                       case 1-> {persona = new Guerrero(nombre);
                                 personajeCreado = true;
                                 System.out.println(nombre + " es de la clase Guerrero!!");
                       }
                       case 2 -> {persona = new Mago(nombre);
                                 personajeCreado = true;
                                 System.out.println(nombre + " es de la clase Mago!!");

                       }
                       case 3 -> {persona = new Defensor(nombre);
                                 personajeCreado = true;
                                 System.out.println(nombre + " es de la clase Defensor!!");
                       }
                        case 4 -> {persona = new Vagabundo(nombre);
                            personajeCreado = true;
                            System.out.println(nombre + " es de la clase Vagabundo!!");
                        }
                    }
                }

                case 2 -> {
                    if (personajeCreado) {persona.subirDeNivel();
                    } else System.out.println("Debe crear un personaje.");
                }

                case 3 -> {
                    if (personajeCreado) {persona = persona.cambioDeClase();
                    } else System.out.println("Debe crear un personaje.");
                }

                case 4 -> {
                    if (personajeCreado) {persona.mostrarInformacion();
                    } else System.out.println("Debe crear un personaje.");
                }

                case 0 -> menu = false;

            }
        }
    }
}

