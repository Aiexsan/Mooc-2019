
import java.util.ArrayList;

public class Muutoshistoria {
    
    private ArrayList<Double> historia;
    
    public Muutoshistoria() {
        historia = new ArrayList<>();
    }
    
    public void lisaa(double tilanne) {
        historia.add(tilanne);
    }
    
    public void nollaa() {
        historia.clear();
    }
    
    public double maxArvo() {
        double suurin = 0;
        if (this.historia.isEmpty())
            return 0;
        for (double in : this.historia) {
            if (suurin < in)
                suurin = in;
        }
        return suurin;
    }
    
    public double minArvo() {
        double pienin = Double.MAX_VALUE;
        if (this.historia.isEmpty())
            return 0;
        for (double in : this.historia) {
            if (pienin > in)
                pienin = in;
        }
        return pienin;
    }
    
    public double keskiarvo() {
        int lukum = 0;
        double summa = 0;
        if (this.historia.isEmpty())
            return 0;
        for (double in : this.historia) {
            summa += in;
            lukum++;
        }
        return summa / lukum;
    }
    
    
    @Override
    public String toString() {
        return this.historia.toString();
    }
}
