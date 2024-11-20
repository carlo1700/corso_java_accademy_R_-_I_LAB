public class Chef {
    public String nome;

    // Costruttore della classe Chef
    public Chef(String nome) {
        this.nome = nome;
    }

    // Metodo per creare un piatto, creando un oggetto Piatto
    public void creaPiatto(String tipoCucina, String[] ingredienti) {
        Piatto piatto = new Piatto(tipoCucina, ingredienti);
        System.out.println(nome + " sta preparando un piatto di tipo: " + tipoCucina);
        piatto.prepara(); // Invoca il metodo prepara del Piatto
    }
}
