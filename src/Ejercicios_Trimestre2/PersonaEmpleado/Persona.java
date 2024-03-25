package Ejercicios_Trimestre2.PersonaEmpleado;

public class Persona {
    public String nombre;
    private int edad;
    double estatura;

    String curso;


    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public Persona(String nombre, int edad, double estatura) {
        setNombre(nombre);
        setEdad(edad);
        setEstatura(estatura);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if(edad > 0){
            this.edad = edad;
        }else{
                        System.out.println("la edad Introducido es incorrecta");
        }


    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void mostrarTodo(){
        System.out.println(getNombre());
        System.out.println(getEdad());
        System.out.println(getEstatura());
    }
    public void aumentarEdad(){
        setEdad(getEdad()+1);

    }
}
