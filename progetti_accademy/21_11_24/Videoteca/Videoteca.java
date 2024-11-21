package Videoteca;

import java.util.ArrayList;

public class Videoteca {
    private ArrayList<Film> filmDisponibili;
    private ArrayList<Utente> utenti;
    private Utente utenteLoggato;  // L'utente attualmente loggato

    // Costruttore che inizializza la videoteca con liste vuote
    public Videoteca() {
        filmDisponibili = new ArrayList<>();
        utenti = new ArrayList<>();
        utenteLoggato = null;  // Nessun utente loggato inizialmente
    }

    // Metodo per eseguire il login di un utente
    public boolean login(String idUtente, String nome) {
        // Controlla se le credenziali dell'utente sono corrette
        for (Utente utente : utenti) {
            if (utente.getIdUtente().equals(idUtente) && utente.getNome().equalsIgnoreCase(nome)) {
                utenteLoggato = utente;  // Imposta l'utente come loggato
                System.out.println("Login riuscito. Benvenuto, " + utente.getNome() + "!");
                return true;  // Login avvenuto con successo
            }
        }
        System.out.println("Login fallito. ID utente o nome errato.");
        return false;  // Login fallito
    }

    // Metodo per verificare se un utente è loggato
    public boolean isUtenteLoggato() {
        return utenteLoggato != null;
    }

    // Metodo per noleggiare un film (solo se l'utente è loggato)
    public void noleggiaFilm(Film film) {
        if (isUtenteLoggato()) {  // Controlla se c'è un utente loggato
            Utente utente = utenteLoggato;
            if (filmDisponibili.contains(film)) {
                utente.noleggiaFilm(film);
                filmDisponibili.remove(film);  // Rimuove il film dalla videoteca
            } else {
                System.out.println("Il film non è disponibile.");
            }
        } else {
            System.out.println("Devi prima fare il login per noleggiare un film.");
        }
    }

    // Aggiungi un film alla videoteca
    public void aggiungiFilm(Film film) {
        if (!filmDisponibili.contains(film)) {
            filmDisponibili.add(film);
            System.out.println(film.getTitolo() + " è stato aggiunto alla videoteca.");
        } else {
            System.out.println(film.getTitolo() + " è già presente nella videoteca.");
        }
    }

    // Rimuovi un film dalla videoteca
    public void rimuoviFilm(Film film) {
        if (filmDisponibili.contains(film)) {
            filmDisponibili.remove(film);
            System.out.println(film.getTitolo() + " è stato rimosso dalla videoteca.");
        } else {
            System.out.println("Il film non è presente nella videoteca.");
        }
    }

    // Ricerca di un film per titolo, includendo anche i film noleggiati
    public void cercaFilmPerTitolo(String titolo) {
        boolean trovato = false;
        
        // Cerca tra i film disponibili
        for (Film film : filmDisponibili) {
            if (film.getTitolo().equalsIgnoreCase(titolo)) {
                System.out.println(film + " (Disponibile in videoteca)");
                trovato = true;
            }
        }
        
        // Cerca tra i film noleggiati dagli utenti
        for (Utente utente : utenti) {
            for (Film film : utente.getFilmNoleggiati()) {
                if (film.getTitolo().equalsIgnoreCase(titolo)) {
                    System.out.println(film + " (Noleggiato da " + utente.getNome() + ")");
                    trovato = true;
                }
            }
        }
        
        if (!trovato) {
            System.out.println("Film non trovato per il titolo: " + titolo);
        }
    }

    // Ricerca di un film per anno, includendo anche i film noleggiati
    public void cercaFilmPerAnno(int anno) {
        boolean trovato = false;
        
        // Cerca tra i film disponibili
        for (Film film : filmDisponibili) {
            if (film.getAnnoUscita() == anno) {
                System.out.println(film + " (Disponibile in videoteca)");
                trovato = true;
            }
        }
        
        // Cerca tra i film noleggiati dagli utenti
        for (Utente utente : utenti) {
            for (Film film : utente.getFilmNoleggiati()) {
                if (film.getAnnoUscita() == anno) {
                    System.out.println(film + " (Noleggiato da " + utente.getNome() + ")");
                    trovato = true;
                }
            }
        }
        
        if (!trovato) {
            System.out.println("Nessun film trovato per l'anno: " + anno);
        }
    }

    // Elenco dei film disponibili in videoteca
    public void elencoFilmDisponibili() {
        System.out.println("Film disponibili in videoteca:");
        if (filmDisponibili.isEmpty()) {
            System.out.println("Nessun film disponibile.");
        } else {
            for (Film film : filmDisponibili) {
                System.out.println(film);
            }
        }
    }

    // Registrazione di un utente
    public void registraUtente(Utente utente) {
        utenti.add(utente);
        System.out.println("Utente " + utente.getNome() + " registrato con successo.");
    }

    // Metodo per uscire (logout)
    public void logout() {
        if (isUtenteLoggato()) {
            System.out.println("Arrivederci, " + utenteLoggato.getNome() + ". Sei stato disconnesso.");
            utenteLoggato = null;  // Disconnetti l'utente
        } else {
            System.out.println("Non sei loggato.");
        }
    }
}
