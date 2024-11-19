public class Esercizio2 {
    public static void main(String[] args) {

        //esegui un ciclo for che vada da uno a sette
        for (int i = 1; i <= 7; i++) {
        
            //per ogni elemento su cui cicla il for, lo switch andrà a selezionare il caso corrispondente a quell'elemento
        switch (i) {
            //per ogni caso stampa i giorni della settimana corrispondente
            case 1:
                System.out.println(i + ": Monday");
                break;
            case 2:
                System.out.println(i + ": Tuesday");
                break;
            case 3:
                System.out.println(i + ": Wednesday");
                break;
            case 4:
                System.out.println(i + ": Thursday");
                break;
            case 5:
                System.out.println(i + ": Friday");
                break;
            case 6:
                System.out.println(i + ": Saturday");
                break;
            case 7:
                System.out.println(i + ": Sunday");
                break;
        }
        }
    }
}
