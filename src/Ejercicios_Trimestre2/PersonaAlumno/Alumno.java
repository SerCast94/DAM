package Ejercicios_Trimestre2.PersonaAlumno;

public class Alumno extends Persona{
    String curso;

    enum Cursos{Guarderia,Preescolar,Primaria,Secundaria,Bachillerato,GradoMedio,GradoSuperior,Universidad,NoEstablecido,}
    public Alumno(String nombre, int edad, double estatura) {
        super(nombre,edad,estatura);
        setCurso();
    }

    public void setCurso() {
        switch (getEdad()){
            case 0,1,2 ->  setCurso(String.valueOf(Cursos.Guarderia));
            case 3,4,5 -> setCurso(String.valueOf(Cursos.Preescolar));
            case 6,7,8,9,10,11 -> setCurso(String.valueOf(Cursos.Primaria));
            case 12,13,14,15 -> setCurso(String.valueOf(Cursos.Secundaria));
            case 16,17 -> setCurso(String.valueOf(Cursos.Bachillerato));
            case 18,19,20,21 -> setCurso(String.valueOf(Cursos.Universidad));
            case 22,23 -> setCurso(String.valueOf(Cursos.GradoMedio));
            case 24,25 -> setCurso(String.valueOf(Cursos.GradoSuperior));
            default -> this.curso = String.valueOf(Cursos.NoEstablecido);
        }
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public void mostrarTodo() {
        super.mostrarTodo();
        System.out.println(getCurso());
    }
    public void mostrarHorario(){
        if(curso.equals(String.valueOf(Cursos.Guarderia)) || curso.equals(String.valueOf(Cursos.Preescolar)) ||curso.equals(String.valueOf(Cursos.Primaria)) || curso.equals(String.valueOf(Cursos.Secundaria)) ||curso.equals(String.valueOf(Cursos.Bachillerato))){
            System.out.println("Tiene horario de mañana");
        } else if (curso.equals(String.valueOf(Cursos.Universidad)) || curso.equals(String.valueOf(Cursos.GradoMedio)) || curso.equals(String.valueOf(Cursos.GradoSuperior))){
            System.out.println("Tiene horario de tarde");

        }else System.out.println("Curso no establecido así que el horario menos.");

    }
}
