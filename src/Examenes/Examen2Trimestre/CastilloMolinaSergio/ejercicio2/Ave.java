package Examenes.Examen2Trimestre.CastilloMolinaSergio.ejercicio2;

public class Ave extends Animal{
    int tiempoDeIncubacion;

    boolean tienePlumas;

    public Ave(String nombre, double peso, double altura, String deCompania, int tiempoDeIncubacion, boolean tienePlumas) {
        super(nombre, peso, altura, deCompania);
        setTiempoDeIncubacion(tiempoDeIncubacion);
        setTienePlumas(tienePlumas);
    }

    public int getTiempoDeIncubacion() {
        return tiempoDeIncubacion;
    }

    public boolean isTienePlumas() {
        return tienePlumas;
    }

    public void setTiempoDeIncubacion(int tiempoDeIncubacion) {
        if(tiempoDeIncubacion >= 0) {
            this.tiempoDeIncubacion = tiempoDeIncubacion;
        }else System.out.println("Tiempo de incubación inválido o negativo");
    }

    public void setTienePlumas(boolean tienePlumas) {
        this.tienePlumas = tienePlumas;
    }

    @Override
    int fecundacion() {

        return getTiempoDeIncubacion();
    }

    @Override
    void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("El tiempo de incubación es: " + getTiempoDeIncubacion() + " días.");
        if(tienePlumas){
            System.out.println("Tiene plumas");
        }else System.out.println("No tiene plumas");
    }
}
