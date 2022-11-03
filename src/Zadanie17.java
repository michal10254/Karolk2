public class Zadanie17 {
    public static void main(String[] args) {

        int liczbaAkcji= 600;
        double wartoscakcji= (double)liczbaAkcji*21.77;
        double prowizja= wartoscakcji*0.02;
        double suma= prowizja+wartoscakcji;

        System.out.println(" kwota zapłacona za akcje: "+wartoscakcji+"\n prowizja: "
                +prowizja+"\n suma: "+suma);

    }
}
