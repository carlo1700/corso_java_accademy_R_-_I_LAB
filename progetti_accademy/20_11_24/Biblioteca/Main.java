// Classe principale per testare il funzionamento
public class Main {
    public static void main(String[] args) {
        // Creazione della biblioteca con spazio per 5 libri
        Biblioteca biblioteca = new Biblioteca(5);

        // Aggiunta di libri alla biblioteca
        biblioteca.aggiungiLibro("J.K. Rowling", 300);
        biblioteca.aggiungiLibro("George Orwell", 198);
        biblioteca.aggiungiLibro("J.R.R. Tolkien", 400);
        biblioteca.aggiungiLibro("Agatha Christie", 250);
        biblioteca.aggiungiLibro("Stephen King", 500);

        // Stampa tutti i libri
        System.out.println("Stampa di tutti i libri:");
        biblioteca.stampaLibri();

        // Ricerca per autore
        System.out.println("\nRicerca libri di George Orwell:");
        biblioteca.cercaPerAutore("George Orwell");

        // Ricerca per numero massimo di pagine
        System.out.println("\nRicerca libri con massimo 300 pagine:");
        biblioteca.cercaPerMaxPagine(300);
    }
}
