package Ejercicios_Trimestre3.Binario2;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {




        Socio socio1 = new Socio(1,"Paco");
        Socio socio2 = new Socio(2,"Paquito");
        Socio socio3 = new Socio(3,"Pacote");
        Socio socio4 = new Socio(4,"Francisco");
        Socio socio5 = new Socio(5,"Pacorro");
        Socio socio6 = new Socio(6,"Pacomer");
        Socio socio7 = new Socio(7,"PacoPepi");
        Socio socio8 = new Socio(8,"Pacolarse");
        Socio socio9 = new Socio(9,"Paquirri");
        Socio socio10 = new Socio(10,"Paquirrin");



        Socio [] listaSocios = {socio1,socio2,socio3,socio4,socio5,socio6,socio7,socio8,socio9,socio10};


        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(".\\Archivos\\Socios.dat"))) {
            out.writeObject(listaSocios);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(".\\Archivos\\Socios.dat"))) {

            Socio[] listaSociosCopiada = (Socio[]) in.readObject();
            System.out.println("MUESTRO LA LISTA DE MIS SOSIOS");
            System.out.println(Arrays.toString(listaSociosCopiada));



            for (var socio: listaSociosCopiada) {
                System.out.println(socio);

            }
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());

        }


    }
}