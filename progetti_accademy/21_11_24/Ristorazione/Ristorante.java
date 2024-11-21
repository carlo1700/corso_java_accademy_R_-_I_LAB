package Ristorazione;

import java.util.ArrayList;

public class Ristorante {

    // Le collezioni per piatti e valutazioni
    private ArrayList<String> piatti = new ArrayList<>();
    private ArrayList<Integer> valutazioni = new ArrayList<>();

    // Metodo per aggiungere un piatto
    public void aggiungiPiatto(String piatto) {
        piatti.add(piatto);
    }

    // Metodo per aggiungere una valutazione
    public void aggiungiValutazione(int valutazione) {
        valutazioni.add(valutazione);
    }

    // Metodo per stampare i piatti
    public void stampaPiatti() {
        System.out.println("Piatti disponibili:");
        for (String piatto : piatti) {
            System.out.println("- " + piatto);
        }
    }

    // Metodo per stampare le valutazioni
    public void stampaValutazioni() {
        System.out.println("Valutazioni piatti:");
        for (int valutazione : valutazioni) {
            System.out.println("- " + valutazione);
        }
    }
}
