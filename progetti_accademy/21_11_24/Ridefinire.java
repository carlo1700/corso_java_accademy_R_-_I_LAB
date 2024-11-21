public class Ridefinire {
    public static void main(String[] args) {
        
        String colore = "giallo";
        int quantita = 20;
    
        @Override public String toString() {
            return "Penne{" + "colore='" + colore + '\'' + ", quantita=" + quantita + '}';
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Penna penna = (Penna) obj;
                return quantita == penna.quantita && colore.equals(penna.colore);
            }
    
        @Override
        public int hashCode() {
            return colore.hashCode() + quantita * 31; // Calcola un valore hash
        }
    }
}