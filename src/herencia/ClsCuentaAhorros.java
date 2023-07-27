
package herencia;

/**
 * @author Usuario
 */
public class ClsCuentaAhorros extends ClsCuenta {
    // atributo
    private boolean activa;
    
    
    // constructor
    public ClsCuentaAhorros(float saldo, float tasa){
        super(saldo,tasa);
        if(saldo<10000){ 
            activa = false;
        }else{ 
            activa = true;
        }    
    }
    
    @Override
    public void retirar(float cantidad){
        if(activa)
            super.retirar(cantidad);
    }
    
    @Override
    public void consignar(float cantidad) {
        if (activa)
            super.consignar(cantidad);
    }
    
    public void extractoMensual() {
        if (numeroRetiros > 4) {
        comisionMensual += (numeroRetiros - 4) * 1000;
    }
    super.extractoMensual();
        if ( saldo < 10000 )
        activa = false;
    }

    public void imprimir() {
        System.out.println("Saldo = Q. " + saldo);
        System.out.println("Comision mensual = Q. " + comisionMensual);
        System.out.println("Número de transacciones = " + (numeroConsignacion + numeroRetiros));
        System.out.println();
    }
    
} 

