import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EsercizioPenne {
    // Dichiarazione delle variabili di istanza
    ArrayList<int[]> spedizioni = new ArrayList<>();
    ArrayList<Date> dateSpedizioni = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EsercizioPenne gestione = new EsercizioPenne();
        gestione.menu();
    }

    public void menu(){
        while (true) {
            // Menu interattivo per l'utente
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi una spedizione");
            System.out.println("2. Visualizza tutte le spedizioni");
            System.out.println("3. Calcolare il totale delle penne per colore");
            System.out.println("4. Ricerca per colore");
            System.out.println("5. Esci");
            System.out.print("Scegli un'opzione: ");
            
            int input = scanner.nextInt();
            
            switch (input) {
                case 1:
                    aggiungiSpedizione();
                    break;
                case 2:
                    visualizzaSpedizioni();
                    break;
                case 3:
                    totalePenne();
                    break;
                case 4:
                    ricercaColore();
                    break;
                case 5:
                    terminaFunzione();
                    return;  // Esci dal ciclo e termina il programma
                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
        }
    }

    public void aggiungiSpedizione(){
        // Aggiungi una spedizione
        System.out.println("Inserisci la quantità di penne per colore (Rosso, Blu, Verde, Nero):");
        System.out.print("Rosso: ");
        int rosso = scanner.nextInt();
        System.out.print("Blu: ");
        int blu = scanner.nextInt();
        System.out.print("Verde: ");
        int verde = scanner.nextInt();
        System.out.print("Nero: ");
        int nero = scanner.nextInt();
        
        // Crea un array che rappresenta la spedizione (4 valori per i colori)
        int[] spedizione = {rosso, blu, verde, nero};
        spedizioni.add(spedizione);
        
        // Registra la data e l'ora della spedizione
        Date dataSpedizione = new Date(); // Data e ora corrente
        dateSpedizioni.add(dataSpedizione);
        
        System.out.println("Spedizione aggiunta!");
    }

    public void visualizzaSpedizioni(){
        // Visualizza tutte le spedizioni
        if (spedizioni.isEmpty()) {
            System.out.println("Non ci sono spedizioni.");
        } else {
            System.out.println("Lista delle spedizioni:");
            for (int i = 0; i < spedizioni.size(); i++) {
                int[] s = spedizioni.get(i);
                Date data = dateSpedizioni.get(i);
                System.out.println("Spedizione " + (i + 1) + " -> Rosse: " + s[0] + ", Blu: " + s[1] + ", Verde: " + s[2] + ", Nero: " + s[3] + ", Data: " + data.toString());
            }
        }
    }

    public void totalePenne(){
        // Calcola il totale delle penne per colore
        int totaleRosse = 0, totaleBlu = 0, totaleVerde = 0, totaleNero = 0;
                    
        for (int[] s : spedizioni) {
            totaleRosse += s[0];
            totaleBlu += s[1];
            totaleVerde += s[2];
            totaleNero += s[3];
        }
        
        System.out.println("Totale penne Rosse: " + totaleRosse);
        System.out.println("Totale penne Blu: " + totaleBlu);
        System.out.println("Totale penne Verde: " + totaleVerde);
        System.out.println("Totale penne Nero: " + totaleNero);
    }

    public void ricercaColore(){
        // Ricerca per colore
        System.out.print("Inserisci il colore da cercare (Rosso, Blu, Verde, Nero): ");
        String colore = scanner.next().toLowerCase();
        boolean trovato = false;

        switch (colore) {
            case "rosso":
                for (int[] s : spedizioni) {
                    if (s[0] > 0) {
                        trovato = true;
                        break;
                    }
                }
                break;
            case "blu":
                for (int[] s : spedizioni) {
                    if (s[1] > 0) {
                        trovato = true;
                        break;
                    }
                }
                break;
            case "verde":
                for (int[] s : spedizioni) {
                    if (s[2] > 0) {
                        trovato = true;
                        break;
                    }
                }
                break;
            case "nero":
                for (int[] s : spedizioni) {
                    if (s[3] > 0) {
                        trovato = true;
                        break;
                    }
                }
                break;
            default:
                System.out.println("Colore non valido.");
                break;
        }

        if (trovato) {
            System.out.println("Esiste almeno una spedizione con penne " + colore + ".");
        } else {
            System.out.println("Non esistono spedizioni con penne " + colore + ".");
        }
    }

    public void terminaFunzione(){
        // Esci
        System.out.println("Arrivederci!");
        scanner.close();
    }
    
}
