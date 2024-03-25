package Ejercicios_Trimestre2.Reloj;

public class Hora {

   private int hora,minuto,segundo;

    Hora(int hora, int minuto, int segundo){
    setHora(hora);
    setMinuto(minuto);
    setSegundo(segundo);
    }

    public void setHora(int hora) {

        int contador = this.hora + hora;

        if(contador >= 24 ){
            this.hora = 0;

        }else{
        this.hora += hora;
        }

//        int reloj = hora + this.hora;
//
//        if(reloj > 24 ){
//            this.hora -= 24;
//        }
    }

    public void setMinuto(int minuto) {

        int contador = this.minuto + minuto;
        while(contador >= 60){
            contador -= 60;
            setHora(1);
        }
        this.minuto = contador;

//        int hora = minuto/60;
//
//       if(hora <= 1){
//           setHora(hora);
//       }
//       this.minuto += minuto - (hora * 60) ;
    }

    public void setSegundo(int segundo) {

        int contador = this.segundo + segundo;
        while(contador >= 60 ){
            contador -= 60;
            setMinuto(1);
        }
        this.segundo = contador;

//        int minuto = segundo/60;
//        if(minuto >= 1){
//            setMinuto(minuto);
//        }
//        this.segundo += segundo - (minuto * 60) ;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
}