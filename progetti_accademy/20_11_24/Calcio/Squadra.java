package Calcio;

public class Squadra {
    // Array per contenere 12 calciatori
    public Calciatore[] calciatori;

    // Costruttore
    public Squadra() {
        // Inizializzo l'array con 12 calciatori
        calciatori = new Calciatore[12];
    }

    // Metodo per aggiungere un calciatore alla squadra
    public void aggiungiCalciatore(int indice, String nome, String ruolo) {
        if (indice >= 0 && indice < 12) {
            calciatori[indice] = new Calciatore(nome, ruolo);
        } else {
            System.out.println("Indice fuori dal range. Devi inserire un indice tra 0 e 11.");
        }
    }

    // Metodo per stampare i dettagli di tutti i calciatori
    public void stampaSquadra() {
        for (int i = 0; i < calciatori.length; i++) {
            if (calciatori[i] != null) {
                calciatori[i].stampaDettagli();
            }
        }
    }
}

