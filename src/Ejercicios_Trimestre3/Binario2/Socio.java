package Ejercicios_Trimestre3.Binario2;

import java.io.Serializable;

public class Socio implements Serializable {
    int id;
    String nombre;

    public Socio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "\n Socio[" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ']';
    }
}
