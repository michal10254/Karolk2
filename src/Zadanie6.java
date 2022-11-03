public class Zadanie6 {
    public static void main(String[] args) {
        int pomieszczenie1 = 2*3;
        int pomieszczenie2 = 3*4;
        int pomieszczenie3 = 3*4;
        int pomieszczenie4 = 2*2;
        double calkowitaPowierzchnia= pomieszczenie1+pomieszczenie2+pomieszczenie3+pomieszczenie4;
        double powierzchniaNaOsobę= calkowitaPowierzchnia/4;
        System.out.println("powierzchnia1=" +pomieszczenie1);
        System.out.println("powierzchnia2= " +pomieszczenie2);
        System.out.println("powierzchnia3= "+pomieszczenie3);
        System.out.println("powierzchnia4= "+pomieszczenie4);
        System.out.println("Całkowita powierzchnia= "+calkowitaPowierzchnia);
        System.out.println("powierzchnia na osobe= "+ powierzchniaNaOsobę);

    }
}
