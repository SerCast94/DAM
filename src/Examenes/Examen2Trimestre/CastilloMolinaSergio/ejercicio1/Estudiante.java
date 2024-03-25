package Examenes.Examen2Trimestre.CastilloMolinaSergio.ejercicio1;

public class Estudiante extends Persona{

    private boolean becado;
    public int notaMedia;

    public Estudiante(String nombre, int edad, String direccion,boolean becado) {
        super(nombre,edad,direccion);
        this.becado = becado;
    }

    public boolean isBecado() {
        return becado;
    }

    public int getNotaMedia() {
        return notaMedia;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    public void setNotaMedia(int notaMedia) {
        if(notaMedia >= 0 && notaMedia <= 10){this.notaMedia = notaMedia;}
    }

    @Override
    void mostrarInfo() {
        super.mostrarInfo();
        if(this.becado) {
            System.out.println("Es becado");
        }else System.out.println("No es becado");
        System.out.println("La nota media es: " + getNotaMedia() );
    }
}
