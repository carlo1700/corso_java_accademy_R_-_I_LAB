package Calcio;

import java.util.Random;

public class Partita {
    // Due squadre che partecipano alla partita
    public Squadra squadra1;
    public Squadra squadra2;

    // Costruttore
    public Partita(Squadra squadra1, Squadra squadra2) {
        this.squadra1 = squadra1;
        this.squadra2 = squadra2;
    }

    // Metodo per simulare la partita e ottenere il punteggio random
    public void simulaPartita() {
        Random random = new Random();
        
        // Punteggi random per le due squadre
        int punteggioSquadra1 = random.nextInt(6); // Punteggio tra 0 e 5
        int punteggioSquadra2 = random.nextInt(6); // Punteggio tra 0 e 5

        // Stampa il risultato della partita
        System.out.println("Risultato partita:");
        System.out.println("Squadra 1: " + punteggioSquadra1 + " - " + punteggioSquadra2 + " :Squadra 2");
    }
}

