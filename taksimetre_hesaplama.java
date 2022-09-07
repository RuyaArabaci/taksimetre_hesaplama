import java.util.Scanner;

public class taksimetre_hesaplama {
    public static void main(String[] args) {
        double km, ucret;
        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen Km Değerini Giriniz: ");
        km = input.nextDouble();

        ucret = 10 + (2.20 * km) ;

        double sonuc = (ucret <= 20) ? 20 : ucret ;
        System.out.println("Taksimetre tutarı: " + sonuc);
        
    }
}