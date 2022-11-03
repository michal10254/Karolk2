import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj wynik z 1 testu");
        double wynikZ1Testu = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("podaj wynik z 2 testu");
        double wynikZ2Testu = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("podaj wynik z 3 testu");
        double wynikZ3Testu = klawiatura.nextDouble();
        klawiatura.nextLine();

        double average=(wynikZ3Testu+wynikZ2Testu+wynikZ1Testu)/3;

        System.out.println(" wynik z 1 testu: "+wynikZ1Testu+" wynik z 2 testu: "
        +wynikZ2Testu+" wynik z 3 testu: "+wynikZ3Testu+ " średnia z testów: "
        +average);




    }
}
