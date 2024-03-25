package Ejercicios_Trimestre2.Repaso1;

import java.util.Scanner;

public class Rectangulo extends Poligono{

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    double area() {
        return base*altura;
    }
}