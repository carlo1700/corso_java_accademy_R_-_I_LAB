package Videoteca;

public class Main {
    public static void main(String[] args) {
        // Creazione della videoteca
        Videoteca videoteca = new Videoteca();

        // Creazione di alcuni film
        Film film1 = new Film("Inception", 2010);
        Film film2 = new Film("The Matrix", 1999);
        Film film3 = new Film("The Godfather", 1972);
        Film film4 = new Film("Interstellar", 2014);
        Film film5 = new Film("Pulp Fiction", 1994);
        Film film6 = new Film("The Dark Knight", 2008);

        // Aggiungi i film alla videoteca
        videoteca.aggiungiFilm(film1);
        videoteca.aggiungiFilm(film2);
        videoteca.aggiungiFilm(film3);
        videoteca.aggiungiFilm(film4);
        videoteca.aggiungiFilm(film5);
        videoteca.aggiungiFilm(film6);

        // Creazione di un utente
        Utente utente1 = new Utente("U001", "Mario Rossi");

        // Registrazione dell'utente nella videoteca
        videoteca.registraUtente(utente1);

        // Tentativo di login dell'utente
        boolean loginSuccess = videoteca.login("U001", "Mario Rossi");
        
        if (loginSuccess) {
            // Visualizza film disponibili
            videoteca.elencoFilmDisponibili();

            // Noleggio dei film (solo se l'utente è loggato)
            videoteca.noleggiaFilm(film1);
            videoteca.noleggiaFilm(film2);
            videoteca.noleggiaFilm(film3);
            videoteca.noleggiaFilm(film4);
            videoteca.noleggiaFilm(film5);  // Limite raggiunto
            videoteca.noleggiaFilm(film6);  // Non può noleggiare più di 5 film

            // Visualizza l'elenco dei film noleggiati
            utente1.elencoNoleggi();
        }

        // Ricerca per titolo
        System.out.println("\nRicerca film per titolo:");
        videoteca.cercaFilmPerTitolo("The Matrix");
        videoteca.cercaFilmPerTitolo("Avatar");

        // Ricerca per anno
        System.out.println("\nRicerca film per anno:");
        videoteca.cercaFilmPerAnno(1999);
        videoteca.cercaFilmPerAnno(2023);

        // Rimuovi un film dalla videoteca
        videoteca.rimuoviFilm(film2);

        // Visualizza i film disponibili dopo la rimozione
        videoteca.elencoFilmDisponibili();
    }
}
