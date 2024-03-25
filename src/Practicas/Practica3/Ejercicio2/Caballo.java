package Practicas.Practica3.Ejercicio2;
public class Caballo extends Pieza{
    public Caballo(int filaActual, int columnaActual, boolean derrotada) {
        super(filaActual, columnaActual, derrotada);
    }

    @Override
    void movimiento(int filaDestino, int columnaDestino) {

        if(filaDestino < 0 || filaDestino > 7 || columnaDestino < 0 || columnaDestino > 7){ // si el movimiento se sale del tablero no se puede hacer.
            System.out.println("Movimiento no válido. Se sale del tablero.");
        }else if (columnaActual+2 == columnaDestino && filaActual+1 == filaDestino ||   //en otro caso, contemplo los 8 posibles movimientos.
            columnaActual+2 == columnaDestino && filaActual-1 == filaDestino ||
            columnaActual-2 == columnaDestino && filaActual+1 == filaDestino ||
            columnaActual-2 == columnaDestino && filaActual-1 == filaDestino ||
            filaActual+2 == filaDestino && columnaActual+1 == columnaDestino ||
            filaActual+2 == filaDestino && columnaActual-1 == columnaDestino ||
            filaActual-2 == filaDestino && columnaActual+1 == columnaDestino ||
            filaActual-2 == filaDestino && columnaActual-1 == columnaDestino){
            setFilaActual(filaDestino);
            setColumnaActual(columnaDestino);
            System.out.println("La ficha se movió a la fila " + getFilaActual() + ", columna " + getColumnaActual() );
        }else {
            System.out.println("Movimiento no válido.");                            //cajón de sastre.
        }
    }
}
