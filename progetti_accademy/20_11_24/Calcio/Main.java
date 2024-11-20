package Calcio;

public class Main {
    public static void main(String[] args) {
        // Creiamo due nuove squadre
        Squadra squadra1 = new Squadra();
        Squadra squadra2 = new Squadra();

        // Aggiungiamo 12 calciatori a ciascuna squadra
        squadra1.aggiungiCalciatore(0, "Gianluigi Buffon", "Portiere");
        squadra1.aggiungiCalciatore(1, "Giorgio Chiellini", "Difensore");
        squadra1.aggiungiCalciatore(2, "Daniele De Rossi", "Centrocampista");
        squadra1.aggiungiCalciatore(3, "Francesco Totti", "Attaccante");
        squadra1.aggiungiCalciatore(4, "Dino Zoff", "Portiere");
        squadra1.aggiungiCalciatore(5, "Franco Baresi", "Difensore");
        squadra1.aggiungiCalciatore(6, "Alino Diamanti", "Centrocampista");
        squadra1.aggiungiCalciatore(7, "Cristiano Ronaldo", "Attaccante");
        squadra1.aggiungiCalciatore(8, "Federico Di Marco", "Difensore");
        squadra1.aggiungiCalciatore(9, "Andrea Pirlo", "Centrocampista");
        squadra1.aggiungiCalciatore(10, "Luca Toni", "Attaccante");
        squadra1.aggiungiCalciatore(11, "Andrea Locatelli", "Centrocampista");

        squadra2.aggiungiCalciatore(0, "Manuel Neuer", "Portiere");
        squadra2.aggiungiCalciatore(1, "Joshua Kimmich", "Difensore");
        squadra2.aggiungiCalciatore(2, "Luka Modric", "Centrocampista");
        squadra2.aggiungiCalciatore(3, "Karim Benzema", "Attaccante");
        squadra2.aggiungiCalciatore(4, "Oliver Kahn", "Portiere");
        squadra2.aggiungiCalciatore(5, "Sergio Ramos", "Difensore");
        squadra2.aggiungiCalciatore(6, "Toni Kroos", "Centrocampista");
        squadra2.aggiungiCalciatore(7, "Cristiano Ronaldo", "Attaccante");
        squadra2.aggiungiCalciatore(8, "David Alaba", "Difensore");
        squadra2.aggiungiCalciatore(9, "Casemiro", "Centrocampista");
        squadra2.aggiungiCalciatore(10, "Gareth Bale", "Attaccante");
        squadra2.aggiungiCalciatore(11, "Eden Hazard", "Centrocampista");

        // Creiamo la partita tra le due squadre
        Partita partita = new Partita(squadra1, squadra2);

        // Simuliamo la partita e mostriamo il risultato
        partita.simulaPartita();
    }
}
