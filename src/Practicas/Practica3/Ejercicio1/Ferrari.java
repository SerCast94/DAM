package Practicas.Practica3.Ejercicio1;

import java.util.Scanner;

public class Ferrari extends Vehiculo {
   private int caballosDeFuerza;

    public Ferrari(String marca, int anioDeFabricacion, String modelo, int caballosDeFuerza) {
        super(marca, anioDeFabricacion, modelo);
        setCaballosDeFuerza(caballosDeFuerza);
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        boolean aux = false;
        Scanner sc = new Scanner(System.in);

        do {
            if (caballosDeFuerza > 0) {
                this.caballosDeFuerza = caballosDeFuerza;
                aux=true;
            } else {
                System.out.println("Caballos no válidos, introduce número válido");
              caballosDeFuerza = sc.nextInt();
            }
        }while(!aux);
    }

    void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tiene " + caballosDeFuerza + " Caballos de fuerza.");
    }
}
