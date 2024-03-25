package Practicas.Practica3.Ejercicio2;

import java.util.Scanner;
enum Color{
    BLANCO("Blanco"),
    NEGRO("Negro");

    final String color;

    Color(String color){
        this.color = color;
    }

}
abstract class Pieza {

    Color color;
    int filaActual;
    int columnaActual;
    boolean Derrotada;

    Pieza(int filaActual, int columnaActual, boolean derrotada){
        setFilaActual(filaActual);
        setColumnaActual(columnaActual);
        setDerrotada(derrotada);
        setColor();
        setDerrotada(false); //al crearse la pieza está en juego
    }

    abstract void movimiento(int filaDestino, int columnaDestino);

    public String getColor() {
        return color.color;
    }

    public int getFilaActual() {
        return filaActual;
    }

    public int getColumnaActual() {
        return columnaActual;
    }

    public boolean isDerrotada() {
        return Derrotada;
    }

    void setColor(){
        Scanner sc = new Scanner(System.in);
        String colorUsuario;

        do {
            System.out.println("Que color de fichas quieres, ¿Blanco o Negro?");
            System.out.println("Las blancas juegan abajo.");
            System.out.println("Las negras juegan arriba.");
            colorUsuario = sc.nextLine();
            for (var colores : Color.values()) {
                if (colorUsuario.substring(0,colorUsuario.length()-1).equalsIgnoreCase(colores.color.substring(0,colores.color.length()-1))) { //substring -1 para permitir blanc@ y negro@.
                    this.color = colores;
                    System.out.println("Su ficha es color: " + getColor());
                }
            }
        }while (this.color==null);
    }

    public void setFilaActual(int filaActual) {

        if (filaActual >= 0 && filaActual < 8) {  //si es valido asigna
            this.filaActual = filaActual;
        } else {
            while (filaActual < 0 || filaActual >= 8) {  //sino pregunta hasta que lo sea
                Scanner sc = new Scanner(System.in);
                System.out.println("Debe introducir fila válida (0-7)");
                filaActual = sc.nextInt();
                if (filaActual >= 0 && filaActual < 8) {
                    this.filaActual = filaActual;
                }
            }
        }
    }

    public void setColumnaActual(int columnaActual){

            if (columnaActual >= 0 && columnaActual < 8) { //si es valido asigna
                this.columnaActual = columnaActual;
            } else {
                while (columnaActual < 0 || columnaActual >= 8) { //sino pregunta hasta que lo sea
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Debe introducir columna válida (0-7)");
                    columnaActual = sc.nextInt();
                    if (columnaActual >= 0 && columnaActual < 8) {
                        this.columnaActual = columnaActual;
                    }
                }
            }
    }

    public void setDerrotada(boolean derrotada) {
        Derrotada = derrotada;
    }

    void mostrarDatos(){
        System.out.println("------- INFORMACIÓN DE LA PIEZA -------");
        System.out.println("El color es: " + getColor());
        System.out.println("La fila actual es: " + getFilaActual());
        System.out.println("La columna actual es: " + getColumnaActual());
        if(isDerrotada()){
            System.out.println("La pieza está derrotada");
        }else System.out.println("La pieza sigue en juego");
        System.out.println("-------- POSICIÓN DE LA PIEZA --------");

        for (int fila = 7; fila >= 0; fila--) {                              // dibuja tablero.
            System.out.print((fila) + "  ");
            for (int columna = 0; columna <= 7; columna++) {
                if(columna == columnaActual && fila == filaActual){
                    System.out.print("F  ");
                }else{
                    System.out.print("X  ");
                }
            }
            System.out.println();
        }
        System.out.println("   0  1  2  3  4  5  6  7  ");
    }
}