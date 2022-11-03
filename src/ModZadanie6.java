import java.util.Scanner;


public class ModZadanie6 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj wymiar1 pierwszego pomieszczenia: ");
        double wymiar1;
        wymiar1 = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj wymiar2 pierwszego pomieszczenia: ");
        double wymiar2;
        wymiar2= klawiatura.nextDouble();
        klawiatura.nextLine();

        double pomieszczenie1;
        pomieszczenie1= wymiar1*wymiar2;

        System.out.println("Podaj wymiar1 drugiego pomieszczenia: ");
        double wymiar3;
        wymiar3 = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj wymiar2 drugiego pomieszczenia: ");
        double wymiar4;
        wymiar4= klawiatura.nextDouble();
        klawiatura.nextLine();

        double pomieszczenie2;
        pomieszczenie2= wymiar3*wymiar4;

        System.out.println("Podaj wymiar1 trzeciego pomieszczenia: ");
        double wymiar5;
        wymiar5 = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj wymiar2 trzeciego pomieszczenia: ");
        double wymiar6;
        wymiar6= klawiatura.nextDouble();
        klawiatura.nextLine();

        double pomieszczenie3;
        pomieszczenie3= wymiar5*wymiar6;

        System.out.println("Podaj wymiar1 czwartego pomieszczenia: ");
        double wymiar7;
        wymiar7 = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj wymiar2 czwartego pomieszczenia: ");
        double wymiar8;
        wymiar8= klawiatura.nextDouble();
        klawiatura.nextLine();

        double pomieszczenie4;
        pomieszczenie4= wymiar7*wymiar8;

        double calkowitaPowierzchnia;
        calkowitaPowierzchnia= pomieszczenie1+ pomieszczenie2 + pomieszczenie3 + pomieszczenie4;

        System.out.println("podaj liczbę osób w mieszkaniu: ");
        int liczbaOsob;
        liczbaOsob= klawiatura.nextInt();
        klawiatura.nextLine();

        double powierzchniaNaOsobę;
        powierzchniaNaOsobę= calkowitaPowierzchnia/liczbaOsob;


        System.out.println("powierzchnia 1 pokoju to ");


        System.out.println("powierzchnia1= " +pomieszczenie1);
        System.out.println("powierzchnia2= " +pomieszczenie2);
        System.out.println("powierzchnia3= " +pomieszczenie3);
        System.out.println("powierzchnia4= "  +pomieszczenie4);
        System.out.println("Całkowita powierzchnia= " +calkowitaPowierzchnia);
        System.out.println("powierzchnia na osobe= " +powierzchniaNaOsobę);

    }
}
