import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            boolean programa = true;

            while(programa){

                System.out.println("""
                                                
                            ┌──────────────────────────────────────────────┐
                            │                    MENU                      │
                            │                                              │
                            │ 1.  Ejercicios_Trimestre1                    │
                            │ 2.  Ejercicios_Trimestre2                    │
                            │ 3.  Ejercicios_Trimestre3                    │
                            │ 4.  Examen_Triemestre1                       │
                            │ 5.  Examen_Triemestre2                       │
                            │ 6.  Examen_Triemestre3 (EN CONSTRUCCIÓN)     │
                            │ 7.  Practicas                                │
                            │ 8.                                           │
                            │ 9.  Utiles                                   │
                            │                                              │
                            │ 0. SALIR                                     │
                            └──────────────────────────────────────────────┘
                        """);
                System.out.println("Introduce una opción");
                Scanner sc = new Scanner(System.in);
                int opcion = sc.nextInt();

                switch (opcion){
                    case 1 -> MenuEjerciciosTrimestre1();
                    case 2 -> MenuEjerciciosTrimestre2();
                    case 3 -> MenuEjerciciosTrimestre3();
                    case 4 -> Examenes.Examen1Trimestre.Main.main(new String[0]);
                    case 5 -> Examenes.Examen2Trimestre.Main.main(new String[0]);
                    case 6 -> System.out.println("En construcción");
                    case 7 -> MenuPracticas();
                    case 8 -> System.out.println("En construcción");
                    case 9 -> System.out.println("En construcción");
                    case 0 -> programa = false;
                    default ->
                            System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
                }
            }
    }

    private static void MenuEjerciciosTrimestre1() {
        boolean programa = true;

        while(programa){

            System.out.println("""
                                                
                            ┌──────────────────────────────────────────────┐
                            │                    MENU                      │
                            │                                              │
                            │ 1.  ArrayCuentaEnteros                       │
                            │ 2.  ArrayIntRandom                           │
                            │ 3.  ArrayRellenaPares                        │
                            │ 4.  ArraysEliminaMayores                     │
                            │ 5.  ArraysQuitaRepes                         │
                            │ 6.  Calculadora                              │
                            │ 7.  CupónOnce                                │
                            │ 8.  DecimalBinario                           │
                            │ 9.  Exponencial                              │
                            │ 10. Loteria                                  │
                            │ 11. Mapa                                     │
                            │ 12. Monitor                                  │
                            │ 13. Piramide                                 │
                            │ 14. PiramideInvertida                        │
                            │ 15. Suma2AleatoriosAdivina                   │
                            │ 16. TablaMultiplicar                         │
                            │ 17. TrianguloEquilatero                      │
                            │                                              │
                            │ 0. SALIR                                     │
                            └──────────────────────────────────────────────┘
                        """);

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> Ejercicios_Trimestre1.ArrayCuentaEnteros.main(new String[0]);
                case 2 -> Ejercicios_Trimestre1.ArrayIntRandom.main(new String[0]);
                case 3 -> Ejercicios_Trimestre1.ArrayRellenaPares.main(new String[0]);
                case 4 -> Ejercicios_Trimestre1.ArraysEliminaMayores.main(new String[0]);
                case 5 -> Ejercicios_Trimestre1.ArraysQuitaRepes.main(new String[0]);
                case 6 -> Ejercicios_Trimestre1.Calculadora.main(new String[0]);
                case 7 -> Ejercicios_Trimestre1.CuponOnce.main(new String[0]);
                case 8 -> Ejercicios_Trimestre1.DecimalBinario.main(new String[0]);
                case 9 -> Ejercicios_Trimestre1.Exponencial.main(new String[0]);
                case 10 -> Ejercicios_Trimestre1.Loteria.main(new String[0]);
                case 11 -> Ejercicios_Trimestre1.Mapa.main(new String[0]);
                case 12 -> Ejercicios_Trimestre1.Monitor.main(new String[0]);
                case 13 -> Ejercicios_Trimestre1.Piramide.main(new String[0]);
                case 14 -> Ejercicios_Trimestre1.PiramideInvertida.main(new String[0]);
                case 15 -> Ejercicios_Trimestre1.Suma2AleatoriosAdivina.main(new String[0]);
                case 16 -> Ejercicios_Trimestre1.TablaMultiplicar.main(new String[0]);
                case 17 -> Ejercicios_Trimestre1.TrianguloEquilatero.main(new String[0]);
                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }
        }
    }

    private static void MenuEjerciciosTrimestre2() {
        boolean programa = true;

        while(programa){

            System.out.println("""
                                                
                            ┌──────────────────────────────────────────────┐
                            │                    MENU                      │
                            │                                              │
                            │ 1.  Banco                                    │
                            │ 2.  HoraExacta                               │
                            │ 3.  IntrumentoPiano                          │
                            │ 4.  PersonaEmpleado                          │
                            │ 5.  Radio                                    │
                            │ 6.  Reloj                                    │
                            │ 7.  Renfe                                    │
                            │ 8.  Texto                                    │
                            │ 9.  PersonaAlumno                            │
                            │ 10.  InstrumentoPiano2                       │
                            │ 11. PilaCola                                 │
                            │ 12. Comparable                               │
                            │ 13. Comparator                               │
                            │ 14. LeerEntero                               │
                            │ 15. FileReader                               │
                            │ 16. LeerEntero                               │
                            │ 17. FileReader                               │
                            │ 18. LeeNumerosArray                          │
                            │ 19. OperacionesConFicheros                   │
                            │ 20.  BufferedReader                          │
                            │ 21.  Agenda                                  │
                            │ 22.  VinculadoXML                            │
                            │ 23.  Repaso1                                 │
                            │ 24.  Repaso2                                 │
                            │                                              │
                            │ 0. SALIR                                     │
                            └──────────────────────────────────────────────┘
                        """);

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> Ejercicios_Trimestre2.Banco.Main.main(new String[0]);
                case 2 -> Ejercicios_Trimestre2.HoraExacta.Main.main(new String[0]);
                case 3 -> Ejercicios_Trimestre2.IntrumentoPiano.Main.main(new String[0]);
                case 4 -> Ejercicios_Trimestre2.PersonaEmpleado.Main.main(new String[0]);
                case 5 -> Ejercicios_Trimestre2.Radio.Main.main(new String[0]);
                case 6 -> Ejercicios_Trimestre2.Reloj.Main.main(new String[0]);
                case 7 -> Ejercicios_Trimestre2.Renfe.Main.main(new String[0]);
                case 8 -> Ejercicios_Trimestre2.Texto.Main.main(new String[0]);
                case 9 -> Ejercicios_Trimestre2.PersonaAlumno.Main.main(new String[0]);
                case 10 -> Ejercicios_Trimestre2.InstrumentoPiano2.Main.main(new String[0]);
                case 11 -> Ejercicios_Trimestre2.PilaCola.Main.main(new String[0]);
                case 12 -> Ejercicios_Trimestre2.Comparable.Main.main(new String[0]);
                case 13 -> Ejercicios_Trimestre2.Comparator.Main.main(new String[0]);
                case 14 -> Ejercicios_Trimestre2.LeerEntero.Main.main(new String[0]);
                case 15 -> Ejercicios_Trimestre2.FileReader.Main.main(new String[0]);
                case 16 -> Ejercicios_Trimestre2.LeerEntero.Main.main(new String[0]);
                case 17 -> Ejercicios_Trimestre2.FileReader.Main.main(new String[0]);
                case 18 -> Ejercicios_Trimestre2.LeeNumerosArray.Main.main(new String[0]);
                case 19 -> Ejercicios_Trimestre2.OperacionesConFicheros.Main.main(new String[0]);
                case 20 -> Ejercicios_Trimestre2.BufferedWriter.Main.main(new String[0]);
                case 21 -> Ejercicios_Trimestre2.Agenda.Main.main(new String[0]);
                case 22 -> Ejercicios_Trimestre2.VinculadoXML.Main.main(new String[0]);
                case 23 -> Ejercicios_Trimestre2.Repaso1.Main.main(new String[0]);
                case 24 -> Ejercicios_Trimestre2.Repaso2.Main.main(new String[0]);

                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }
        }
    }

    private static void MenuEjerciciosTrimestre3() {
        boolean programa = true;

        while(programa){

            System.out.println("""
                                                
                            ┌──────────────────────────────────────────────┐
                            │                    MENU                      │
                            │                                              │
                            │ 1.  Binario1                                 │
                            │ 2.  Binario2                                 │
                            │                                              │
                            │ 0. SALIR                                     │
                            └──────────────────────────────────────────────┘
                        """);

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> Ejercicios_Trimestre3.Binario1.Main.main(new String[0]);
                case 2 -> Ejercicios_Trimestre3.Binario2.Main.main(new String[0]);
                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }
        }
    }



    private static void MenuPracticas() {
        boolean programa = true;

        while(programa){

            System.out.println("""
                                                
                            ┌──────────────────────────────────────────────┐
                            │                    MENU                      │
                            │                                              │
                            │ 1.  Practica1                                │
                            │ 2.  Practica2                                │
                            │ 3.  Practica3                                │
                            │ 0. SALIR                                     │
                            └──────────────────────────────────────────────┘
                        """);

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> Practicas.Practica1.Main.main(new String[0]);
                case 2 -> Practicas.Practica2.Main.main(new String[0]);
                case 3 -> Practicas.Practica3.Main.main(new String[0]);
                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }
        }
    }
}