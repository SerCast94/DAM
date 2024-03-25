package Ejercicios_Trimestre2.Banco;
import java.util.Scanner;

public class CuentaCorriente {

   public String titular;
    String dni;
    private double saldo;
    String nombreBanco = "ING";
    Gestor gestor;

    public CuentaCorriente(String titular, String dni) {
        this.titular = titular;
        this.dni = dni;
        this.saldo = 0;
    }
    public CuentaCorriente(String titular, String dni, Gestor gestor) {
        this.titular = titular;
        this.dni = dni;
        this.saldo = 0;
        this.gestor = gestor;
    }
    public CuentaCorriente(String dni, double saldo){
        this.dni = dni;
        this.saldo = saldo;
    }
    public CuentaCorriente(String titular, String dni, double saldo){
        this.titular = titular;
        this.dni = dni;
        this.saldo = saldo;
    }
    public CuentaCorriente(String titular, String dni, double saldo, Gestor gestor){
        this.titular = titular;
        this.dni = dni;
        this.saldo = saldo;
        this.gestor = gestor;
    }

    void sacarDinero(double cantidad){
        if(cantidad <= saldo && cantidad > 0) { //que no se pueda retirar mas dinero que el saldo disponible y que no se pueda retirar cantidad negativa, ya que lo sumaría.
            this.saldo -= cantidad;
            System.out.println("Se ha retirado " + cantidad + " Euros. Actualmente tiene " + saldo + " en su cuenta.");
        }else{
            System.out.println("Cantidad no disponible.");
        }
    }
    void ingresarDinero(double cantidad){
        if(cantidad > 0) { // evito ingreso negativo porque sería restar saldo.
            this.saldo += cantidad;
        }
    }

    void mostrarCuenta(){
        System.out.println("|-------------------------------------------|");
        System.out.println("Nombre de cliente: " + this.titular);
        System.out.println("DNI del cliente: " + this.dni);
        System.out.println("Saldo del cliente: " + this.saldo + " Euros");
        System.out.println("Esta cuenta pertenece al banco: " + nombreBanco);

        if(this.gestor != null){
            System.out.println("-------  Esta cuenta dispone de un gestor  -------");
            System.out.println("Esta cuenta es gestionada por: " + gestor.nombre);
            System.out.println("Su telefono de contacto es: " + gestor.telefono);
            System.out.println("El importe máximo para el que está autorizado es:  " + gestor.importeMax);
        }
        System.out.println("|-------------------------------------------|");
    }

    double getSaldo(){

        return this.saldo;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

}
