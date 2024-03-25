package Examenes.Examen1Trimestre;
import java.util.Arrays;

public class castilloMolinaSergioFunciones {

    static public int devuelve(double numMax){
    int entero;
    entero = (int) numMax ;

        return entero;
    }



    static public long devuelveLong(double[] valores){
double minimo = 999;
double aux = 0;
        for (int i = 0; i < valores.length-1; i++) {

          aux = Math.min(valores[i], valores[i + 1]);
            if ( aux < minimo){
                minimo = aux;
            }
        }

        Long minimoLong = (long) minimo;

        return minimoLong;
    }







    public static void compruebaPalindromo(String palindromo){
        int contador =0;
        String palindromoAux = palindromo;
        int contador2 = 0;

        for (int i = palindromo.length(); i > 0 ; i--) {

            if(palindromoAux.charAt(i-1) == palindromo.charAt(contador)){
                contador2++;
            }

            contador++;
        }

        if(contador2==palindromo.length()){
            System.out.println("Es palindromo");
        }else{
            System.out.println("no es palindromo");
        };

    }



    public static void compruebaAnagrama(String palindromo, String anagrama){
        int contador = 0;

        if(palindromo.length() != anagrama.length()){

        System.out.println("No es un anagrama");

        }else{

            for (int i = 0; i < palindromo.length(); i++) {

                if(palindromo.indexOf(anagrama.charAt(i)) >= 0){
                    contador++;
                }
            }

            if(contador == palindromo.length()){
                System.out.println("es un anagrama");
            }

        }

    }








static public int[][] multiMatriz(int[][]matriz1, int[][]matriz2){

        int[][] multiplica = new int[matriz1.length][matriz2.length];
    for (int i = 0; i < matriz1.length; i++) {
        for (int j = 0; j < matriz1.length; j++) {

           multiplica[i][j]= (matriz1[i][j] * matriz2[i][j]);
        }
    }
    System.out.println(Arrays.deepToString(multiplica));
    return multiplica;
    }

   public static int[][] matrizElevada(int[][] matriz1,int[][] matriz2){

        int [][]matrizAux = new int[matriz1.length][matriz1.length];

       for (int i = 0; i < matriz1.length; i++) {
           for (int j = 0; j < matriz1.length; j++) {
               matrizAux[i][j] = (int) Math.pow(matriz1[i][j],matriz2[i][j]);
           }
       }
       System.out.println(Arrays.deepToString(matrizAux));
       return matrizAux;
   }



   public static void  matricial(int[][] matriz){

       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz.length; j++) {
               System.out.print("[" + matriz[i][j] + "] ");
           }
           System.out.println();
       }

   }

}
