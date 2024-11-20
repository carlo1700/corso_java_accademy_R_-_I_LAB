package Biblioteca;

// Classe Libro che rappresenta un libro con nome autore e numero di pagine
public class Libro {
    // Variabili pubbliche
    public String nomeAutore;
    public int nrPagine;

    // Costruttore per inizializzare i dati del libro
    public Libro(String nomeAutore, int nrPagine) {
        this.nomeAutore = nomeAutore;
        this.nrPagine = nrPagine;
    }

    // Metodo per stampare i dettagli del libro
    public void stampaDettagli() {
        System.out.println("Autore: " + nomeAutore + ", Pagine: " + nrPagine);
    }
}
