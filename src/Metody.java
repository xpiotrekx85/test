public class Metody {

    public void policzWynik() {
        System.out.println("zaraz policze wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = i;

        }
        System.out.println("rezultat to " + result);
    }

    public int pobierzWynik() {
        System.out.println("zaraz policze wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = i;

        }
        System.out.println("rezultat to " + result);
        return result;
    }

    public void policzWynikParam(int number) {
        System.out.println("number ma wartosc: " + number);
        System.out.println("zaraz policze wynik");
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = i;

        }
        System.out.println("rezultat to " + result);
    }

    public int add(int fistNumber, int secondNumber, String word ) {
        System.out.println("suma to: " + (fistNumber + secondNumber));
        System.out.println(word);
        if(fistNumber == 0) {
            return 0;
        }
        return fistNumber + secondNumber;


    }
}