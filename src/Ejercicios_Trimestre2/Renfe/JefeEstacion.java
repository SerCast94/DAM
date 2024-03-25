package Ejercicios_Trimestre2.Renfe;

public class JefeEstacion {
    String nombre;
    String DNI;
    final String FechaNombramiento;

    public JefeEstacion(String nombre, String DNI,String fechaNombramiento) {
    setNombre(nombre);
    setDNI(DNI);
    this.FechaNombramiento = fechaNombramiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

}
