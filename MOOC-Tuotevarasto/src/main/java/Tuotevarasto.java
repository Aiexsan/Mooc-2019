public class Tuotevarasto extends Varasto {
    
    private String tuote;
    
    public Tuotevarasto(String tuotenimi, double tilavuus) {
        super(tilavuus);
        this.tuote = tuotenimi;
    }
    
    public String getNimi() {
        return this.tuote;
    }
    
    public void setNimi(String uusiNimi) {
        this.tuote = uusiNimi;
    }
    
    public String toString() {
        return tuote + ": " + super.toString();
    }
}
