package Ejercicios_Trimestre2.Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean programa = true;
        Agenda agenda = new Agenda();


        while (programa) {

            System.out.println("""           
                        ┌──────────────────────────────────────────────┐
                        │                    MENU                      │
                        │                                              │
                        │ 1.  Nuevo contacto                           │
                        │ 2.  Buscar por nombre                        │
                        │ 3.  Mostrar todos                            │
                        │ 4.  Cerrar agenda                            │
                        │ 5.  Cargar agenda                            │
                        │ 0. SALIR                                     │
                        └──────────────────────────────────────────────┘
                    """);
            System.out.println("Introduce una opción");
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> agenda.nuevoContacto();
                case 2 -> agenda.buscarNombre();
                case 3 -> agenda.mostrarTodos();
                case 4 -> agenda.cerrar();
                case 5 -> agenda.cargar();
                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }
        }
    }
}