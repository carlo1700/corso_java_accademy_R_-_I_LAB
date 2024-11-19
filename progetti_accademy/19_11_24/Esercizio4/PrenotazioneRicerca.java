import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PrenotazioneRicerca {
    public static void main(String[] args) {
        // Definizione delle costanti per righe e colonne
        final int RIGHE = 3;// 3 righe
        final int COLONNE = 8;// 8 colonne
        final int POSTI_TOTALI = RIGHE * COLONNE;
        
        // Lista per memorizzare le prenotazioni
        ArrayList<String> prenotazioni = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ciclo principale per il menu
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Prenotare un posto");
            System.out.println("2. Cercare prenotazioni per nome");
            System.out.println("3. Visualizzare posti disponibili e prenotati");
            System.out.println("4. Generare report");
            System.out.println("5. Uscire");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline rimasto dopo nextInt()

            switch (scelta) {
                case 1:
                    // Prenotare un posto
                    System.out.print("Inserisci nome cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Inserisci fila (1-3): ");
                    int riga = scanner.nextInt();
                    System.out.print("Inserisci colonna (1-8): ");
                    int colonna = scanner.nextInt();
                    // Verifica che la riga e la colonna sono validi
                    if (riga < 1 || riga > RIGHE || colonna < 1 || colonna > COLONNE) {
                        System.out.println("Posizione non valida. Le righe sono da 1 a " + RIGHE + " e le colonne da 1 a " + COLONNE);
                        break;
                    }
                    // Verifica se il posto è già prenotato
                    boolean postoOccupato = false;
                    for (String p : prenotazioni) {
                        if (p.equals(nomeCliente + " - Riga: " + riga + ", Colonna: " + colonna)) {
                            postoOccupato = true;
                            break;
                        }
                    }
                    if (postoOccupato) {
                        System.out.println("Il posto in riga " + riga + " colonna " + colonna + " è già prenotato.");
                    } else {
                        // Aggiungi la prenotazione
                        prenotazioni.add(nomeCliente + " - Riga: " + riga + ", Colonna: " + colonna);
                        System.out.println("Posto prenotato con successo per " + nomeCliente + " in riga " + riga + " colonna " + colonna);
                    }
                    break;
                case 2:
                    // Cercare prenotazioni per nome
                    System.out.print("Inserisci nome cliente da cercare: ");
                    String nomeCercato = scanner.nextLine();
                    boolean trovato = false;
                    for (String p : prenotazioni) {
                        if (p.contains(nomeCercato)) {
                            System.out.println(p);
                            trovato = true;
                        }
                    }
                    if (!trovato) {
                        System.out.println("Nessuna prenotazione trovata per il cliente: " + nomeCercato);
                    }
                    break;
                case 3:
                    // Visualizzare posti disponibili e prenotati
                    System.out.println("Posti totali (3 righe x 8 colonne):");
                    for (int r = 1; r <= RIGHE; r++) {
                        for (int c = 1; c <= COLONNE; c++) {
                            boolean prenotato = false;
                            for (String p : prenotazioni) {
                                if (p.contains("Riga: " + r + ", Colonna: " + c)) {
                                    prenotato = true;
                                    break;
                                }
                            }
                            if (prenotato) {
                                System.out.print("[X] "); // Posto prenotato
                            } else {
                                System.out.print("[ ] "); // Posto disponibile
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    // Generare il report
                    int postiPrenotati = prenotazioni.size();
                    System.out.println("\nReport:");
                    System.out.println("Posti totali: " + POSTI_TOTALI);
                    System.out.println("Posti prenotati: " + postiPrenotati);
                    System.out.println("Posti disponibili: " + (POSTI_TOTALI - postiPrenotati));
                    break;
                case 5:
                    // Uscita dal programma
                    System.out.println("Chiusura del sistema...");
                    scanner.close();
                    return; // Termina il programma
                default:
                    System.out.println("Opzione non valida.");
                    break;
            }
        }

    }
}
