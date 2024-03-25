package Ejercicios_Trimestre2.PilaCola;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean menu = false;
        Lista lista = new Lista();

        Cola colita = new Cola() {
            int[] listaNumeros = new int[0];
            @Override
            public void encolar(Integer nuevo) {
                Scanner sc = new Scanner(System.in);
                int aux = 0;
                int nuevonumero = 0;

                while(nuevo >= 0 && nuevonumero >= 0){
                    if(aux == 0) {
                        listaNumeros = Arrays.copyOf(listaNumeros, listaNumeros.length + 1);
                        listaNumeros[listaNumeros.length - 1] = nuevo;
                        aux++;
                    }else {
                        System.out.println("Introduce nuevo valor. Introduce negativo para salir");
                        nuevonumero = sc.nextInt();
                        if(nuevonumero >= 0){
                        listaNumeros = Arrays.copyOf(listaNumeros, listaNumeros.length + 1);
                        listaNumeros[listaNumeros.length - 1] = nuevonumero;
                        }else{break;}
                    }
                }

                System.out.println(Arrays.toString(listaNumeros));
            }

            @Override
            public void desencolar() {
                do {
                    System.out.println(listaNumeros[0]);
                    System.arraycopy(listaNumeros, 1, listaNumeros, 0, (listaNumeros.length - 1));
                    listaNumeros = Arrays.copyOf(listaNumeros, listaNumeros.length - 1);
                }while(listaNumeros.length >=1);
                System.out.println("Todos los elementos se han desencolado");
            }
        };








        while(!menu) {
            System.out.println("""
                MENU
                1. Añadir al final.
                2. Añadir final.
                3. Insertar en posición.
                4. Colita encolar.
                5. Colita desencolar.
                6. Colita encolarmultiple.
                7. Busca número.
                8.
                0. SALIR
                """);

            System.out.println("Introduce acción a realizar");
            opcion = sc.nextInt();
            Scanner sc2 = new Scanner(System.in);

            switch (opcion){

            case 1 ->{
                System.out.println("Introduce número para añadir al final");
                Integer nuevo = sc2.nextInt();
                lista.insertarFinal(nuevo);}
            case 2 ->{
                System.out.println("Introduce número para añadir al principio");
                Integer nuevo = sc2.nextInt();
                lista.insertarPrincipio(nuevo);}
            case 3 ->{
                System.out.println("Introduce número para añadir");
                Integer nuevo = sc2.nextInt();
                System.out.println("Introduce posición");
                Integer posicion = sc2.nextInt();
                lista.insertarEnPosicion(nuevo, posicion);
            }
            case 4 -> {
                System.out.println("Introduce valor para añadir a la cola. Introduce negativo para salir");
                Integer nuevo = sc2.nextInt();
                colita.encolar(nuevo);
            }
            case 5 ->colita.desencolar();
            case 6 -> {

                System.out.println("Introduce valor para añadir");
                Integer nuevo = sc2.nextInt();
                System.out.println("Introduce repeticiones");
                int repeticiones = sc2.nextInt();

                lista.encolarmultiple(nuevo,repeticiones);
                lista.mostrarElementos();
            }
//            case 7 ->
//            case 8 ->


            case 0 -> menu = true;
            default-> System.out.println("Introduce opción válida");


            }


        }





    }
}