package Ejercicios_Trimestre2.Repaso1;

public class Triangulo extends Poligono{

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    double area() {
        return base*altura/2;
    }
}