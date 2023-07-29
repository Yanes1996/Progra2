// ejemplo de herencia
package herencia;

public class ClsCuenta {
    //atributos
    protected float saldo;
    protected int numeroConsignacion = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;
    
    //constructor
    public ClsCuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    //metodos
    public void consignar(float cantidad){
        saldo = saldo + cantidad;
        numeroConsignacion = numeroConsignacion + 1;
    }
    
    public void retirar(float cantidad){
        float nuevoSaldo = saldo - cantidad;
        
        if(nuevoSaldo >= 0){
            saldo -= cantidad;
            numeroRetiros = numeroRetiros + 1;
        }else {
            System.out.println("La cantidad a retirar es mayor al saldo actual");
        }
    }
    
    public void calcularInteres(){
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }
    
    public void extractoMensual(){
        saldo -= comisionMensual;
        calcularInteres();
    }
}
