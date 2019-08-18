public class Lintu {
    
    
    private String nimi;
    private String latinanimi;
    private int havainnot;
    
    public Lintu(String nimi, String latinanimi, int havainnot) {
        this.nimi = nimi;
        this.latinanimi = latinanimi;
        this.havainnot = havainnot;
    }
    
    public void lisaa(String nimi) {
        this.nimi = nimi;
    }
    
    
    public void havaittu() {
        this.havainnot += 1;
    }
    
    public String toString() {
        return this.nimi + " (" + this.latinanimi + "): " + this.havainnot + " havaintoa";
    }
    
    
}
