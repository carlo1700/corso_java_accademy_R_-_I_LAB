package Biblioteca;

// Classe Biblioteca che gestisce una raccolta di libri
public class Biblioteca {
    // Array per contenere i libri
    public Libro[] libri;
    public int numeroLibri;

    // Costruttore della biblioteca
    public Biblioteca(int maxLibri) {
        libri = new Libro[maxLibri];
        numeroLibri = 0;
    }

    // Metodo per aggiungere un libro alla biblioteca
    public void aggiungiLibro(String nomeAutore, int nrPagine) {
        if (numeroLibri < libri.length) {
            libri[numeroLibri] = new Libro(nomeAutore, nrPagine);
            numeroLibri++;
        } else {
            System.out.println("La biblioteca è piena. Impossibile aggiungere altri libri.");
        }
    }
 
    // Metodo per stampare tutti i libri presenti nella biblioteca
    public void stampaLibri() {
        if (numeroLibri == 0) {
            System.out.println("La biblioteca è vuota.");
        } else {
            System.out.println("Libri nella biblioteca:");
            for (int i = 0; i < numeroLibri; i++) {
                libri[i].stampaDettagli();
            }
        }
    }

    // Metodo per cercare un libro per autore
    public void cercaPerAutore(String autore) {
        boolean trovato = false;
        for (int i = 0; i < numeroLibri; i++) {
            if (libri[i].nomeAutore.equalsIgnoreCase(autore)) {
                libri[i].stampaDettagli();
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Nessun libro trovato per l'autore: " + autore);
        }
    }

    // Metodo per cercare libri con un numero massimo di pagine
    public void cercaPerMaxPagine(int maxPagine) {
        boolean trovato = false;
        for (int i = 0; i < numeroLibri; i++) {
            if (libri[i].nrPagine <= maxPagine) {
                libri[i].stampaDettagli();
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Nessun libro trovato con massimo " + maxPagine + " pagine.");
        }
    }
}
