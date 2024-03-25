package Ejercicios_Trimestre3.Binario1;

import java.io.Serializable;

public class Persona implements Serializable {

    String nombre;
    int edad;
    double estatura;
    final String DNI;

    public Persona(String nombre, int edad, double estatura, String DNI) {
        setNombre(nombre);
        setEdad(edad);
        setEstatura(estatura);
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public String getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
}
