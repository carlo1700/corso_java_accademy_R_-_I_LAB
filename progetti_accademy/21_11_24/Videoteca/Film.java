package Videoteca;

public class Film {
    private String titolo;
    private int annoUscita;

    // Costruttore
    public Film(String titolo, int annoUscita) {
        this.titolo = titolo;
        this.annoUscita = annoUscita;
    }

    // Getter e Setter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoUscita() {
        return annoUscita;
    }

    public void setAnnoUscita(int annoUscita) {
        this.annoUscita = annoUscita;
    }

    @Override
    public String toString() {
        return "Titolo: " + titolo + ", Anno: " + annoUscita;
    }
}
