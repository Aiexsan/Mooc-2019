
import java.util.ArrayList;

public class Reseptit {
    
    private String nimi;
    private int keittoaika;
    private ArrayList<String> ainekset = new ArrayList<>();
    
    public Reseptit(String nimi, int keittoaika, ArrayList<String> ainekset) {
        this.nimi = nimi;
        this.keittoaika = keittoaika;
        this.ainekset = ainekset;
    }
    
    
    public String getNimi() {
        return this.nimi;
    }

    public int getKeittoaika() {
        return keittoaika;
    }
    
    public String getAinekset() {
        int index = 0;
        String aineslista = "";
        while (index < this.ainekset.size()) {
            if (index == this.ainekset.size() - 1) {
                aineslista += this.ainekset.get(index);
                break;
            }
            aineslista += this.ainekset.get(index) + ", ";
            index++;
        }
        return aineslista;
    }
    
    
    
    @Override
    public String toString() {
        return nimi + ", keittoaika: " + keittoaika;
    }
}
