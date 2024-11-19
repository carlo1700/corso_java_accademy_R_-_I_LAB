public class RipetizioniWhile {
    public static void main(String[] args) {
        int i = 1; // Inizializzazione della variabile di controllo
        while (i <= 5) {
             i++; // Incremento della variabile di controllo
             System.out.println(i);
        }

        boolean a = true;
        while (a == true) {
            if (i == 10){
                a = false;
            }
            i++;
        }
        System.out.println(a);

        while (i < 30) {
            i++;
            if (i == 14) {
                break;
            }
        }
        System.out.println(i);
    }
}