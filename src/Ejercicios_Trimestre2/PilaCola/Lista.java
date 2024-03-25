package Ejercicios_Trimestre2.PilaCola;

import java.util.Arrays;

public class Lista implements Cola,Pila{

    Integer[] listaNumeros;

    public Lista() {
        listaNumeros = new Integer[0];
    }

    public Integer[] getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(Integer[] listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    Integer contarElementos() {
        return listaNumeros.length;
    }

    void insertarFinal(Integer nuevo){
        listaNumeros = Arrays.copyOf(listaNumeros, listaNumeros.length+1);
        listaNumeros[listaNumeros.length-1] = nuevo;
    }

    void insertarPrincipio(Integer nuevo){
        listaNumeros = Arrays.copyOf(listaNumeros, listaNumeros.length+1);

        System.arraycopy(listaNumeros,0,listaNumeros,1,listaNumeros.length-1);
        listaNumeros[0] = nuevo;


//        for (int i = 0; i < listaNumeros.length-1; i++) {
//        listaNumeros[i+1] = listaNumeros[i];
//        }
//        listaNumeros[0] = nuevo;
    }

    void insertarEnPosicion(Integer nuevo,Integer posicion){
        listaNumeros = Arrays.copyOf(listaNumeros, listaNumeros.length+1);
        System.arraycopy(listaNumeros,posicion,listaNumeros,posicion+1,listaNumeros.length-posicion-1);
            listaNumeros[posicion] = nuevo;
        }

    void copiarListaAlFinal(Integer[]nuevo){

      int  auxlong = listaNumeros.length;
      listaNumeros = Arrays.copyOf(listaNumeros,(listaNumeros.length+nuevo.length));
      System.arraycopy(nuevo,0,listaNumeros,auxlong,nuevo.length);
    }

    void eliminaIndice(Integer indiceEliminar){
        System.arraycopy(listaNumeros,indiceEliminar+1,listaNumeros,indiceEliminar,(listaNumeros.length-indiceEliminar-1));
        listaNumeros = Arrays.copyOf(listaNumeros, listaNumeros.length-1);
    }

    void obtenerElemento(Integer indice){

        for (int i = 0; i < listaNumeros.length; i++) {
            if (indice == i){
                System.out.println(listaNumeros[i]);
            }
        }
    }


    int buscaNumero(Integer numero){
        int indice = -1;

        for (int i = 0; i < listaNumeros.length; i++) {
            if (numero.equals(listaNumeros[i])){
                System.out.println("El indice donde se encuentra " + numero + " es " + i);
                indice = i;
                break;
            }
        }

        return indice;
    }

    void mostrarElementos(){

        System.out.print("[ ");

        for (int i = 0; i < listaNumeros.length-1; i++) {
            System.out.print(listaNumeros[i] + ", ");
        }
        System.out.print(listaNumeros[listaNumeros.length-1]);
        System.out.println(" ]");
    }


    @Override
    public void encolar(Integer nuevo) {insertarFinal(nuevo);}

    @Override
    public void desencolar() {eliminaIndice(0);}

    @Override
    public void apilar(Integer nuevo) {insertarFinal(nuevo);}

    @Override
    public void desapilar() {eliminaIndice(listaNumeros.length-1);}


}