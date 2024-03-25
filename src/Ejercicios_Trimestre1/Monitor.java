package Ejercicios_Trimestre1;

import java.util.Scanner;

public class Monitor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int anchoMonitor,altoMonitor,refresco;
        int operaciones = 0;

        System.out.println("Introduce Ancho monitor.");
        anchoMonitor = sc.nextInt();
        System.out.println("Introduce Alto monitor");
        altoMonitor = sc.nextInt();
        System.out.println("Introduce refresco");
        refresco = sc.nextInt();

        for (int i = 0; i < anchoMonitor; i++){
            for(int j = 0; j < altoMonitor;j++){
                for(int p = 0; p < refresco;p++) {

                operaciones++;
                }
            }
        }
        System.out.println("Se ha realizado un total de: " + operaciones);



    }
}