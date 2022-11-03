import java.util.Scanner;

public class Zadanie19 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        double cukierNaCiastko = 1.5/48;
        double masloNaCiastko= 1.0/48;
        double monkaNaCiastko= 2.75/48;

        System.out.println("podaj liczbe ciastek: ");
        int liczbaCiastek;
        liczbaCiastek=klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("potrzebne składniki: \n"+cukierNaCiastko*liczbaCiastek
                +" szklanki cukru \n"+masloNaCiastko*liczbaCiastek+" szklanki masła \n"
                +monkaNaCiastko*liczbaCiastek+"szklanki monki");


    }
}
