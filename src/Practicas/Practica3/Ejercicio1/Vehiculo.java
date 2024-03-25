package Practicas.Practica3.Ejercicio1;

import java.util.Scanner;
enum Color {
    ROJO("Rojo"),
    VERDE("Verde"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    NEGRO("Negro"),
    AMARILLO("Amarillo"),
    ROSA("Rosa"),
    NARANJA("Naranja");

    String color;
    Color(String color){this.color = color;}
}

public class Vehiculo {

    final private int anioDeFabricacion;
    Color color;
    String modelo;

    public Vehiculo(String marca, int anioDeFabricacion,String modelo) {
        this.anioDeFabricacion = anioDeFabricacion;
        setColor();
        setModelo(modelo);
    }

    public int getAnioDeFabricacion() {

        return anioDeFabricacion;
    }

    void setColor() {
        Scanner sc = new Scanner(System.in);
        String colorUsuario;
        do {
            System.out.println("Introduce color");
            colorUsuario = sc.nextLine();
            for (var colores : Color.values()) {        //for each para recorrer el enum
                if (colorUsuario.equalsIgnoreCase(colores.color)) {
                    this.color = colores;
                    System.out.println("Color encontrado: " + colores.color);
                }
            }
        }while(this.color == null);
    }

    public String getColor() {
        return color.color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void mostrarInformacion(){
        System.out.println("----- INFORMACIÓN DEL VEHICULO -----");
        System.out.println("La marca es: " + getModelo());
        System.out.println("El año de fabricación es: " + getAnioDeFabricacion());
        System.out.println("El color es: " + getColor());
            }

    void repintarVehiculo(){
        setColor();
    }

}
