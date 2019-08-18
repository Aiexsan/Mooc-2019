
import java.util.HashMap;
import java.util.Scanner;

public class Kayttoliittyma {
    
    private HashMap<String, Lintu> linnut = new HashMap<>();
    private Scanner SKANNAAJAYKSI;
    
    public Kayttoliittyma(Scanner SKANNAAJAKAKSI) {
        this.SKANNAAJAYKSI = SKANNAAJAKAKSI;
    }
    
    public void start() {
        
        
        while (true) {
            System.out.println("? ");
            String komento = SKANNAAJAYKSI.nextLine();
            
            if (komento.equals("Lisaa")) {
                System.out.println("Nimi: ");
                String nimi = SKANNAAJAYKSI.nextLine();
                System.out.println("Latinankielinen nimi: ");
                String latinanimi = SKANNAAJAYKSI.nextLine();
                linnut.put(nimi, new Lintu(nimi, latinanimi, 0));
                
            }
            
            if (komento.equals("Havainto")) {
                System.out.println("Mikä havaittu? ");
                String havaittu = SKANNAAJAYKSI.nextLine();
                if (linnut.containsKey(havaittu)) {
                    this.linnut.get(havaittu).havaittu();
                } else 
                    System.out.println("Ei ole lintu!");
            }
            
            if (komento.equals("Tilasto")) {
                for (String in : this.linnut.keySet()) {
                    System.out.println(linnut.get(in));
                }
            }
            if (komento.equals("Nayta")) {
                System.out.println("Mikä? ");
                String mika = SKANNAAJAYKSI.nextLine();
                if (linnut.containsKey(mika))
                    System.out.println(linnut.get(mika));
            }
            if (komento.equals("Lopeta"))
                break;
            
        }
    }
    
}
