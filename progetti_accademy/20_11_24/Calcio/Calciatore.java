package Calcio;

public class Calciatore {
    // Variabili di istanza
    public String nome;
    public String ruolo;

    // Costruttore
    public Calciatore(String nome, String ruolo) {
        this.nome = nome;
        this.ruolo = ruolo;
    }

    // Metodo per stampare i dettagli del calciatore
    public void stampaDettagli() {
        System.out.println("Nome: " + nome + ", Ruolo: " + ruolo);
    }

    // Getter per il nome
    public String getNome() {
        return nome;
    }

    // Getter per il ruolo
    public String getRuolo() {
        return ruolo;
    }
}

