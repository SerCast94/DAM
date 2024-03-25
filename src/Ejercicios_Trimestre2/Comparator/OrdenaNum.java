package Ejercicios_Trimestre2.Comparator;

import java.util.Comparator;

public class OrdenaNum implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {

        return (int)o1 - (int)o2;
    }
}
