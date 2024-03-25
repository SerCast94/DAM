package Practicas.Practica1;

import java.util.Scanner;
import java.lang.Math;
class PracticaSergioCastilloMolina {

    static void ejercicio1(){
        System.out.println("Introduce un número entero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println(digitosTotales(numero,1));
        System.out.println("El número introducido tiene: " + contarCifra(numero) + " cifras.");
    }

    public static int digitosTotales(int numero, int conteo) {
        if (numero > 0) {
            digitosTotales(numero / 10, conteo+1); //divide numero entre 10 para quitar una cifra y aumenta contador de cifras
            System.out.println("Digito " + conteo + "---->" + numero % 10);
        }
        return numero;
    }

    public static int contarCifra(int numero) {
        int cifras = 0;
        if (numero == 0) {
            cifras = 1;  // el numero 0 es de 1 cifra
        } else {
            for (int i = Math.abs(numero); i > 0; i /= 10) { // divido entre 10 hasta que llegue a 0
                cifras++;
            }
        }
        return cifras;
    }

    static void ejercicio2(){
        int tropas1 = tropas(); //asigna tropas a Stark
        int tropas2 = tropas(); //asigna tropas a Lanister
        System.out.println("Ejercito Stark tiene: " + tropas1 + " tropas");
        System.out.println("Ejercito Lanister tiene: " + tropas2 + " tropas");
        int ronda = 0;

        while(tropas1 > 0 && tropas2 > 0) { // batalla hasta que alguno de los dos tenga 0 tropas

            ronda++;
            System.out.println("<-------------------------->");
            System.out.println("EMPIEZA LA RONDA " + ronda);

            int tropas1Enviadas = tropasEnviadas(tropas1); //calculo de tropas enviadas desde 1 hasta el maximo de tropas disponibles por Stark
            int tropas2Enviadas =  tropasEnviadas(tropas2); //calculo de tropas enviadas desde 1 hasta el maximo de tropas disponibles por Lanister

            System.out.println("El ejercito Stark envía: " + tropas1Enviadas + " tropas");
            System.out.println("El ejercito Lanister envía: " + tropas2Enviadas + " tropas");

            int perdida1 = guerra (tropas2Enviadas, tropas1); //pierde tropas desde 0 hasta el numero de tropas enviado por el otro ejercito y evita que sea mayor que las tropas actuales para que no de negativo
            tropas1 = tropas1-perdida1; // actualiza las tropas disponibles tras la batalla
            System.out.println("<-------------------------->");
            System.out.println("El ejercito Stark pierde: " + perdida1 + " tropas");
            System.out.println("El ejercito Stark tiene: " + tropas1 + " tropas restantes");

            int perdida2 = guerra (tropas1Enviadas, tropas2);  //pierde tropas desde 0 hasta el numero de tropas enviado por el otro ejercito y evita que sea mayor que las tropas actuales para que no de negativo
            tropas2 = tropas2-perdida2; // actualiza las tropas disponibles tras la batalla
            System.out.println("<-------------------------->");
            System.out.println("El ejercito Lanister pierde: " + perdida2 + " tropas");
            System.out.println("El ejercito Lanister tiene: " + tropas2 + " tropas restantes");
        }
        if (tropas1 <= 0 && tropas2 <= 0) { // cajón de sastre por si ambos quedan a 0 o menos.
            System.out.println("<-------------------------->");
            System.out.println("Gana el señor de la noche");
        } else if (tropas1 <= 0) { // Stark a 0, por lo que gana Lanister
            System.out.println("<-------------------------->");
            System.out.println("La Casa Lannister ha ganado la guerra y ha reclamado el Trono de Hierro.");
        } else { // en cualquier otro caso, es decir que Lanister quede a 0, gana Stark.
            System.out.println("<-------------------------->");
            System.out.println("La Casa Stark ha ganado la guerra y ha reclamado el Trono de Hierro.");
        }
    }

    public static int tropas() {
        return (int) (Math.random() * 91) + 10; //genera soldados entre 10 y 100
    }

    public static int tropasEnviadas(int tropasejercito) {
        return (int) (Math.random() * tropasejercito) + 1;  //calculo de tropas enviadas desde 1 hasta el maximo de tropas disponibles
    }
    public static int guerra (int tropasGuerra, int tropas){ //tropas perdidas desde 0 hasta el numero de tropas enviado por el otro ejercito y evita que sea mayor que las tropas actuales para que no de negativo
        return (int) Math.min((Math.random() * tropasGuerra), tropas);
    }

    static void ejercicio3(){
        boolean programa = true;
        while(programa){

            System.out.println("---------------------------------------------------------");
            System.out.println("Que operación quieres realizar?.");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta.");
            System.out.println("3 - Multiplicación.");
            System.out.println("4 - División");
            System.out.println("5 - Potenciación.");
            System.out.println("6 - Algoritmo de Euclides.");
            System.out.println("0 - Salir del programa");
            System.out.println("---------------------------------------------------------");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            switch (opcion){ //selector de operación
                case 1 -> suma();
                case 2 -> resta();
                case 3 -> elegirmultiplicacion();
                case 4 -> division();
                case 5 -> potenciacion();
                case 6 -> {System.out.println("Introduce 2 numero para buscar el mínimo comun divisor con el algoritmo de Euclides");
                    int numero1 = sc.nextInt();
                    int numero2 = sc.nextInt();
                    System.out.println("El mínimo común multiplo es: " + euclides(numero1, numero2));
                }
                case 0 -> programa = false;
                default ->
                        System.out.println("Introduce un número valido para realizar una operación, por favor prueba de nuevo.");
            }
        }
    }
    static void suma(){ //pide 2 numero y devuelve suma
        System.out.println("Introduzca dos números para sumar");
        Scanner sc = new Scanner(System.in);
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        System.out.println("El resultado es: " + (numero1+numero2));
    }
    static void resta(){//pide 2 numero y devuelve resta
        System.out.println("Introduzca dos números para restar");
        Scanner sc = new Scanner(System.in);
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        System.out.println("el resultado es: " + (numero1-numero2));
    }
    static void elegirmultiplicacion() { //selector de multiplicacion de 2 o 3 cifras
        int eleccion;
        do {                            // do while para que solo acepte 2 o 3
            System.out.println("¿Quieres multiplicar 2 o 3 números?");
            Scanner sc = new Scanner(System.in);
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 2 -> {
                    System.out.println("Introduzca números a multiplicar"); //pregunta 2 cifras y pasa valores a funcion
                    double numero1 = sc.nextDouble();
                    double numero2 = sc.nextDouble();
                    multiplicacion(numero1, numero2);
                }
                case 3 -> {
                    System.out.println("Introduzca números a multiplicar"); //pregunta 3 cifras y pasa valores a funcion
                    double numero1 = sc.nextDouble();
                    double numero2 = sc.nextDouble();
                    double numero3 = sc.nextDouble();
                    multiplicacion(numero1, numero2, numero3);
                }
                default -> System.out.println("Introduce un número valido para realizar una operación, por favor prueba de nuevo.");
            }
        } while (eleccion != 2 & eleccion != 3); //condicion para solo aceptar numero 2 y 3
    }
    static void multiplicacion(double numero1, double numero2){  //recoge dos cifras, las multiplica y devuelve
        System.out.println("El resultado es: " + (numero1*numero2));
    }
    static void multiplicacion(double numero1, double numero2, double numero3){ //recoge tres cifras, las multiplica y devuelve
        System.out.println("El resultado es: " + (numero1*numero2*numero3));
    }
    static void division(){ //recoge 2 cifras las divide y las imprime en pantalla
        System.out.println("Introduzca dos números para dividir");
        Scanner sc = new Scanner(System.in);
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        System.out.println("El resultado es: " + (numero1/numero2));
    }
    static void potenciacion(){ //pregunta 2 cifras y realiza la potencia con math.pow e imprime resultado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número para la base");
        double numero1 = sc.nextDouble();
        System.out.println("Introduzca un número para la potencia");
        double numero2 = sc.nextDouble();
        System.out.println("El resultado es: " + (Math.pow(numero1,numero2)));
    }
    static int euclides(int numero1, int numero2){ //recoge dos numero, comprueba que no sean 0 y realiza funcion recursiva
        if (numero2==0){
            return numero1;
        }
        else{ return euclides(numero2, numero1%numero2);
        }
    }

    static void pasarBinario(){
        int numero, exp, digito;
        double binario;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Introduce un numero entero: ");
            numero = sc.nextInt();
        }while(numero < 0);
        exp=0;
        binario=0;
        while(numero!=0){
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
    }
static void sumaAleatoria(){
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
    public static void main(String[] args) {

        boolean programa = true;

        while(programa){

            System.out.println("---------------------------------------------------------");
            System.out.println("Introduce el nº correspondiente del ejercicio a realizar.");
            System.out.println("1 - Ejercicio 1.");
            System.out.println("2 - Ejercicio 2.");
            System.out.println("3 - Ejercicio 3.");
            System.out.println("4 - Ejercicio ampliacion pasa número entero a binario.");
            System.out.println("5 - Ejercicio ampliacion acertar suma de numeros aleatorios.");
            System.out.println("0 - Salir del programa");
            System.out.println("---------------------------------------------------------");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> pasarBinario();
                case 5 -> sumaAleatoria();
                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }
        }
    }
}