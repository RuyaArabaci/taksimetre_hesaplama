import java.util.Scanner;

public class taksimetre_hesaplama {
    public static void main(String[] args) {
        double km, ucret, startPrice;
        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen Km Değerini Giriniz: ");
        km = input.nextDouble();
        startPrice = 10;
        ucret = startPrice + (2.20 * km) ;

        double sonuc = (ucret <= 20) ? 20 : ucret ;
        System.out.println("Taksimetre tutarı: " + sonuc);
        
    }
}