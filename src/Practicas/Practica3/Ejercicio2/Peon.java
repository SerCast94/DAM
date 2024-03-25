package Practicas.Practica3.Ejercicio2;
public class Peon extends Pieza{

    public Peon(int filaActual, int columnaActual, boolean derrotada) {
        super(filaActual, columnaActual, derrotada);
    }

    @Override
    void movimiento(int filaDestino, int columnaDestino) {

        // considero que las fichas blancas juegan en la parte baja y las negras en la parte de arriba.
        // por otra parte considero que siempre es el primer movimiento, por eso permito que se muevan 1 o 2 casillas.

        if(this.color.color.equals("Blanco")){
            if(columnaDestino == getColumnaActual() && filaDestino <= 7 && filaDestino == getFilaActual()+1  ||
                    columnaDestino == getColumnaActual() && filaDestino <= 7 && filaDestino == getFilaActual()+2){
                setFilaActual(filaDestino);
                System.out.println("La ficha se movió a la fila " + getFilaActual() + ", columna " + getColumnaActual() );
            }else System.out.println("Movimiento no válido.");
        }

        if(this.color.color.equals("Negro")){
            if(columnaDestino == getColumnaActual() && filaDestino >= 0 && filaDestino == getFilaActual()-1  ||
                    columnaDestino == getColumnaActual() && filaDestino >= 0 && filaDestino == getFilaActual()-2){
                setFilaActual(filaDestino);
                System.out.println("La ficha se movió a la fila " + getFilaActual() + ", columna " + getColumnaActual() );
            }else System.out.println("Movimiento no válido.");
        }
    }
}
