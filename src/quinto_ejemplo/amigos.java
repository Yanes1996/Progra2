package quinto_ejemplo;

public class amigos {
/**
* Método main
     * @param args
*/
    public static void main(String[] args) {
        
    int suma = 0; // Variable que sumará los divisiores de un número
    int numero1 = 220; // Definición del primer número
    int numero2 = 284; // Definición del segundo número

// Suma todos los divisores del número 1
    for(int i = 1; i < numero1; i++) {
        if (numero1 % i == 0) {
        suma = suma + i;
        }
    }
    
// Si la suma de los divisores del número 1 es igual al número 2
    if (suma == numero2) {
        suma = 0;
        
// Suma los divisores del número 2
        for(int i = 1; i < numero2; i++) {
            if (numero2 % i == 0) {
            suma= suma + i;
            }
        }
    
// Si la suma de los divisores de ambos números son iguales
        if (suma == numero1) {
            System.out.println(numero1 + " y " + numero2 + " son amigos");
            } else {
            System.out.println(numero1 + " y " + numero2 + " no son amigos");
            }   
        } else {
        System.out.println(numero1 + " y " + numero2 + " no son amigos");
        }
    }   
}
