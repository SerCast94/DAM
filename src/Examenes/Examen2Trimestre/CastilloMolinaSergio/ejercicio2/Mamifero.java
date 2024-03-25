package Examenes.Examen2Trimestre.CastilloMolinaSergio.ejercicio2;

public class Mamifero extends Animal{
   private int tiempoDeGestacion;

    public Mamifero(String nombre, double peso, double altura, String deCompania, int tiempoDeGestacion) {
        super(nombre, peso, altura, deCompania);
        setTiempoDeGestacion(tiempoDeGestacion);
    }

    public int getTiempoDeGestacion() {
        return tiempoDeGestacion;
    }

    public void setTiempoDeGestacion(int tiempoDeGestacion) {
        if(tiempoDeGestacion >= 0){this.tiempoDeGestacion = tiempoDeGestacion;
        }else System.out.println("Tiempo de gestación invalido o negativo.");
    }

    @Override
    int fecundacion() {

        return getTiempoDeGestacion();
    }

    @Override
    void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("El tiempo de gestación es : " + getTiempoDeGestacion() + " días.");
    }

}
