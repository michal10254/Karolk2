import java.util.Scanner;


public class Zadanie10 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("wpisz wartość produktu: ");
        double cena;
        cena = klawiatura.nextDouble();
        klawiatura.nextLine();

        double podatekStanowy = 0.04*cena;
        double podatekLokalny = 0.02*cena;
        double suma=cena+podatekLokalny+podatekStanowy;
        System.out.println("wartość produktu: "+cena+" podatek stanowy: "
                +podatekStanowy+"podatek lokalny: "
                +podatekLokalny+"łączna wartośc: "+suma);

    }
}
