package Examenes.Examen2Trimestre.CastilloMolinaSergio.ejercicio1;

public class Persona implements CastilloMolinaSergio.ejercicio1.Hablar {
    String nombre;
    int edad;
    String direccion;

    public Persona(String nombre, int edad, String direccion) {
        setNombre(nombre);
        setEdad(edad);
        setDireccion(direccion);
    }

    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
        setDireccion("Sin definir");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if(edad >= 0 && edad <= 99){this.edad = edad;}
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return getNombre() + ";" + getEdad() + ";" + getDireccion();
    }

    void mostrarInfo(){
        System.out.println("El nombre es: " + getNombre());
        System.out.println("La edad es: " + getEdad());
        System.out.println("La dirección es: " + getDireccion());
    }

    @Override
    public void hablar(String mensaje) {
        System.out.println(mensaje);
        System.out.println("Hola, mi nombre es " + getNombre() + ", tengo " + getEdad() + " años y vivo en " + getDireccion());
    }
}
