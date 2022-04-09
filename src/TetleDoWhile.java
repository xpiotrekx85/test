public class TetleDoWhile {
    public static void main(String[] args) {
        int numer = 5;
        do {
            // za pierwszym razem najpierw wykonuje to co ponizej a potem przechodzi do sprawdzania warunku w while i sprawdza czy
            // false czy true
            System.out.println("moja wartosc to: " + numer + " i jestem mniejsza od 20");
            numer++;
        }while (numer <20);


    }
}
