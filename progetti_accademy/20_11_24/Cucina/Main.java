public class Main {
    public static void main(String[] args) {
        // Creazione dell'oggetto Chef
        Chef chef1 = new Chef("Marco");

        // Esempio 1: Chef italiano con ingredienti per pasta al pomodoro
        String[] ingredientiItaliani = {"pomodoro", "basilico", "aglio"};
        chef1.creaPiatto("italiano", ingredientiItaliani);

        // Esempio 2: Chef giapponese con ingredienti per sushi
        String[] ingredientiGiapponesi = {"sushi", "wasabi", "soia"};
        chef1.creaPiatto("giapponese", ingredientiGiapponesi);

        // Esempio 3: Chef messicano con ingredienti per tacos
        String[] ingredientiMessicani = {"taco", "guacamole", "cilantro"};
        chef1.creaPiatto("messicano", ingredientiMessicani);
    }
}
