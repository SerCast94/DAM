package Practicas.Practica3.Ejercicio3;
import java.util.Scanner;

public class Mago extends Personaje{
    int modVida = 20;
    int modFuerza = -3;
    int modDefensa = 1;
    int modMagia = 4;

    Mago(String nombre) {                                                                                   //constructor para crear personaje
        super(nombre);
        int [] aux = getEstadisticas();

        setVida(getVida()+modVida);
        setEstadisticas(aux[0]+modFuerza,aux[1]+modDefensa,aux[2]+modMagia);
    }

    Mago(String nombre, int nivel,int vida,int fuerza,int defensa, int magia) {                         //constructor para cambiar clase
        super(nombre);
        setNivel(nivel);
        setVida(vida+modVida);
        setEstadisticas(fuerza+modFuerza,defensa+modDefensa,magia+modMagia);
    }
    @Override
    void subirDeNivel() {
        setNivel(getNivel()+1);
        int auxVida = getVida();
        setVida( (getVida() + (int) (Math.random()*30+10 )));
        int[] aux = getEstadisticas();
        setEstadisticas( (aux[0] + (int) (Math.random()*1)), (aux[1] + (int) (Math.random()*1)), (aux[2] + (int) (Math.random()*6+2)) );
        int[] aux2 = getEstadisticas();

        //  mostrarInformacion(); puedo reusar esta función pero prefiero mostrar el aumento de atributos

        System.out.println(getNombre() + " sube de nivel!");
        System.out.println("Nivel " + getNivel() + " obtenido!");
        System.out.println("---------- LOS ATRIBUTOS AUMENTAN ----------");
        System.out.println("Vida: " + auxVida + " -> " + getVida());
        System.out.println("Fuerza: " + aux[0] +  " -> " +  aux2[0]);
        System.out.println("Defensa: " + aux[1] +  " -> " +  aux2[1]);
        System.out.println("Magia: " + aux[2] +  " -> " +  aux2[2]);
    }

    @Override
    Personaje cambioDeClase() {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        int opcion;
        Personaje persona = null;
        while (menu) {

            System.out.println("""
                    1. Cambiar a Guerrero
                    2. Cambiar a Defensor
                    3. Cambiar a Vagabundo
                    0. SALIR
                    """);
            System.out.println("Seleccione una opción");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    int [] aux = getEstadisticas();
                    setVida(getVida()-modVida);
                    setEstadisticas((aux[0]-modFuerza),(aux[1]-modDefensa),(aux[2]-modMagia));                  //resto mod clase
                    aux = getEstadisticas();                                                                    //actualizo aux y uso para asignar
                    persona = new Guerrero(getNombre(),getNivel(),getVida(),aux[0],aux[1],aux[2]);
                    menu = false;

                }
                case 2 -> {
                    int [] aux = getEstadisticas();
                    setVida(getVida()-modVida);
                    setEstadisticas((aux[0]-modFuerza),(aux[1]-modDefensa),(aux[2]-modMagia));
                    aux = getEstadisticas();
                    persona = new Defensor(getNombre(),getNivel(),getVida(),aux[0],aux[1],aux[2]);
                    menu = false;

                }
                case 3 -> {
                    int [] aux = getEstadisticas();
                    setVida(getVida()-modVida);
                    setEstadisticas((aux[0]-modFuerza),(aux[1]-modDefensa),(aux[2]-modMagia));
                    aux = getEstadisticas();
                    persona = new Vagabundo(getNombre(),getNivel(),getVida(),aux[0],aux[1],aux[2]);
                    menu = false;

                }
                case 0 ->  menu = false;

            }
        }
        return persona;
    }

    @Override
    void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(this.nombre + " es de la clase Mago.");
    }
}
