package Ejercicios_Trimestre2.Texto;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Texto {
String cadena;
final int longitudMax;
LocalDateTime localTime = LocalDateTime.now();
String fecha;


    public Texto(String cadena) {
        this.cadena = cadena;
        this.longitudMax = 10;
        this.fecha = "Hora de creación: " + localTime.getHour() + " Horas " + localTime.getMinute() + " Minutos " + localTime.getSecond() + " Segundos.";

    }


    public int cuentaVocales(){
        int contador = 0;

        for (int i = 0; i < this.cadena.length(); i++) {

            if(this.cadena.toLowerCase().charAt(i) == 'a' || this.cadena.toLowerCase().charAt(i) == 'e' || this.cadena.toLowerCase().charAt(i) == 'i' || this.cadena.toLowerCase().charAt(i) == 'o' || this.cadena.toLowerCase().charAt(i) == 'u' ){
                contador++;
            }

        }
        return contador;
}


    public void setCadena(String cadena) {

        if(cadena.length() <= this.longitudMax) {
            this.cadena = cadena;
        }else{
            System.out.println("No se puede añadir. Longitud maxima alcanzada.");
        }
    }
    public void setCharFinal(char cadena) {

        if(this.cadena.length() + 1 <= this.longitudMax) {
            this.cadena += cadena;
        }else{
            System.out.println("No se puede añadir. Longitud maxima alcanzada.");
        }
    }

    public void setCharPrincipio(char cadena) {

        if(this.cadena.length() + 1 <= this.longitudMax) {
            this.cadena = cadena + this.cadena;
        }else{
            System.out.println("No se puede añadir. Longitud maxima alcanzada.");
        }
    }

    public void setCadenaFinal(String cadena) {

        if(this.cadena.length() + cadena.length() <= this.longitudMax) {
            this.cadena += cadena;
        }else{
            System.out.println("No se puede añadir. Longitud maxima alcanzada.");
        }
    }

    public void setCadenaPrincipio(String cadena) {

        if(this.cadena.length() + cadena.length() <= this.longitudMax) {
            this.cadena = cadena + this.cadena;
        }else{
            System.out.println("No se puede añadir. Longitud maxima alcanzada.");
        }
    }
    public void mostrarInfoTexto(){
        System.out.println("Su cadena de texto: " + getCadena());
        System.out.println("Su longitud actual: " + this.cadena.length());
        System.out.println("Su longitud maxima: " + getLongitudMax());
        System.out.println("Su cadena tiene " + cuentaVocales() + " vocales");
        System.out.println(getFecha());
    }

    public String getCadena() {
        return cadena;
    }

    public int getLongitudMax() {
        return longitudMax;
    }

    public LocalDateTime getLocalTime() {
        return localTime;
    }

    public String getFecha() {
        return fecha;
    }

    public char StringtoChar(){
        Scanner sc = new Scanner(System.in);

        char auxilio = '0';

        while(auxilio =='0') {

            System.out.println("Introduce un caracter");
            String aux = sc.next();

            if (aux.length() == 1) {
                auxilio = aux.charAt(0);
            } else {
                System.out.println("Longitud no adecuada");
            }
        }
        return auxilio;
    }

}
