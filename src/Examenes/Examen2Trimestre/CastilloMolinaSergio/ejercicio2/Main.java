package Examenes.Examen2Trimestre.CastilloMolinaSergio.ejercicio2;

public class Main {
    public static void main(String[] args) {


Mamifero m1 = new Mamifero("Vaca", 150,120,"NO",150);
Mamifero m2 = new Mamifero("Pero", 20,30,"si",150);

Ave a1 = new Ave("Gorrion",5,2,"depende",20,true);
Ave a2 = new Ave("Canario",3,1,"depende",12, true);

        System.out.println("INFO MAMIFEROS");
m1.mostrarInformacion();
m2.mostrarInformacion();
        System.out.println("INFO AVES");
a1.mostrarInformacion();
a2.mostrarInformacion();

Zoo zoo = new Zoo();

zoo.mamiferos[0] = m1;
zoo.mamiferos[1] = m2;
zoo.aves[0] = a1;
zoo.aves[1] = a2;

        System.out.println("INFO ZOO");
zoo.mostrarInformacion();
        System.out.println("ZOO INVERTIDO");
zoo.mostrarInvertido();
        System.out.println("ZOO COMPARA NOMBRE");
zoo.comparaNombre();
        System.out.println("GUARDANDO EL ARCHIVO");
zoo.guardarTXT();
















    }
}
