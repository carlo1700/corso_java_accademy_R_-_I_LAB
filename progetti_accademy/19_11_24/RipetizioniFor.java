import java.util.Arrays;

public class RipetizioniFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int[] colori = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < colori.length; i++) {
            System.out.println("Colore: " + colori[i]);
        }

        int[] numeri = { 5, 10, 15, 20 };

        // Stampa dell'array come stringa
        System.out.println("Array: " + Arrays.toString(numeri));
        // Output: Array: [5, 10, 15, 20]


        for (int numero : numeri) {
            System.out.println("Numero: " + numero);  }



    }
}
