

public class Main {

    public static void main(String[] args) {
        // tuttuun tapaan:
        MuistavaTuotevarasto mehu = new MuistavaTuotevarasto("Juice", 1000.0, 1000.0);
        mehu.otaVarastosta(11.3);
        System.out.println(mehu.getNimi()); // Juice
        mehu.lisaaVarastoon(1.0);
        System.out.println(mehu);           // Juice: saldo = 989.7, vielä tilaa 10.3

        // jne

        // mutta nyt on historiaakin:
        System.out.println(mehu.historia()); // [1000.0, 988.7, 989.7]
    }

}
