package Ejercicios_Trimestre2.Repaso2;

import java.util.Comparator;

public class ComparaEdades implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {


        return ((Futbolista)o1).edad - ((Futbolista)o2).edad;
    }
}
