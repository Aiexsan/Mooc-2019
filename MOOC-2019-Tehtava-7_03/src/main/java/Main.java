
public class Main {

    public static void main(String[] args) {
        
        Tavara kirja = new Tavara("Aapiskukko", 2);


        Matkalaukku adanLaukku = new Matkalaukku(10);
        adanLaukku.lisaaTavara(kirja);


        Matkalaukku pekanLaukku = new Matkalaukku(10);


        Lastiruuma lastiruuma = new Lastiruuma(1000);
        lastiruuma.lisaaMatkalaukku(adanLaukku);
        lastiruuma.lisaaMatkalaukku(pekanLaukku);

        System.out.println("Ruuman matkalaukuissa on seuraavat tavarat:");
        System.out.println(adanLaukku);
    }
}