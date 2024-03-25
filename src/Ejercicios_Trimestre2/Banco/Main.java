package Ejercicios_Trimestre2.Banco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean menu = true;
        Scanner sc = new Scanner(System.in);
        Banco ING = new Banco();

    while(menu){
        int opcion;
        System.out.println("Introduce que operación desea realizar");
        System.out.println("""
                ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                ┃           Seleccione la operación:            ┃
                ┃ 1.- Crear cuenta                              ┃
                ┃ 2.- Realizar Transferencia                    ┃
                ┃ 3.-                                           ┃
                ┃ 4.-                                           ┃
                ┃ 5.-                                           ┃
                ┃ 6.-                                           ┃
                ┃ 7.-                                           ┃
                ┃ 8.- Mostrar saldo total del Banco             ┃
                ┃ 9.- Mostrar Cuentas                           ┃
                ┃ 0.- SALIR                                     ┃
                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                """);
        opcion = sc.nextInt();
        switch (opcion){

            case 1 ->{
                System.out.println("""
                ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                ┃           Como desea crear su cuenta:         ┃
                ┃ 1.- Uso propio                                ┃
                ┃ 2.- Mediante gestor                           ┃
                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                """);
                opcion = sc.nextInt();
                switch (opcion){

                    case 1 -> {
                        System.out.println("Introduce el nombre del titular: ");
                        String titular = sc.next();
                        System.out.println("Introduce el dni del titular: ");
                        String dni = sc.next();
                        System.out.println("Introduce saldo inicial: ");
                        double saldo = sc.nextDouble();
                        CuentaCorriente cuentaNueva = new CuentaCorriente(titular, dni, saldo);
                        System.out.println("Su cuenta se ha creado correctamente");
                        ING.agregarCuenta(cuentaNueva);
                        System.out.println("Su cuenta ha sido agregada al banco correctamente");
                    }
                    case 2 ->{
                        System.out.println("Introduce el nombre del titular: ");
                        String titular = sc.next();
                        System.out.println("Introduce el dni del titular: ");
                        String dni = sc.next();
                        System.out.println("Introduce saldo inicial: ");
                        double saldo = sc.nextDouble();
                        System.out.println("Introduce el nombre del gestor");
                        String nombreGestor = sc.next();
                        System.out.println("Introduce telefono del gestor");
                        String telefonoGestor = sc.next();
                        Gestor nuevoGestor = new Gestor(nombreGestor,telefonoGestor);
                        CuentaCorriente cuentaNueva = new CuentaCorriente(titular, dni, saldo, nuevoGestor);
                        System.out.println("Su cuenta se ha creado correctamente");
                        ING.agregarCuenta(cuentaNueva);
                        System.out.println("Su cuenta ha sido agregada al banco correctamente");
                    }
                    default -> System.out.println("Opción no válida. Por favor, seleccione una opción válida.");

                }
            }

            case 2 ->{

                int indiceOrigen;
               do {
                   System.out.println("Introduce titular de la cuenta de origen");
                   String origen = sc.next();
                   indiceOrigen = ING.buscarCliente(origen);
               }while(indiceOrigen == -1);

               int indiceDestino;
               do {
                   System.out.println("Introduce el titular de la cuenta de destino");
                   String destino = sc.next();
                   indiceDestino = ING.buscarCliente(destino);
               }while(indiceDestino == -1);

                System.out.println("Introduce la cantidad a transferir");
                double cantidad = sc.nextDouble();
                ING.realizarTransferencia(ING.cuentas[indiceOrigen],ING.cuentas[indiceDestino],cantidad);
            }


            case 3 ->{}
            case 4 ->{}
            case 5 ->{}
            case 6 ->{}
            case 7 ->{
                int indice;
                String nombre;
                        do {
                            System.out.println("Introduce el nombre del cliente");
                             nombre = sc.next();
                            indice = ING.buscarCliente(nombre);
                        }while(indice == -1);

                System.out.println("Introduce el nombre del nuevo banco");
                String nuevoBanco = sc.next();
                ING.cuentas[indice].setNombreBanco(nuevoBanco);
                System.out.println("Cambio realizado.");
                System.out.println("El cliente " + nombre + ". Ahora pertenece al banco " + nuevoBanco);
            }
            case 8 ->ING.obtenerSaldoTotal();
            case 9 ->ING.mostrarCuentas();
            case 0 -> menu = false;
            default -> System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
    }
}
        System.out.println("Gracias por su visita. Vuelva pronto.");
    }
}