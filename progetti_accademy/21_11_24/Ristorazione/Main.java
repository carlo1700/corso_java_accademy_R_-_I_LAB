package Ristorazione;

import java.util.*;

public class Main {

    // Classe Utente (figlia di Ristorante)
    public static class Utente extends Ristorante {
        protected String nome;
        protected String email;
        protected float soldi;

        public Utente(String nome, String email) {
            this.nome = nome;
            this.email = email;
            this.soldi = new Random().nextFloat() * 1000;  // Soldi random tra 0 e 1000
        }

        // Metodo per visualizzare i dati dell'utente
        public void visualizzaDati() {
            System.out.println("Nome: " + nome);
            System.out.println("Email: " + email);
            System.out.println("Soldi: " + soldi);
        }

        // Metodo per interagire con il profilo
        public void interagisciConProfilo(Scanner scanner) {
            System.out.println("Cosa vuoi fare? 1. Visualizza dati 2. Esci");
            int scelta = scanner.nextInt();
            switch (scelta) {
                case 1:
                    visualizzaDati();
                    break;
                case 2:
                    System.out.println("Uscita dal profilo.");
                    break;
            }
        }
    }

    // Classe Chef (figlia di Utente)
    public static class Chef extends Utente {
        private int numPiattiInseriti = 0;

        public Chef(String nome, String email) {
            super(nome, email);
        }

        public void aggiungiPiatto(String piatto) {
            super.aggiungiPiatto(piatto);
            numPiattiInseriti++;
            if (numPiattiInseriti >= 3) {
                System.out.println("Sei diventato un ChefCapo!");
            }
        }

        @Override
        public void interagisciConProfilo(Scanner scanner) {
            System.out.println("Cosa vuoi fare? 1. Visualizza dati 2. Aggiungi piatto 3. Visualizza piatti 4. Esci");
            int scelta = scanner.nextInt();
            scanner.nextLine();  // Consuma il newline
            switch (scelta) {
                case 1:
                    visualizzaDati();
                    break;
                case 2:
                    System.out.println("Inserisci il nome del piatto:");
                    String piatto = scanner.nextLine();
                    aggiungiPiatto(piatto);
                    break;
                case 3:
                    stampaPiatti();
                    break;
                case 4:
                    System.out.println("Uscita dal profilo Chef.");
                    break;
            }
        }
    }

    // Classe Critico (figlia di Utente)
    public static class Critico extends Utente {
        private int numRecensioni = 0;

        public Critico(String nome, String email) {
            super(nome, email);
        }

        public void aggiungiRecensione(int valutazione) {
            super.aggiungiValutazione(valutazione);
            numRecensioni++;
            if (numRecensioni >= 3) {
                System.out.println("Sei diventato un CriticoForte!");
            }
        }

        @Override
        public void interagisciConProfilo(Scanner scanner) {
            System.out.println("Cosa vuoi fare? 1. Visualizza dati 2. Aggiungi recensione 3. Visualizza valutazioni 4. Esci");
            int scelta = scanner.nextInt();
            switch (scelta) {
                case 1:
                    visualizzaDati();
                    break;
                case 2:
                    System.out.println("Inserisci la valutazione (1-5):");
                    int valutazione = scanner.nextInt();
                    aggiungiRecensione(valutazione);
                    break;
                case 3:
                    stampaValutazioni();
                    break;
                case 4:
                    System.out.println("Uscita dal profilo Critico.");
                    break;
            }
        }
    }

    // Metodo principale (Main)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Apre lo scanner
        List<Utente> utenti = new ArrayList<>();
        boolean continua = true;

        while (continua) {
            System.out.println("Menu:");
            System.out.println("1. Crea nuovo utente");
            System.out.println("2. Interagisci con il profilo");
            System.out.println("3. Esci");
            System.out.println("Inserisci un numero:");
            int scelta = scanner.nextInt();
            scanner.nextLine();  // Consuma il newline

            switch (scelta) {
                case 1:
                    // Creazione di un nuovo utente
                    System.out.println("Inserisci il tuo nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Inserisci la tua email:");
                    String email = scanner.nextLine();
                    System.out.println("Sei un 1. Chef o 2. Critico?");
                    int tipoUtente = scanner.nextInt();
                    scanner.nextLine();  // Consuma il newline

                    Utente utente = null;
                    if (tipoUtente == 1) {
                        utente = new Chef(nome, email);
                    } else if (tipoUtente == 2) {
                        utente = new Critico(nome, email);
                    }
                    utenti.add(utente);
                    break;

                case 2:
                    // Interagire con il profilo di un utente esistente
                    boolean interagisciConUtente = true;
                    while (interagisciConUtente) {
                        System.out.println("Seleziona l'utente (0 per tornare al menu):");
                        for (int i = 0; i < utenti.size(); i++) {
                            System.out.println(i + 1 + ". " + utenti.get(i).nome);
                        }
                        int sceltaUtente = scanner.nextInt();
                        if (sceltaUtente == 0) {
                            // Torna al menu principale
                            interagisciConUtente = false;
                        } else if (sceltaUtente > 0 && sceltaUtente <= utenti.size()) {
                            // Chiamata al metodo per interagire con il profilo selezionato
                            utenti.get(sceltaUtente - 1).interagisciConProfilo(scanner);
                        } else {
                            System.out.println("Selezione non valida.");
                        }
                    }
                    break;

                case 3:
                    continua = false;
                    break;
            }
        }

        scanner.close();  // Chiude lo scanner quando il programma termina
        System.out.println("Programma terminato.");
    }
}
