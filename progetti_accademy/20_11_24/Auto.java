public class Auto {
    // Campi della classe
    public String modello;
    public String colore;
    public int velocita;

    // Costruttore
    public Auto(String modello, String colore) {
        this.modello = modello;
        this.colore = colore;
        this.velocita = 0; // Velocità iniziale
    }
    
    // Metodo per accelerare
    public void accelera(int incremento) {
        velocita += incremento;
        System.out.println("L'auto " + modello + " ha accelerato. Velocità attuale: " + velocita + " km/h.");
    }

    // Metodo per frenare
    public void frena(int decremento) {
        velocita -= decremento;
        if (velocita < 0) {
            velocita = 0;
        }
        System.out.println("L'auto " + modello + " ha frenato. Velocità attuale: " + velocita + " km/h.");
    }
}
