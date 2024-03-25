package Ejercicios_Trimestre2.Repaso1;

abstract public class Poligono {
    double base;
    double altura;
    Color color;

    enum Color{BLANCO("Blanco"),NEGRO("Negro");
    String color;
     Color(String color){
         this.color = color;
     }
    }

    Poligono(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        if(base > 0){
        this.base = base;}
    }

    public void setAltura(double altura) {
       if(altura > 0){
           this.altura = altura;}
    }

    abstract double area();
}
