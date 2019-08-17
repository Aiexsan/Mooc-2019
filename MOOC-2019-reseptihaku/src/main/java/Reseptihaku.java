
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner lukija = new Scanner(System.in);
        Kayttoliittyma tekstikayttoliittyma = new Kayttoliittyma();
        
        tekstikayttoliittyma.start();
    }
}
