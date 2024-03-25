package Ejercicios_Trimestre1;

import java.util.Scanner;
public class Mapa {
    public static void main(String[] args) {
        int[][] mapa = new int[10][10];
        int[] puntoPartida = new int[1];
        int[] puntoFinal = new int[1];
        caminoMapa(mapa, puntoPartida, puntoFinal);
    }


    static boolean caminoMapa(int[][] mapa, int[] puntoPartida, int[] puntoFinal) {
        Scanner sc = new Scanner(System.in);
      int a,b,c,d;

    do {
     System.out.println("Introduce coordenada X del punto de partida");
        a = sc.nextInt();
        }while(a < 0 || a >= mapa.length);

    do{
        System.out.println("Introduce coordenada Y del punto de partida");
        b = sc.nextInt();
        }while(b < 0 || b >= mapa.length);
    do{
        System.out.println("Introduce coordenada X del punto final");
        c = sc.nextInt();
        }while(c < 0 || c >= mapa.length);
    do{
        System.out.println("Introduce coordenada X del punto final");
        d = sc.nextInt();
        }while(d < 0 || d >= mapa.length);

        puntoPartida= new int[]{a, b};
        puntoFinal= new int[]{c, d};


        for (int i = 0; i < mapa.length; i++) {                     //genera mapa 0 y 1
            for (int j = 0; j < mapa.length; j++) {
                mapa[i][j] = (int) (Math.random() * 2);
                if(i==a && j==b){                                   // evita que punto de salida sea intransitable
                    mapa[i][j]=1;
                }
                if(i==c && j==d){                                   // evita que punto final sea intransitable
                    mapa[i][j]=1;
                }
            }
        }



        for (int i = 0; i < mapa.length; i++) {                       //pinta mapa
            for (int j = 0; j < mapa.length; j++) {

                if ( i==a && j==b) {
                    System.out.print("[A]");
                } else if (i==c && j==d) {
                    System.out.print("[B]");
                } else {
                    System.out.print("[" + mapa[i][j] + "]");
                }
            }
            System.out.println();

        }

        int contador =0;

                while(a != c || b != d) {
                    
                    if ((mapa[a][b+1]==1) && (b+1 < mapa[0].length)) {
                        mapa[a][b]=4;
                        b += 1;

                    } else if (mapa[a][b-1] == 1 && b-1 >= 0) {
                        mapa[a][b]=4;
                        b -= 1;

                    } else if (mapa[a+1][b]==1 && a+1< mapa[0].length) {
                        mapa[a][b]=4;
                        a += 1;
                    } else if (mapa[a-1][b]==1 && a-1 >= 0) {
                        mapa[a][b]=4;
                        a -= 1;
                    }else{}

                   System.out.println("Tu personaje está en [" + a +"," + b +"]" );
                    contador++;



                    for (int i = 0; i < mapa.length; i++) {                       //pinta mapa
                        for (int j = 0; j < mapa.length; j++) {

                            if ( i==a && j==b) {
                                System.out.print("[A]");
                            } else if (i==c && j==d) {
                                System.out.print("[B]");
                            } else {
                                System.out.print("[" + mapa[i][j] + "]");
                            }
                        }
                        System.out.println();
                    }


                    if(contador==50){
                        break;
                    }
                    }

        for (int i = 0; i < mapa.length; i++) {                       //pinta mapa
            for (int j = 0; j < mapa.length; j++) {

                if ( i==a && j==b) {
                    System.out.print("[A]");
                } else if (i==c && j==d) {
                    System.out.print("[B]");
                } else {
                    System.out.print("[" + mapa[i][j] + "]");
                }
            }
            System.out.println();
        }



if(a==c && b==d){
    System.out.println("Ha llegado a su destino");
}else{
    System.out.println("No se puede llegar al destino");
}
        return false;
    }
}
