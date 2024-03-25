package Ejercicios_Trimestre2.Banco;

import java.util.Arrays;

public class Banco {

    CuentaCorriente[] cuentas;
    public Banco(){
        cuentas = new CuentaCorriente[1];
    }

    void agregarCuenta(CuentaCorriente cuenta){

        cuentas[cuentas.length-1] = cuenta;
        cuentas = Arrays.copyOf(cuentas,cuentas.length+1);
    }
    int buscarCliente(String titular){

        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < cuentas.length-1; i++) {
            if(cuentas[i].titular.equals(titular)){
                indice = i;
                encontrado = true;
                break;
            }else{
                indice = -1;
            }
        }

        if(encontrado){
            System.out.println("Cliente encontrado");
        }else {
            System.out.println("ERROR cliente no encontrado");
        }
        return indice;

    }
    void realizarTransferencia(CuentaCorriente origen, CuentaCorriente destino, double cantidad) {

        if (cantidad > 0) {
            for (int i = 0; i < cuentas.length - 1; i++) {
                if (cuentas[i].titular.equals(origen.titular)) {

                    cuentas[i].sacarDinero(cantidad);
                    System.out.println("El saldo de " + cuentas[i].titular + " se ha reducido en " + cantidad + ". Acutalmente tiene " + cuentas[i].getSaldo() + " Euros en su cuenta.");
                }
            }

            for (int l = 0; l < cuentas.length - 1; l++) {
                if (cuentas[l].titular.equals(destino.titular)) {
                    cuentas[l].ingresarDinero(cantidad);
                    System.out.println("El saldo de " + cuentas[l].titular + " se ha aumentado en " + cantidad + ". Acutalmente tiene " + cuentas[l].getSaldo() + " Euros en su cuenta.");
                }
            }
        }else{
            System.out.println("ERROR. No se puede realizar una transferencia negativa");
        }
    }
    void obtenerSaldoTotal(){
        double saldoTotal = 0;
        for (int i = 0; i < cuentas.length-1; i++) {
            saldoTotal += cuentas[i].getSaldo();
        }
        System.out.println("El Banco tiene un total de " + saldoTotal + " Euros de sus clientes.");
    }

    void mostrarCuentas(){
        for (int i = 0; i < cuentas.length-1; i++) {
            cuentas[i].mostrarCuenta();
        }
    }








}
