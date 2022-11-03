import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        int liczbaCiastek=40;
        int liczbaPorcji=10;
        int liczbaCiastekNaPorcje= liczbaCiastek/liczbaPorcji;
        int kalorieNaPorcje=300;
        double kalorieNaCiastko= (double)kalorieNaPorcje/liczbaCiastekNaPorcje;

        System.out.println("wprowadż liczbę zjedzonyc ciastek: ");
        double liczbaZjedzonychCiastek;
        liczbaZjedzonychCiastek = klawiatura.nextDouble();
        klawiatura.nextLine();

        double skonsumowaneKalorie=liczbaZjedzonychCiastek*kalorieNaCiastko;

        System.out.println("skonsumowane kalorie: "+skonsumowaneKalorie);

    }
}
