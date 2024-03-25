package Ejercicios_Trimestre2.BufferedWriter;

import java.io.*;

public class Main {
    public static void main(String[] args) {


        BufferedWriter out = null; // 1º declaro buffer a null

        try {
            out = new BufferedWriter(new FileWriter("texto.txt")); //2º Encuentro el archivo



            String auxtexto = "Vida antes que muerte. Fuerza antes que debilidad. Viaje antes que destino.";            //3º escribir mediante string o char
            out.write(auxtexto);
            out.newLine();
            String autor = "Brandon Sanderson, El camino de los reyes.";
            for (int i = 0; i < autor.length(); i++) {
                out.write(autor.charAt(i));
            }

        }catch (IOException e){
            System.out.println(e.getMessage());

        }finally {
            if (out != null){                                   // 4º finallly, si el buffer no es null lo cierro.
                try {
                    out.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
















    }
}