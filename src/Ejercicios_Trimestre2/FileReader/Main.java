package Ejercicios_Trimestre2.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileReader in = null;
        String texto = "";

        try{

            in = new FileReader("D:\\01. programación\\01. ejercicios2\\ficheros2\\untitled\\archivo.txt");
            System.out.println("FICHERO ENCONTRADO");
            int c = in.read();

            while (c != -1) {
                texto += (char) c;
                c = in.read();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());

        }finally {

            if(in != null) {
                try{
                in.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }else System.out.println("el fichero nunca se encontró");
        }

        System.out.println(texto);
    }
}