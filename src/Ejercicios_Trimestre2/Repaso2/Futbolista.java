package Ejercicios_Trimestre2.Repaso2;

public class Futbolista implements Comparable{
    String DNI;
    String nombre;
    int edad;
    int goles;


    public Futbolista(String DNI, String nombre, int edad, int goles) {
        this.DNI = DNI;
        setNombre(nombre);
        setEdad(edad);
        setGoles(goles);
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getGoles() {
        return goles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if(edad > 0){
        this.edad = edad;
        }else System.out.println("Edad inválida o negativa");
    }

    public void setGoles(int goles) {
        if(goles > 0 ){this.goles = goles;
        }else System.out.println("Goles inválidos o negativos");
    }

    @Override
    public String toString() {

        return "El nombre es: " + getNombre() + "\n El DNI es: " + getDNI() + "\n La edad es: " + getEdad() + "\n Ha marcado " + getGoles() + " goles.";
    }

    @Override
    public boolean equals(Object obj) {
    Futbolista otroFutbolista = (Futbolista) obj;
    return this.DNI.equals(otroFutbolista.DNI);
    }

    @Override
    public int compareTo(Object o) {
        Futbolista otroFutbolista = (Futbolista) o;
        return this.DNI.compareTo(otroFutbolista.DNI);

        //int resultado;
        // if(this.DNI > otroFutbolista.DNI) resultado = 1;
        // else if (this.DNI < otroFutbolista.DNI) resultado = -1;
        // else resultado = 0;
    }
}
