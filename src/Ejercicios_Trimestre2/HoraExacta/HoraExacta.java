package Ejercicios_Trimestre2.HoraExacta;

public class HoraExacta extends Hora{
int segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        setSegundo(segundo);
    }

    public void setSegundo(int segundo) {

        if(getSegundo() >= 0 && getSegundo() <= 59){
        this.segundo = segundo;
        }else{
            setMinuto(getMinuto()+1);
            setSegundo(getSegundo()-60);
        }
    }

    public int getSegundo() {
        return segundo;
    }

   public void inc(){
        if(getSegundo()+1 == 60){
            setSegundo(0);
            setMinuto(getMinuto()+1);
        }else{
            setSegundo(getSegundo()+1);
        }
       super.inc();

   }

    @Override
    public String toString() {
    String cad = super.toString();
        cad += ":";
        if (getSegundo() < 10){
            cad += "0" + getSegundo();
        }else{cad += getSegundo();

        }
        return cad;
    }

    @Override
    public boolean equals(Object obj) {
        boolean igual;
        Hora hora = (Hora) obj;
        if(hora.getHora() == getHora() && hora.getMinuto() == getMinuto()){

            igual = true;
        }else igual = false;

        return igual;
    }
}