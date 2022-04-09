public class TypyProsteKonwertowanie {
    public static void main(String[] args) {
        int i = 6;
        double d = 2.2;
        System.out.println(i / d);

        double d2 = (double) i;

        byte by = 100;
        // konwertowanie nie jawne, nie piszem nic w nawiasie
        int i2 = by;

        float f = 123.22f;
        d2 = (double) f;

        // konwertowanie jawne, inaczej rzutowanie

        long zmiennaLong = 123;
        int zmiennaInt = (int) zmiennaLong;

        zmiennaLong = 12344454555454L;

        byte bajt = 102;
        short shor = 10022;
        int in = 122121;

        in = bajt;
        in = shor;

        shor = bajt;

        bajt = (byte) in;
        System.out.println(bajt);

        int intObliczenia = 6;
        double doubleObliczenia = 2.2;

        double wynik = intObliczenia / doubleObliczenia;

        double doublePierwszy = 1.2;
        double doubleDrugi = 12.4;
        double wynikDouble = doubleDrugi / doublePierwszy;
        System.out.println(wynikDouble);

        int wynikInt = (int) doubleDrugi / (int) doublePierwszy;
        System.out.println(wynikInt);

        int wynikInt2 = (int) (doubleDrugi / doublePierwszy);
        System.out.println(wynikInt2);

        char c = 'a';
        int czyMogeZaczarowacInta = c;
        System.out.println(czyMogeZaczarowacInta);



    }
}
