import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("wprowadź liczbę przejechanych kilometrów: ");
        double kilometry;
        kilometry= klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("wprowadź liczbę spalonego paliwa: ");
        double paliwo;
        paliwo= klawiatura.nextDouble();
        klawiatura.nextLine();

        double kilometrNaLitr= kilometry/paliwo;

        System.out.println("liczba przejechanych kilometrów na jednym litrze to: "
        +kilometrNaLitr);

    }
}
