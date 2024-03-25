package Ejercicios_Trimestre2.Banco;
public class Gestor {

   public String nombre;
   public final String telefono;
   double importeMax;

    Gestor(String nombre,String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMax = 10000;
    }
    Gestor(String nombre, String telefono, double importeMax){
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMax = importeMax;
    }
}
