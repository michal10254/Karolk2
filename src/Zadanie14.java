import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj cene detaliczna płytki: ");
        double cenaDetaliczna;
        cenaDetaliczna= klawiatura.nextDouble();
        klawiatura.nextLine();

        double zysk= cenaDetaliczna*0.4;

        System.out.println("zysk to: "+zysk);
    }
}
