package Ejercicios_Trimestre2.Comparable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable{

    int id;
    String nombre;
    LocalDate fechaNacimiento;

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento,f);
    }

    int edad(){return (int)fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);}

    @Override
    public int compareTo(Object obj){
        int resultado;
        Socio otroSocio = (Socio) obj;

        if(getNombre().substring(0,1).compareTo(otroSocio.nombre.substring(0,1)) == -1){resultado = -1;}
        else if (getNombre().substring(0,1).compareTo(otroSocio.nombre.substring(0,1)) == +1) {resultado = +1;}
        else resultado = 0;

        return resultado;
    }

    public String toString(){
        return "Id: " + id + " Nombre: " + nombre + " Edad: " + edad() + "\n";
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}