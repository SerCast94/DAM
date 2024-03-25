package Practicas.Practica3.Ejercicio3;
import java.util.Scanner;


abstract class Personaje {

    protected String nombre;
    public int nivel;
    private int vida;
    private int [] estadisticas;


    Personaje(String nombre){
        setNombre(nombre);
        setNivel(1); //empieza en nivel 1
        setVida(100); // con 100 de vida
        setEstadisticas(10,10,10); // y 10 en cada estadística.
    }


    public String getNombre() {
        return nombre;

    }


    public int getNivel() {
        return nivel;
    }


    public int getVida() {
        return vida;
    }


    public int[] getEstadisticas() {

        return estadisticas;
    }


    public void setNombre(String nombre) {
        Scanner sc = new Scanner(System.in);

        do{
            if (!nombre.isEmpty() && nombre.length() <= 20) { //longitud de nombre max 20. y evito vacío.
                this.nombre = nombre;
            }else {
                    System.out.println("Introduzca nombre válido. Máximo 20 caracteres.");
                    nombre = sc.next();
                  }
        }while(nombre.isEmpty() || nombre.length()>20);
        this.nombre = nombre;

    }


    public void setNivel(int nivel) {

        if(nivel > 0 && nivel <= 99){ //niveles entre 1 y 99
            this.nivel = nivel;
        } else if (nivel < 99) {
            System.out.println("nivel máximo alcanzado");
        }else System.out.println("nivel no válido");
    }


    public void setVida(int vida) {
        if(vida>=0){                //vida maxima = 0 = muerto.
            this.vida = vida;
        }
    }


    public void setEstadisticas(int fuerza, int defensa, int magia) {   //seteo con 3 int. me resulta mas fácil.
        estadisticas = new int[3];
        this.estadisticas[0] = fuerza;
        this.estadisticas[1] = defensa;
        this.estadisticas[2] = magia;
    }


    void mostrarInformacion(){
        System.out.println("----- INFORMACIÓN DEL PERSONAJE -----");
        System.out.println("El nombre es: " + getNombre());
        System.out.println("El nivel es: " + getNivel());
        System.out.println("La vida es: " + getVida());
        System.out.println("------------- ATRIBUTOS -------------");
        System.out.println("La fuerza es: " + estadisticas[0]);
        System.out.println("La defensa es: " + estadisticas[1]);
        System.out.println("La magia es: " + estadisticas[2]);
        System.out.println("-------------------------------------");

    }


    abstract void subirDeNivel();

 
    abstract Personaje cambioDeClase();
}
