package Ejercicios_Trimestre2.IntrumentoPiano;

import java.lang.reflect.Array;

public class Piano  extends Instrumento{

    @Override
    void add() {

        int aux = (int) (Math.random()*7+1);
        String cadAux="";
        switch (aux){
            case 1 -> cadAux = "DO";
            case 2 -> cadAux = "RE";
            case 3 -> cadAux = "MI";
            case 4 -> cadAux = "FA";
            case 5 -> cadAux = "SOL";
            case 6 -> cadAux = "LA";
            case 7 -> cadAux = "SI";
        }


        for (int i = 0; i < notas.length; i++) {
            if(notas[i] == null){
                notas[i] = cadAux;
                System.out.println("Se ha añadido una nota");
                break;
            }
            }
        if(notas[notas.length-1] != null){
            System.out.println("El pentagrama está lleno");
        }
    }



    @Override
    void interpretar() {

        for (int i = 0; i < notas.length; i++) {
            if(notas[i] != null){
                System.out.print(notas[i] + " ");
            }
        }
        System.out.println();
    }
}
