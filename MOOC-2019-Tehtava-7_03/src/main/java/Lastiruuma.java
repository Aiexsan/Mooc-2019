import java.util.ArrayList;
public class Lastiruuma {
    private int maksimipaino;
    private ArrayList<Matkalaukku> ruuma = new ArrayList<>();
    private int painonyt;
    
    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if (painonyt + laukku.yhteispaino() <= this.maksimipaino) {
            painonyt += laukku.yhteispaino();
            ruuma.add(laukku);
        }
    }
    
    public void tulostaTavarat() {
        for (Matkalaukku laukut : ruuma) {
            laukut.tulostaTavarat();
        }
    }
    
    @Override
    public String toString() {
        if (ruuma.isEmpty()) {
            return "ei tavaroita (0 kg)";
        }
        int paino = 0;
        for (Matkalaukku laukut : ruuma) {
            paino += laukut.yhteispaino();
        }
        return ruuma.size() + " matkalaukkua (" + paino + "kg)";
    }
}
