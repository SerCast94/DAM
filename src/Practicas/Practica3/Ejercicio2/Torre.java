package Practicas.Practica3.Ejercicio2;
public class Torre extends Pieza{
    public Torre(int filaActual, int columnaActual, boolean derrotada) {
        super(filaActual, columnaActual, derrotada);
    }

    @Override
    void movimiento(int filaDestino, int columnaDestino) {

            if(filaDestino == getFilaActual() && columnaDestino >= 0 && columnaDestino <= 7||  //si no cambia fila y columna esta dentro del tablero, se mueve
                columnaDestino == getFilaActual() && filaDestino >= 0 && filaDestino <= 7){    //si no cambia columna y fila esta dentro del tablero, se mueve
                setColumnaActual(columnaDestino);
                setFilaActual(filaDestino);
                System.out.println("La ficha se movió a la fila " + getFilaActual() + ", columna " + getColumnaActual() );
            }else System.out.println("Movimiento no válido.");

    }
}
