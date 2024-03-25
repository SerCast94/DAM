package Ejercicios_Trimestre2.IntrumentoPiano;

abstract class Instrumento {
 String[] notas = new String[7];
 enum Nota  {DO,RE,MI,FA,SOL,LA,SI}
 Nota notasmusicales;

 abstract void add();

 abstract void interpretar();

}
