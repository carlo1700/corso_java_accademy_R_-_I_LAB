public class Piatto {
    private String tipoCucina;
    private String[] ingredienti;

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
    private void preparaPiattoItaliano() {
        if (contieneIngrediente("pomodoro")) {
            System.out.println("Piatto preparato: Pasta al Pomodoro");
        } else if (contieneIngrediente("basilico")) {
            System.out.println("Piatto preparato: Pizza Margherita");
        } else {
            System.out.println("Piatto italiano non riconosciuto con questi ingredienti.");
        }
    }

    // Metodo per preparare un piatto giapponese
    private void preparaPiattoGiapponese() {
        if (contieneIngrediente("sushi")) {
            System.out.println("Piatto preparato: Sushi");
        } else if (contieneIngrediente("ramen")) {
            System.out.println("Piatto preparato: Ramen");
        } else {
            System.out.println("Piatto giapponese non riconosciuto con questi ingredienti.");
        }
    }

    // Metodo per preparare un piatto messicano
    private void preparaPiattoMessicano() {
        if (contieneIngrediente("taco")) {
            System.out.println("Piatto preparato: Tacos");
        } else if (contieneIngrediente("guacamole")) {
            System.out.println("Piatto preparato: Guacamole con Nachos");
        } else {
            System.out.println("Piatto messicano non riconosciuto con questi ingredienti.");
        }
    }

    // Metodo per preparare un piatto cinese
    private void preparaPiattoCinese() {
        if (contieneIngrediente("riso")) {
            System.out.println("Piatto preparato: Riso Fritto");
        } else if (contieneIngrediente("pollo")) {
            System.out.println("Piatto preparato: Pollo al limone");
        } else {
            System.out.println("Piatto cinese non riconosciuto con questi ingredienti.");
        }
    }

    // Metodo per preparare un piatto indiano
    private void preparaPiattoIndiano() {
        if (contieneIngrediente("curry")) {
            System.out.println("Piatto preparato: Curry di Pollo");
        } else if (contieneIngrediente("naan")) {
            System.out.println("Piatto preparato: Pane Naan con Curry");
        } else {
            System.out.println("Piatto indiano non riconosciuto con questi ingredienti.");
        }
    }

    // Metodo ausiliario per controllare se un ingrediente è presente
    private boolean contieneIngrediente(String ingrediente) {
        for (String ing : ingredienti) {
            if (ing.equalsIgnoreCase(ingrediente)) {
                return true;
            }
        }
        return false;
    }
}
