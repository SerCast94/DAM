package Ejercicios_Trimestre2.HoraExacta;

import java.util.Scanner;

public class Hora {

    private int hora, minuto;

    public Hora(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setHora(int hora) {
        Scanner sc = new Scanner(System.in);
        if (hora < 24 && hora >= 0) {
            this.hora = hora;
        } else {
            while (hora < 0 || hora >= 23) {
                System.out.println("Hora no valida.");
                System.out.println("Introduce hora.");
                hora = sc.nextInt();
            }
        }
    }

    public void setMinuto(int minuto) {
        Scanner sc = new Scanner(System.in);
        if (minuto < 60 && minuto >= 0) {
            this.minuto = minuto;
        } else {
            while (minuto < 0 || minuto > 59) {
                System.out.println("Minutos no válidos");
                System.out.println("Introduce minutos");
                minuto = sc.nextInt();
            }
        }
    }

    boolean setMinutosBolean(int valor) {
        boolean sepuede;
        if (valor < 60 && valor >= 0) {
            this.minuto = valor;
            sepuede = true;
        } else {
            sepuede = false;
        }
        return sepuede;
    }

    boolean setHoraBolean(int valor) {
        boolean sepuede;
        if (valor < 24 && valor >= 0) {
            this.hora = valor;
            sepuede = true;
        } else {
            sepuede = false;
        }
        return sepuede;
    }

    void inc() {
        if (getMinuto() + 1 == 60) {
            setMinuto(0);
            if (getHora() + 1 != 24) {
                setHora(getHora() + 1);
            } else {
                setHora(0);
            }
        } else {
            setMinuto(getMinuto() + 1);
        }
    }

    @Override
    public String toString() {
        String cad = "";

        if (getHora() < 10) {
            cad = "0" + getHora();
        } else {
            cad += getHora();
        }
        cad += ":";
        if (getMinuto() < 10) {
            cad += "0" + getMinuto();
        } else cad += getMinuto();

        return cad;
    }
}