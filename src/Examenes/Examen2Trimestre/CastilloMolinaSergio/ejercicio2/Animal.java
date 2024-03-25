package Examenes.Examen2Trimestre.CastilloMolinaSergio.ejercicio2;

enum DeCompania{SI,NO,DEPENDE}

public abstract class Animal {
    String nombre;
    double peso;
    double altura;
    DeCompania deCompania;

    public Animal(String nombre, double peso, double altura, String deCompania) {
        setNombre(nombre);
        setPeso(peso);
        setAltura(altura);
        setDeCompania(deCompania);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public DeCompania getDeCompania() {
        return deCompania;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        if(peso >= 0) {
            this.peso = peso;
        }else System.out.println("Peso invalido");
    }

    public void setAltura(double altura) {
        if(altura >= 0) {
            this.altura = altura;
        }else System.out.println("Altura invalida");
    }

    public void setDeCompania(String deCompania) {
        this.deCompania = DeCompania.valueOf(deCompania.toUpperCase());
    }


    void mostrarInformacion(){
        System.out.println("El nombre es: " + getNombre());
        System.out.println("El peso es: " + getPeso());
        System.out.println("La altura es: " + getAltura());
        System.out.println("Es de compañía: " + getDeCompania());

    }

    abstract int fecundacion();

}
