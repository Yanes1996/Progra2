/*
Clase que define a una persona 
*/
package persona;

/**
 * @author Usuario
*/
public class ClsPersona {
    // atributos de la clase persona
    String nombre;
    String apellido;
    String edad;
    String carnet;
    String telefono;
    
    // constructor de la clase persona
    ClsPersona(String nombre, String apellido, String edad, String carnet, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carnet = carnet;
        this.telefono = telefono;
    }
    
    //metodo que imprime la clase persona
    void imprmir(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Edad = " + edad);
        System.out.println("Carnet = " + carnet);
        System.out.println("Telefono = " + telefono);
        System.out.println();
    }
    
    //metodo main
    public static void main(String arg[]){
        ClsPersona p1 = new ClsPersona ("Byron","Fajardo","19","012023","4545-7878");
        ClsPersona p2 = new ClsPersona ("Josue","Ralon","25","022023","5544-9988");
        p1.imprmir();
        p2.imprmir();
    }
}
