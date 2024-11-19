import java.util.Scanner;

public class Esercizio1_extra {
    public static void main(String[] args) {
        // Definisco un array statico con una dimensione massima
        int[] numeri = new int[10];  // Ad esempio, un array di 10 elementi
        int indice = 0;
        int somma = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci massimo 10 numeri positivi (un numero negativo per terminare):");

        // Ciclo per prendere i numeri da tastiera
        while (indice < numeri.length) {
            System.out.print("Inserisci un numero: ");
            int numero = scanner.nextInt();

            // Se l'utente inserisce un numero negativo, interrompo il ciclo
            if (numero < 0) {
                break;
            }

            // Determino se il numero è pari o dispari
            if (numero % 2 == 0) {
                System.out.println(numero + " è pari.");
            } else {
                System.out.println(numero + " è dispari.");
            }

            // Aggiungo il numero all'array e incremento l'indice
            numeri[indice] = numero;
            indice++;
        }

        // Calcolo la somma degli elementi inseriti
        for (int i = 0; i < indice; i++) {
            somma += numeri[i];
        }

        // Stampo la somma
        System.out.println("La somma dei numeri inseriti è: " + somma);

        scanner.close();
    }
}
