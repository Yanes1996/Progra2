package herencia;

import java.util.*;

public class ClsPruebaCuenta {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
            System.out.println("Cuenta de ahorros");
            
        System.out.println("Ingrese saldo inicial= Q. ");
            float saldoInicialAhorros = input.nextFloat();
            
        System.out.print("Ingrese tasa de interés= ");
            float tasaAhorros = input.nextFloat();
             ClsCuentaAhorros cuenta1 = new ClsCuentaAhorros(saldoInicialAhorros, tasaAhorros);
             
        System.out.print("Ingresar cantidad a consignar: Q. ");
            float cantidadDepositar = input.nextFloat();
            cuenta1.consignar(cantidadDepositar);
            
        System.out.print("Ingresar cantidad a retirar: Q. ");
            float cantidadRetirar = input.nextFloat();
            cuenta1.retirar(cantidadRetirar);
            cuenta1.extractoMensual();
            cuenta1.imprimir();
    }    
}
