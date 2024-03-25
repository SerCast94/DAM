package Practicas.Practica3.Ejercicio1;

public class Seat  extends Vehiculo{

private String tipoDeCombustible;

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public Seat(String marca, int anioDeFabricacion, String modelo, String Combustible) {
        super(marca, anioDeFabricacion, modelo);        //llamo al contructor del padre
        setTipoDeCombustible(Combustible);              // añado las nuevas variables de la clase
    }

    @Override
    void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("El tipo de combustible es: " + getTipoDeCombustible());
    }
}
