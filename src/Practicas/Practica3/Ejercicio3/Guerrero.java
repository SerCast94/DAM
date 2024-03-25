package Practicas.Practica3.Ejercicio3;
import java.util.Scanner;
/**
 * <h2><b>Guerrero</b> es un rol, por lo que hereda de la clase Personaje</h2>
 *  Establece atributos y métodos necesarios para el desarrollo del personaje
 *  @author Sergio Castillo Molina
 */
public class Guerrero extends Personaje {
    /**
     * El personaje se define con un String nombre, un int nivel, un int vida y por último un Array de int para las estadísticas:
     * <ul>
     *     <li>Fuerza</li>
     *     <li>Defensa</li>
     *     <li>Magia</li>
     * </ul>
     */
    int modVida = 30;
    int modFuerza = 3;
    int modDefensa = 2;
    int modMagia = -3;

    /**
     * @param nombre el nombre que se asignará a tu personaje.
     * El personaje empezará con nivel 1, vida 100 y fuerza, defensa y magia al 10.
     */
    Guerrero(String nombre) {                                                                          //constructor para crear el personaje
        super(nombre);
        int [] aux = getEstadisticas();

        setVida(getVida()+modVida);
        setEstadisticas(aux[0]+modFuerza,aux[1]+modDefensa,aux[2]+modMagia);

    }

    /**
     * Este constructor se usa para el cambio de clase.
     * @param nombre nombre del personaje
     * @param nivel nivel del personaje
     * @param vida vida del personaje
     * @param fuerza fuerza del personaje
     * @param defensa defensa del personaje
     * @param magia magia del personaje
     */
    Guerrero(String nombre, int nivel,int vida,int fuerza,int defensa, int magia) {                 //contructor para el cambio de clase
        super(nombre);
        setNivel(nivel);
        setVida(vida+modVida);
        setEstadisticas(fuerza+modFuerza,defensa+modDefensa,magia+modMagia);
    }
    /**
     * <b>subirDeNivel<b/>
     * método abstracto para implementar en las clases hijas
     */
    @Override
    void subirDeNivel() {
        setNivel(getNivel()+1);
        int auxVida = getVida();
        setVida( (getVida() + (int) (Math.random()*40+20 )));
        int[] aux = getEstadisticas();
        setEstadisticas( (aux[0] + (int) (Math.random()*3+1)), (aux[1] + (int) (Math.random()*2+1)), (aux[2] + (int) (Math.random()*1)) );
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


    /**
     * <b>cambiodeClase<b/>
     * @return devuelve el personaje como otro rol.
     */
    @Override
    Personaje cambioDeClase() {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        int opcion;
        Personaje persona = null;
        while (menu) {

            System.out.println("""
                    1. Cambiar a Mago
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
                    setEstadisticas((aux[0]-modFuerza),(aux[1]-modDefensa),(aux[2]-modMagia));      //resto mod de clase
                    aux = getEstadisticas();                                                        //actualizo el aux sin el mod y lo uso para asignar los nuevos atributos
                    persona = new Mago(getNombre(),getNivel(),getVida(),aux[0],aux[1],aux[2]);
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
    /**
     * <b>Mostrar Información<b/>
     * Muestra por pantalla y de forma ordenada toda la información sobre el personaje
     */
    @Override
    void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(this.nombre + " es de la clase Guerrero.");
    }
}
