package Practicas.Practica2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Practica2Funciones {

    public static String palabraSecreta() {                                                                                 // elige una palabra al azar de la lista
        String[] tablaSecreta = {"perro", "gato", "botella", "monitor", "altavoz", "cucaracha", "almanaque", "pizarra",
                "calefactor"};
        int numpalabra = (int) (Math.random()*7);

        return tablaSecreta[numpalabra];
    }

    public static char StringAChar(char[]letrasProbadas) {                                                                                       //cambia el String a un char
        Scanner sc = new Scanner(System.in);
        String letra;

        do {
            System.out.println("Introduce una letra");
            letra = sc.nextLine().toLowerCase();                                                                                              // transforma el input a letras minúsculas
        }while(letra.isEmpty());                                                                                                              // comprueba que el input no esté vacio

        for (char letrasProbada : letrasProbadas) {                                                                             // for each, sustituido por ide

            while (letra.length() != 1 || !letra.matches("[a-z]") || letra.indexOf(letrasProbada) == 0) {                // filtro para longitud 1 o .matches negado para que solo admita letras de a-z o letras repetidas si devuelve numero positivo, está en la lista.

                do {
                    System.out.println("Introduce solo 1 letra minúscula, tampoco números y no repitas letras.");
                    letra = sc.nextLine().toLowerCase();
                } while (letra.isEmpty());

            }
        }

        return letra.toCharArray()[0];
    }

    public static int comprueba (char letra,char[]pSArray,char[]palabraAdivinar,int fallos){

    boolean acierto = false;
    for (int i = 0; i < pSArray.length; i++) {

        if (pSArray[i] == letra) {                      // si encuentra la letra, suma letra y cambia boleano a acierto para que no entre en la condicion del fallo
            palabraAdivinar[i] = letra;
            System.out.println("Ha encontrado una letra");
            System.out.println(palabraAdivinar);
            acierto=true;

        }
    }

    if(!acierto) {
        System.out.println("Ha fallado");                   //si no cambia a acierto, suma fallo
        fallos++;
        System.out.println("Tiene " + fallos + "/5 fallos");
        System.out.println(palabraAdivinar);
    }

    if(Arrays.equals(pSArray,palabraAdivinar)) {        //si PsArray es igual que la palabra a adivinar, devuelve -1 para luego imprimir victoria
        fallos = -1;
    }

    return fallos;
}




    public static void datosAlumnos(String[] nombreAlumnos, int[] edadAlumnos, double[] notaAlumnos, int numAlumnos){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        for (int i = 0; i < numAlumnos; i++) {          //relleno las tablas con los datos

            do{
                System.out.println("Introduce el nombre del alumno número " + (i + 1));
                nombreAlumnos[i] = sc.next();
            }while(!nombreAlumnos[i].matches("[a-zA-Z]+"));                         //filtra para que el nombre solo sean letras minusculas o mayusculas

            do {                                                                           //edad entre 0 y 100
                System.out.println("Introduce la edad del alumno número " + (i + 1));
                edadAlumnos[i] = sc.nextInt();
            }while(edadAlumnos[i]<0 || edadAlumnos[i]>100);

            do {
                System.out.println("Introduce la nota del alumno número " + (i+1));
                notaAlumnos[i] = sc.nextDouble();
            }while(notaAlumnos[i] < 0 || notaAlumnos[i] > 10);                              // notas validas entre 0-10
        }

        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("El alumno " + nombreAlumnos[i] + " con edad de " + edadAlumnos[i] + " años. Tiene una nota de " + notaAlumnos[i] + ".");   //info general de todos los alumnos
        }


    }


    public static double calcularMedia(double[] notaAlumnos,int numAlumnos ,double media){ //calcula y devuelve la media
        for (int i = 0; i < numAlumnos; i++) {
            media += notaAlumnos[i];
        }
        media = media/numAlumnos;
        System.out.println("la media es " + media);

        return media;
    }

    public static void notaMedia(int numAlumnos, double media, double[] notaAlumnos, String[] nombreAlumnos) {  //muestra alumnos con nota superior a la media
        System.out.println("Alumnos con nota superior a la media son: ");
        for (int i = 0; i < numAlumnos; i++) {
            if (media <= notaAlumnos[i]) {
                System.out.println(nombreAlumnos[i]);
            }

        }
    }

    public static void notaSobresaliente(int numAlumnos, double[] notaAlumnos, String[] nombreAlumnos) {        //muestra alumnos con nota sobresaliente
        System.out.println("Los alumnos con sobresaliente son: ");
        for (int i = 0; i < numAlumnos; i++) {
            if (notaAlumnos[i]>=9 && notaAlumnos[i] <=10){
                System.out.println(nombreAlumnos[i]);
            }
        }
    }


    public static void notaNotable(int numAlumnos, double[] notaAlumnos, String[] nombreAlumnos) {          //muestra alumnos con nota notable
        System.out.println("Los alumnos con notable son: ");
        for (int i = 0; i < numAlumnos; i++) {
            if (notaAlumnos[i] >= 7 && notaAlumnos[i] <= 8.99) {
                System.out.println(nombreAlumnos[i]);
            }
        }
    }
    public static void notaAprobado(int numAlumnos, double[] notaAlumnos, String[] nombreAlumnos) {         //muestra alumnos con nota aprobado
            System.out.println("Los alumnos con aprobado son: ");

        for (int i = 0; i < numAlumnos; i++) {
            if (notaAlumnos[i]>=5 && notaAlumnos[i] <=6.99){
                System.out.println(nombreAlumnos[i]);
            }
        }
    }

    public static void notaSuspenso(int numAlumnos, double[] notaAlumnos, String[] nombreAlumnos) {         //muestra alumnos con nota suspenso
        System.out.println("Los alumnos con suspenso son: ");
        for (int i = 0; i < numAlumnos; i++) {
            if (notaAlumnos[i] >= 0 && notaAlumnos[i] <= 4.99) {
                System.out.println(nombreAlumnos[i]);
            }
        }
    }









static public void rellenaNombre(String[] tabla){                                   //rellena array de nombre hechizo
        Scanner sc = new Scanner(System.in);
    for (int i = 0; i < tabla.length; i++) {
        do {
            System.out.println("Introduce el nombre del Hechizo nº " + (i + 1) + ".");
            tabla[i] = sc.nextLine();
        }while(tabla[i].isEmpty());                                                 //No hago la misma función para nombre y descripción
    }                                                                               //porque el nombre no lo quiero vacío y la descripción sí
}                                                                                   //para poder aplicar un filtro de descripción vacía.


    static public void rellenaDescripcion(String[] tabla, String[] nombre){         //rellena array de descripción
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Introduce la descripción del Hechizo "+ nombre[i] + ".");
            tabla[i] = sc.nextLine();
        }
    }


    static public void consultaHechizo(String[] nombreHechizo,String[] descripcionHechizo){         //muestra hechizo si hay un hechizo que contenga la cadena introducida
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Hechizo que quieres consultar: ");
        String hechizo = sc.nextLine();

        boolean noEncontrado= true;

        for (int i = 0; i < nombreHechizo.length; i++) {
           if(nombreHechizo[i].contains(hechizo)){
               noEncontrado=false;
                System.out.println("Hechizo encontrado.");
                System.out.println("Nombre del Hechizo: " + nombreHechizo[i]);
                System.out.println("Descripción del Hechizo: " + descripcionHechizo[i]);
           }
        }

        if(noEncontrado){
            System.out.println("No se ha encontrado el Hechizo");
        }
    }


    static public void modificaHechizo(String[] nombreHechizo,String[] descripcionHechizo){     //busca hechizo que contenga la cadena introducida y sobreescribe su descripción
        Scanner sc = new Scanner(System.in);

        boolean noEncontrado = true;
        System.out.println("Introduce el nombre del Hechizo que quieres modificar: ");
        String hechizo = sc.nextLine();

        for (int i = 0; i < nombreHechizo.length; i++) {
            if (nombreHechizo[i].contains(hechizo)) {
                noEncontrado = false;
                System.out.println("Hechizo encontrado.");
                System.out.println("Nombre del Hechizo: " + nombreHechizo[i]);
                System.out.println("Descripción del Hechizo: " + descripcionHechizo[i]);
                System.out.println("Introduce una nueva descripción");
                descripcionHechizo[i] = sc.nextLine();
                System.out.println("La nueva descripción es: " + descripcionHechizo[i]);
            }
        }

        if(noEncontrado){
            System.out.println("Hechizo no encontrado.");
        }
    }



    public static void listaHechizo(String[] nombreHechizo, String[]descripcionHechizo){            //muestra menu de filtros con un switch

        boolean programa = true;
        while(programa){

        System.out.println("--------------------------------------------------------");
        System.out.println("-------¿Que filtro quiere utilizar?---------------------");
        System.out.println("-------1. Nombre descendente----------------------------");
        System.out.println("-------2. Nombre ascendente-----------------------------");
        System.out.println("-------3. Buscar por palabra en la descripción----------");
        System.out.println("-------4. Mostrar los Hechizos sin descripción----------");
        System.out.println("-------5. Mostrar los Hechizos con descripción----------");
        System.out.println("-------6. Mostrar los que empiezen por una letra--------");
        System.out.println("-------7. Mostrar todos los Hechizos--------------------");
        System.out.println("-------0. Volver a la página anerior--------------------");
        System.out.println("--------------------------------------------------------");


            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> nombreDescendente(nombreHechizo, descripcionHechizo);
                case 2 -> nombreAscendente(nombreHechizo, descripcionHechizo);
                case 3 -> palabraDescripcion(nombreHechizo, descripcionHechizo);
                case 4 -> noDescripcion(nombreHechizo, descripcionHechizo);
                case 5 -> siDescripcion(nombreHechizo, descripcionHechizo);
                case 6 -> empiezaLetra(nombreHechizo, descripcionHechizo);
                case 7 -> mostrarTodos(nombreHechizo, descripcionHechizo);
                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma filtrar, por favor prueba de nuevo.");
            }

        }
    }

    public static void nombreDescendente(String[] nombreHechizo, String[]descripcionHechizo){                                       //ordena el array por orden alfabetico y lo muestra. Es void, asi no altera la relacion entre tablas
        String[] nombreCopiado;
        nombreCopiado = Arrays.copyOf(nombreHechizo, nombreHechizo.length);

        System.out.println("A continuación se mostrarán los Hechizos de forma Descendente");
        Arrays.sort(nombreCopiado);

        for (int i = 0; i < nombreHechizo.length; i++) {
            System.out.println("Nombre del Hechizo: " + nombreCopiado[i]);
            for (int j = 0; j < nombreCopiado.length; j++) {
                if(nombreHechizo[j].equals(nombreCopiado[i])){
                    System.out.println("Descripción del Hechizo: " + descripcionHechizo[j]);
                }
            }
        }
        nombreCopiado = Arrays.copyOf(nombreHechizo,nombreHechizo.length);
    }

    public static void nombreAscendente(String[] nombreHechizo, String[] descripcionHechizo){                                        //ordena el array por orden alfabetico y hago un fori inverso para empezar desde el final hasta el principio
        String[] nombreCopiado;
        nombreCopiado = Arrays.copyOf(nombreHechizo, nombreHechizo.length);

        System.out.println("A continuación se mostrarán los Hechizos de forma Ascendente");
        Arrays.sort(nombreCopiado);

        for (int i = nombreHechizo.length; i > 0; i--) {
            System.out.println("Nombre del Hechizo: " + nombreCopiado[i-1]);
            for (int j = 0; j < nombreCopiado.length; j++) {
                if(nombreHechizo[j].equals(nombreCopiado[i-1])){
                    System.out.println("Descripción del Hechizo: " + descripcionHechizo[j]);
                }
            }
        }
        nombreCopiado = Arrays.copyOf(nombreHechizo,nombreHechizo.length);
    }

    public static void palabraDescripcion(String[] nombreHechizo, String[]descripcionHechizo){          //busca en el array de descripcion si hay alguno que contenga la cadena introducida.
        Scanner sc = new Scanner(System.in);
        boolean noEncontrado = true;
        System.out.println("Introduce una palabra para buscar en la descripción ");
        String descricion = sc.nextLine();

        for (int i = 0; i < nombreHechizo.length; i++) {
            if (descripcionHechizo[i].contains(descricion)) {
                noEncontrado = false;
                System.out.println("Descripción encontrado.");
                System.out.println("Nombre del Hechizo: " + nombreHechizo[i]);
                System.out.println("Descripción del Hechizo: " + descripcionHechizo[i]);
                System.out.println("--------------------------------------------------------");
            }
        }
        if(noEncontrado){
            System.out.println("Hechizo no encontrado.");
        }

    }

    public static void noDescripcion(String[] nombreHechizo, String[]descripcionHechizo){       //muestra los hechizos los hechizos que en la cadena de descripcion esten vacios.
        System.out.println("Buscando Hechizos sin descripción");
        for (int i = 0; i < nombreHechizo.length; i++) {
            if (descripcionHechizo[i].isEmpty()){
                System.out.println("Hechizo sin descripción encontrado.");
                System.out.println("Nombre del Hechizo: " + nombreHechizo[i]);
            }
        }
    }

    public static void siDescripcion(String[] nombreHechizo, String[]descripcionHechizo){       //muestra los hechizos que la cadena de descripcion no este vacio
        System.out.println("Buscando Hechizos con descripción");
        for (int i = 0; i < nombreHechizo.length; i++) {
            if (!descripcionHechizo[i].isEmpty()){
                System.out.println("Hechizo con descripción encontrado.");
                System.out.println("Nombre del Hechizo: " + nombreHechizo[i]);
                System.out.println("Descripción del Hechizo: " + descripcionHechizo[i]);
                System.out.println("--------------------------------------------------------");
            }
        }

    }

    public static void empiezaLetra(String[] nombreHechizo, String[]descripcionHechizo){                         //pido letra y filtro longitud 1 y caracteres de a-z
       Scanner sc = new Scanner(System.in);                                                                      //hago minuscula para facilitar comparacion
       String letra;                                                                                             //si encuentra que empieza con lo introducido, muestra nombre y descripcion del hechizo

        do {
            System.out.println("Introduce la 1 letra para buscar Hechizos que empiecen por ella.");
            letra = sc.nextLine().toLowerCase();
        }while(letra.length() != 1 && !letra.matches("a-z"));

        System.out.println("A continuación los Hechizos con la letra " + letra);

        for (int i = 0; i < nombreHechizo.length; i++) {
            if(nombreHechizo[i].toLowerCase().startsWith(letra)){
                System.out.println("Nombre del Hechizo: " + nombreHechizo[i]);
                System.out.println("Descripción del Hechizo: " + descripcionHechizo[i]);
            }
        }

    }

    public static void mostrarTodos(String[] nombreHechizo, String[] descripcionHechizo){                       //muestra todos los hechizos. opción para comprobar que no se altera la relación
        System.out.println("Se mostrarán todos los hechizos");                                                  //entre la tabla de hechizos y la de descripción.
        for (int i = 0; i < nombreHechizo.length; i++) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Nombre del Hechizo: " + nombreHechizo[i]);
            System.out.println("Descripción del Hechizo: " + descripcionHechizo[i]);
        }
    }

}