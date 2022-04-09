public class TabliceWielowymiarowe {
    public static void main(String[] args) {

        int[][] tablicaDwuwymiarowa = new int[5][5];
        tablicaDwuwymiarowa[0][1] = 123;
        System.out.println(tablicaDwuwymiarowa[0][1]);

        int[][] nowaTablica = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(nowaTablica[1][1]);
        System.out.println(nowaTablica.length);
        System.out.println(nowaTablica[0].length);
        System.out.println(nowaTablica[1].length);

       /* 1. Uzupełnij tablicę typu int rozmiaru 5 dowolnymi wartościami.
        Następnie zsumuj wszystkie elementy tej tablicy i wynik wypisz na
        ekran. Sumowania dokonaj poprzez dodawanie elementów
        odwołując się do indeksów tablicy.
        */

        int[] tablica = {1, 2, 3, 4, 5};
        int sumaTalicy = tablica[0] + tablica[1] + tablica[2] + tablica[3] + tablica[4];
        System.out.println("Suma tablicy równa się: " + sumaTalicy);

        /* 2. Utwórz tablicę dwuwymiarową typu double wymiaru 3x5 i także
        wypełnij dowolnymi wartościami. Tym razem zsumuj elementy z
        każdego wiersza osobno i wypisz wynik na ekran.
        */

        double[][] tablicaDwa = new double[3][5];
        tablicaDwa[0][0] = 13.1;
        tablicaDwa[0][1] = 12.5;
        tablicaDwa[0][2] = 15.0;
        tablicaDwa[0][3] = 16.1;
        tablicaDwa[0][4] = 11.7;

        double suma1 = tablicaDwa[0][0] + tablicaDwa[0][1] + tablicaDwa[0][2] + tablicaDwa[0][3] + tablicaDwa[0][4];
        System.out.println(suma1);

        tablicaDwa[1][0] = 13.5;
        tablicaDwa[1][1] = 11.0;
        tablicaDwa[1][2] = 12.0;
        tablicaDwa[1][3] = 14.3;
        tablicaDwa[1][1] = 12.0;

        tablicaDwa[2][0] = 9.5;
        tablicaDwa[2][1] = 11.5;
        tablicaDwa[2][2] = 7.0;
        tablicaDwa[2][3] = 0.5;
        tablicaDwa[2][4] = 11.3;





    }
}
