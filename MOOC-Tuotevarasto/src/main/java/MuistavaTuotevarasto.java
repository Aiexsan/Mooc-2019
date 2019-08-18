public class MuistavaTuotevarasto extends Tuotevarasto {
    
    private Muutoshistoria muutoshistoria;
    
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        muutoshistoria = new Muutoshistoria();
        muutoshistoria.lisaa(alkuSaldo);
    }
    
    @Override
    public void lisaaVarastoon(double maara) {
        double lisattava = super.getSaldo() + maara;
        super.lisaaVarastoon(maara);
        muutoshistoria.lisaa(lisattava);
    }
    
    @Override
    public double otaVarastosta(double maara) {
        maara = super.otaVarastosta(maara);
        muutoshistoria.lisaa(super.getSaldo());
        return maara;
    }
    
    public String historia() {
        return muutoshistoria.toString();
    }
    
    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + super.getNimi());
        System.out.println("Historia: " + historia());
        System.out.println("Suurin tuotemäärä: " + muutoshistoria.maxArvo());
        System.out.println("Pienin tuotemäärä: " + muutoshistoria.minArvo());
        System.out.println("Keskiarvo: " + muutoshistoria.keskiarvo());
    }
}
