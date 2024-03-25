package Ejercicios_Trimestre3.Binario1;

import java.io.*;
import java.util.Arrays;

public class Main implements Serializable {
    public static void main(String[] args) {


        try(ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("datos.dat"))){

            int[] tablaEnteros ={1,2,3,4,5,9,8,7,6,0,25};
            for (int i = 0; i < tablaEnteros.length; i++) {
                out.writeInt(tablaEnteros[i]);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }



        try(ObjectOutputStream out2 = new ObjectOutputStream( new FileOutputStream("datos.dat"))){

            int[] tablaEnteros ={1,2,3,4,5,9,8,7,6,0,25};
            out2.writeObject(tablaEnteros);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }






        Persona paco = new Persona("Paco",30,1.50,"12345678W");

        try(ObjectOutputStream out3 = new ObjectOutputStream(new FileOutputStream("personaje.dat"))) {
             out3.writeObject(paco);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }




            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {

                int[] arrayLeido = (int[]) in.readObject();
                System.out.println("LEO EL ARCHIVO");
                System.out.println(Arrays.toString(arrayLeido));

            }catch (IOException | ClassNotFoundException e){
                System.out.println(e.getMessage());
            }


            //SI LEES INT A INT, SALE NULL.


//        try (ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("datos.dat"))){
//
//            int[] arrayLeido2 = new int[10];
//            for (int i = 0; i < arrayLeido2.length; i++) {
//                arrayLeido2[i] = in2.readInt();
//            }
//
//            System.out.println("Leo archivo metodo 2");
//            System.out.println(Arrays.toString(arrayLeido2));
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }


        try(ObjectOutputStream outHimno = new ObjectOutputStream(new FileOutputStream("himno.dat"))) {

            String himno = """
                    La bandera blanca y verde
                    vuelve, tras siglos de guerra,
                    a decir paz y esperanza
                    bajo el sol de nuestra tierra
                    """;
                    outHimno.writeObject(himno);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }



        try (ObjectInputStream inHimno = new ObjectInputStream(new FileInputStream("himno.dat"))){

            String himnoLeido = (String) inHimno.readObject();

            System.out.println("LEO EL HIMNO");
            System.out.println(himnoLeido);
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}