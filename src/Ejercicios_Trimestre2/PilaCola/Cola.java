package Ejercicios_Trimestre2.PilaCola;

import java.util.Arrays;

public interface Cola {
     void encolar(Integer nuevo);
     void desencolar();

     default void encolarmultiple(Integer numeroencolar, int repeticiones){

          for (int i = 0; i < repeticiones; i++) {
               encolar(numeroencolar);
          }
     };
}