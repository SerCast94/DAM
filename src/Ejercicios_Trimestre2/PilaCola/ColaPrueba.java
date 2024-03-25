package Ejercicios_Trimestre2.PilaCola;

import java.util.Arrays;
import java.util.Scanner;

public class ColaPrueba {

    Integer [] colaNumeros;

    public ColaPrueba(Integer[] colaNumeros) {
        colaNumeros = new Integer[0];
        this.colaNumeros = colaNumeros;
    }

    public Integer[] getColaNumeros() {
        return colaNumeros;
    }

    public void setColaNumeros(Integer[] colaNumeros) {
        this.colaNumeros = colaNumeros;
    }

    void encolar(Integer nuevo){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca valor para añadir a la cola");
            System.out.println("Introduzca negativo si no quiere introducir más números");
            nuevo = sc.nextInt();
            if(nuevo < 0){
                break;
            }else {
            colaNumeros = Arrays.copyOf(colaNumeros, colaNumeros.length + 1);
            colaNumeros[colaNumeros.length - 1] = nuevo;
             }
        }while(nuevo >= 0);
    }


    int obtenerSiguienteEnCola(){
        return colaNumeros[0];
    }

    void desencolar(){
        System.arraycopy(colaNumeros,1,colaNumeros,0,colaNumeros.length-1);

        colaNumeros = Arrays.copyOf(colaNumeros, colaNumeros.length-1);


    }
}