import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Kayttoliittyma {
        
    private HashMap<String, Reseptit> reseptit = new HashMap<>();
    private Scanner lukija = new Scanner(System.in);
    
    
    public void start() throws FileNotFoundException  {
        lueTiedosto();
        System.out.print("\nKomennot:\nlistaa - listaa reseptit\nlopeta - lopettaa ohjelman\nhae nimi - hakee reseptiä nimen perusteella\n");
        System.out.println("hae keittoaika - hakee reseptiä keittoajan perusteella\nhae aine - hakee reseptiä raaka-aineen perusteella\n");
        while (true) {
            System.out.println("Syötä komento: ");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta"))
                break;
            if (komento.equals("listaa"))
                listaa();
            if (komento.equals("hae nimi"))
                haeNimella();
            if (komento.equals("hae keittoaika"))
                haeKeittoajalla();
            if (komento.equals("hae aine"))
                haeRaakaaineella();
        }
        
    }
    
    public void lueTiedosto() throws FileNotFoundException {
        System.out.println("Mistä luetaan? ");
        String tiedosto = lukija.nextLine();
        Scanner kokoTeksti = new Scanner(new File(tiedosto));
        ArrayList<String> ainekset = new ArrayList<>();
        int keittoaika = 0;
        String nimi = "";
        int index = 0;
        
        while (kokoTeksti.hasNextLine()) {
            String luettu = kokoTeksti.nextLine();
            if (index == 0) {
                nimi = luettu;
            }
            if (index == 1) {
                keittoaika = Integer.valueOf(luettu);
            }
            if (luettu.isEmpty() || !kokoTeksti.hasNextLine()) {
                this.reseptit.put(nimi, new Reseptit(nimi, keittoaika, ainekset));
                index = -1;
                ainekset.clear();
            }
            if (index > 1) {
                ainekset.add(luettu);
            }
            
            index++;
        }
    }
    
    public void listaa() {
        for(String in : reseptit.keySet()) {
            System.out.println(reseptit.get(in));
            
        }
    }
    
    public void haeNimella() {
        System.out.println("Mitä haetaan: ");
        String haettava = lukija.nextLine();
        System.out.println("Reseptit:");
        for (String in : reseptit.keySet()) {
            if (in.contains(haettava))
                System.out.println(reseptit.get(in));
        }
        System.out.println("");
    }
    
    public void haeKeittoajalla() {
        System.out.println("Keittoaika korkeintaan: ");
        int suurin = Integer.valueOf(lukija.nextLine());
        System.out.println("Reseptit:");
        for (String in : reseptit.keySet()) {
            if (reseptit.get(in).getKeittoaika() <= suurin)
                System.out.println(reseptit.get(in));
        }
        System.out.println("");
    }
    
    public void haeRaakaaineella() {
        System.out.println("Mitä raaka-ainetta haetaan: ");
        String haettava = lukija.nextLine();
        System.out.println("Reseptit:");
        for (String in : reseptit.keySet()) {
            if (reseptit.get(in).getAinekset().contains(haettava))
                System.out.println(reseptit.get(in));
        }
        
    }
}
    

