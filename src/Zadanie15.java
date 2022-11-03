import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj ulubione miasto: ");
        String miasto;
        miasto=klawiatura.nextLine();

        int liczbaZnakow= miasto.length();

        String male;
        String duze;

        male=miasto.toLowerCase();
        duze=miasto.toUpperCase();

        char pierwszyZnak;
        pierwszyZnak=miasto.charAt(0);

        System.out.println(" liczba znaków z nazwie miasta: "+liczbaZnakow
                +"\n nazwa miasta małymi literamia: "+male+"\n nazwa miasta duzymi literami: "
                +duze+"\n pierwszy znak nazwy miasta: "+pierwszyZnak);



    }
}
