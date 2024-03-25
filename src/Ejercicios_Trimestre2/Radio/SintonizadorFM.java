package Ejercicios_Trimestre2.Radio;

public class SintonizadorFM {
   double frecuencia;
   final double frecuenciaMin = 80;
   final double frecuenciaMax = 108;
    String emisora;
    double[] emisorasFrec = {88.5, 90.5, 91.5,92.5, 96.5, 97.0, 98.0, 102.0, 102.5, 105.0, 106.5};
    enum emisoras {CadenaDial, RadioCristiana, EuropaFM, OndaCero, Los40, LocaFM, GozaderaFM, SER, RadioOle, KissFM, RadioMaria}

    void frecuenciaEmisora(int opcion) {
        switch (opcion) {
            case 1 -> this.emisora = String.valueOf(emisoras.CadenaDial);
            case 2 -> this.emisora = String.valueOf(emisoras.RadioCristiana);
            case 3 -> this.emisora = String.valueOf(emisoras.EuropaFM);
            case 4 -> this.emisora = String.valueOf(emisoras.OndaCero);
            case 5 -> this.emisora = String.valueOf(emisoras.Los40);
            case 6 -> this.emisora = String.valueOf(emisoras.LocaFM);
            case 7 -> this.emisora = String.valueOf(emisoras.GozaderaFM);
            case 8 -> this.emisora = String.valueOf(emisoras.SER);
            case 9 -> this.emisora = String.valueOf(emisoras.RadioOle);
            case 10 -> this.emisora = String.valueOf(emisoras.KissFM);
            case 11 -> this.emisora = String.valueOf(emisoras.RadioMaria);
            case 0 -> this.emisora = "No hay emisora en esta frecuencia";
        }
    }

    public SintonizadorFM(double frecuencia) {
        if(frecuencia> this.frecuenciaMin && frecuencia< this.frecuenciaMax){
            this.frecuencia = frecuencia;
        }else{
            this.frecuencia = frecuenciaMin;
        }
    }

    public SintonizadorFM() {
        this.frecuencia = frecuenciaMin;
    }

    public void setFrecuencia(double frecuencia) {
        if (frecuencia > frecuenciaMax) this.frecuencia = frecuenciaMin;
    else if (frecuencia < frecuenciaMin) this.frecuencia = frecuenciaMax;
    else this.frecuencia = frecuencia;
    display();
    }

    public void setFrecuenciaUp() {
       setFrecuencia(getFrecuencia()+0.5);
    }

    public void setFrecuenciaDown() {
       setFrecuencia(getFrecuencia()-0.5);
    }

    public double getFrecuencia() {
        return this.frecuencia;
    }

    public void buscarEmisora(){
        boolean encontrado = false;

        for (int i = 0; i < emisorasFrec.length; i++) {
            if(this.frecuencia == emisorasFrec[i]){
                frecuenciaEmisora((i+1));
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            frecuenciaEmisora(0);
        }
    }

    public void display(){
        System.out.println("Está sintonizando la frecuencia: " + this.frecuencia + " Mhz");
        buscarEmisora();
        System.out.println(this.emisora);
    }

    public void setEmisoraUp(){

        for (int i = 0; i < emisorasFrec.length; i++) {
            if(i != emisorasFrec.length-1 && getFrecuencia() >= emisorasFrec[i] && getFrecuencia() < emisorasFrec[i+1] ){
                setFrecuencia(emisorasFrec[(i+1)]);
                break;
            } else if (i == emisorasFrec.length-1) {
                setFrecuencia(emisorasFrec[0]);
            }
        }
    }
    public void setEmisoraDown(){

        for (int i = 0; i < emisorasFrec.length; i++) {



            }

        }

    }