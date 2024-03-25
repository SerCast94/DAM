package Ejercicios_Trimestre1;

public class ArrayIntRandom {
    public static void main(String[] args) {

        int[] arai10 = new int[10];
        int suma = 0;

        for (int d = 0; d < arai10.length; d++) {
            arai10[d] = (int) (Math.random() * 99) + 1;
            System.out.println("genera numero aleatorio: " + arai10[d]);
            suma += arai10[d];
            System.out.println("suma un total de: " + suma);
        }
    }


}