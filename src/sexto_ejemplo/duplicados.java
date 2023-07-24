package sexto_ejemplo;

public class duplicados {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 4, 5, 2}; /* Definición de un array de datos int */
        
        System.out.println("Elementos del array");
        // Imprime los elementos del array

        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento [" + i + "] = " + array[i]);
        }
        for (int i = 0; i < array.length - 1; i++) { /* Primer ciclo que recorre el array */
        
            for (int j = i+1; j < array.length; j++) { /* Segundo ciclo que recorre el array */

                /* Evalúa si los elementos son iguales y están en posiciones diferentes */
                if ((array[i] == array[j]) && (i != j)) {
                    System.out.println("Elemento duplicado: " + array[j]);
                }
            }
        }
    }   
}
