package Cucina;

public class Piatto {
    public String tipoCucina;
    public String[] ingredienti;

    // Costruttore della classe Piatto
    public Piatto(String tipoCucina, String[] ingredienti) {
        this.tipoCucina = tipoCucina;
        this.ingredienti = ingredienti;
    }

    // Metodo per preparare il piatto in base agli ingredienti
    public void prepara() {
        System.out.println("Preparazione del piatto di tipo: " + tipoCucina);

        switch (tipoCucina.toLowerCase()) {
            case "italiano":
                preparaPiattoItaliano();
                break;
            case "giapponese":
                preparaPiattoGiapponese();
                break;
            case "messicano":
                preparaPiattoMessicano();
                break;
            case "cinese":
                preparaPiattoCinese();
                break;
            case "indiano":
                preparaPiattoIndiano();
                break;
            default:
                System.out.println("Tipo di cucina non riconosciuto.");
        }
    }

    // Metodo per preparare un piatto italiano
    public void preparaPiattoItaliano() {
        if (contieneIngrediente("pomodoro")) {
            System.out.println("Piatto preparato: Pasta al Pomodoro");
        } else if (contieneIngrediente("basilico")) {
            System.out.println("Piatto preparato: Pizza Margherita");
        } else {
            System.out.println("Piatto italiano non riconosciuto con questi ingredienti.");
        }
    }

    // Metodo per preparare un piatto giapponese
    public void preparaPiattoGiapponese() {
        if (contieneIngrediente("sushi")) {
            System.out.println("Piatto preparato: Sushi");
        } else if (contieneIngrediente("ramen")) {
            System.out.println("Piatto preparato: Ramen");
        } else {
            System.out.println("Piatto giapponese non riconosciuto con questi ingredienti.");
        }
    }

    // Metodo per preparare un piatto messicano
    public void preparaPiattoMessicano() {
        if (contieneIngrediente("taco")) {
            System.out.println("Piatto preparato: Tacos");
        } else if (contieneIngrediente("guacamole")) {
            System.out.println("Piatto preparato: Guacamole con Nachos");
        } else {
            System.out.println("Piatto messicano non riconosciuto con questi ingredienti.");
        }
    }

    // Metodo per preparare un piatto cinese
    public void preparaPiattoCinese() {
        if (contieneIngrediente("riso")) {
            System.out.println("Piatto preparato: Riso Fritto");
        } else if (contieneIngrediente("pollo")) {
            System.out.println("Piatto preparato: Pollo al limone");
        } else {
            System.out.println("Piatto cinese non riconosciuto con questi ingredienti.");
        }
    }

    // Metodo per preparare un piatto indiano
    public void preparaPiattoIndiano() {
        if (contieneIngrediente("curry")) {
            System.out.println("Piatto preparato: Curry di Pollo");
        } else if (contieneIngrediente("naan")) {
            System.out.println("Piatto preparato: Pane Naan con Curry");
        } else {
            System.out.println("Piatto indiano non riconosciuto con questi ingredienti.");
        }
    }

    // Metodo ausiliario per controllare se un ingrediente è presente
    public boolean contieneIngrediente(String ingrediente) {
        for (String ing : ingredienti) {
            if (ing.equalsIgnoreCase(ingrediente)) {
                return true;
            }
        }
        return false;
    }
}
