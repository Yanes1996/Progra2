package herencia;

public class ClsCuentaCorriente extends ClsCuenta{
    //atributo
    float sobregiro;
    
    //constructor 
    public ClsCuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobregiro = 0;
    }
    
    public void retirar(float cantidad) {
        float resultado = saldo - cantidad; 
        
        if (resultado < 0) {
            sobregiro = sobregiro - resultado;
            saldo = 0;
        } else {
        super.retirar(cantidad); 
        }
    }
    
    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad;    
            
        if (sobregiro > 0) {
            if ( residuo > 0) { 
                sobregiro = 0;
                saldo = residuo;
            } else { 
                sobregiro = -residuo;
                saldo = 0;
            }
        } else {
                super.consignar(cantidad); 
        }
    }

    public void extractoMensual() {
        super.extractoMensual(); 
    }    
    
    public void imprimir() {
        System.out.println("Saldo = Q. " + saldo);
        System.out.println("Cargo mensual = Q." + comisionMensual);
        System.out.println("Número de transacciones = " + (numeroConsignacion + numeroRetiros));
        System.out.println("Valor de sogregiro = Q. " + (numeroConsignacion + numeroRetiros));
        System.out.println();
    }
}
