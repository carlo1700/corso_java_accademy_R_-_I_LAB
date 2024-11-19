import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        //stampa di inserire un numero
        System.out.println("Inserisci un numero positivo, se negativo termina: ");
        //inizializza i per entrare nel loop
        int i = 0;
        //controllo se pari o dispari finché i è maggiore o uguale a 0
        while (i >= 0) {
            Scanner input = new Scanner(System.in);
            i = input.nextInt();
            //se è minore di 0 esce dal loop
            if( i < 0){
                break;
            }
            //controlla se pari
            if (i % 2 == 0){
                System.out.println("il numero inserito è pari");
                System.out.println("Inserisci un numero positivo, se negativo termina: ");

            }
            //controlla se dispari
            else{
                System.out.println("il numero inserito è dispari");
                System.out.println("Inserisci un numero positivo, se negativo termina: ");

            }
        }
    }
}
