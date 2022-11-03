import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("wprowadź cenę posiłku: ");
        double cenaPosilku;
        cenaPosilku=klawiatura.nextDouble();
        klawiatura.nextLine();

        double podatek = cenaPosilku*0.0675;
        double napiwek = (cenaPosilku+podatek)*0.20;
        double suma = cenaPosilku+podatek+napiwek;
        System.out.println("cena posiłku: "+cenaPosilku+" podatek: "+podatek+" napiwek: "
         +napiwek+" suma: "+suma);

    }
}
