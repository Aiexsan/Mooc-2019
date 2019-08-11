import java.util.ArrayList;

public class Matkalaukku {
    
    private int maksimipaino;
    private ArrayList<Tavara> tavarat = new ArrayList<>();
    
    public Matkalaukku(int maksimipaino) {
        this.maksimipaino = maksimipaino;
    }
    
    public void lisaaTavara(Tavara tavara) {
        
        if (yhteispaino() + tavara.getPaino() <= this.maksimipaino) {
            this.tavarat.add(tavara);
        }  
    }
    
    public void tulostaTavarat() {
        for (Tavara tulosta : tavarat) {
            System.out.println(tulosta);
        }
    }
    
    public int yhteispaino() {
        int yhteispaino = 0;
        for (Tavara paino : tavarat) {
            yhteispaino += paino.getPaino();
        }
        return yhteispaino;
    }
    
    public Tavara raskainTavara() {
        Tavara painavintavara = null;
        int painavin = -1;
        for (Tavara tavara : tavarat) {
            if (tavara.getPaino() >= painavin) {
                painavin = tavara.getPaino();
                painavintavara = tavara;
            }
        }
        return painavintavara;
    }
    
    
    @Override
    public String toString() {
        if (tavarat.isEmpty()) {
            return "ei tavaroita (0 kg)";
        } else if (tavarat.size() == 1) {
            return tavarat.size() + "tavara (" + yhteispaino() + " kg)";
        }
        return tavarat.size() + " tavaraa (" + yhteispaino() + " kg)";
    }
}
