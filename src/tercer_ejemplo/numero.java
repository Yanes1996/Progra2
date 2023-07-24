package tercer_ejemplo;

public class numero {
    
    public static void main(String args[]) {
        
        int numeroOriginal, últimoDigito; /* Variables para el número original y su último dígito */
        double dígitos; // Cantidad de dígitos que tiene el número
        double suma = 0; /* Variable que sumará los dígitos elevados a su cantidad de dígitos */
        
        int numero = 400; /* Número a determinar si es un número de Amstrong */
        numeroOriginal = numero; /* Copia el valor del número para su procesamiento */
        dígitos = Math.floor(Math.log10(numero)) + 1; /* Calcula el total de dígitos del número */

// Calcula la suma de potencia de digitos
        while (numero > 0) {
            últimoDigito = numero % 10; // Extrae el último dígito
    
// Calcula la suma de potencias del último dígito
            suma = suma + Math.pow(últimoDigito, dígitos);
            numero = numero / 10; // Elimina el último dígito
        }
    
/* Verifica si es un número de Armstrong si la suma obtenida es igual al número */
        if (numeroOriginal == suma) {
        System.out.println(numeroOriginal + " es un número de Amstrong");
        } else {
            System.out.println(numeroOriginal + " no es un número de  Amstrong");
        }
    }    
}
