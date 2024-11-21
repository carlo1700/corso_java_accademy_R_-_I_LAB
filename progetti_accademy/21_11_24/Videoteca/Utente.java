package Videoteca;

import java.util.ArrayList;

public class Utente {
    private String idUtente;
    private String nome;
    private ArrayList<Film> filmNoleggiati;

    public Utente(String idUtente, String nome) {
        this.idUtente = idUtente;
        this.nome = nome;
        this.filmNoleggiati = new ArrayList<>();
    }

    public void noleggiaFilm(Film film) {
        if (filmNoleggiati.size() < 5) { // Limite di 5 film per utente
            if (!filmNoleggiati.contains(film)) { // Controlla se il film è già stato noleggiato
                filmNoleggiati.add(film);
                System.out.println(film.getTitolo() + " è stato noleggiato.");
            } else {
                System.out.println(film.getTitolo() + " è già stato noleggiato.");
            }
        } else {
            System.out.println("Limite di noleggi raggiunto. Non puoi noleggiare più di 5 film.");
        }
    }

    public void elencoNoleggi() {
        System.out.println("Film noleggiati da " + nome + ":");
        if (filmNoleggiati.isEmpty()) {
            System.out.println("Nessun film noleggiato.");
        } else {
            for (Film film : filmNoleggiati) {
                System.out.println(film);
            }
        }
    }

    public String getIdUtente() {
        return idUtente;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Film> getFilmNoleggiati() {
        return filmNoleggiati;
    }
}
