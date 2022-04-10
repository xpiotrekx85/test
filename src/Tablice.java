public class Tablice {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Bartek";
        imiona[1] = "Basoa";
        imiona[2] = "Michał";

        System.out.println(imiona[2]);

        int[] lotto = new int[] {1, 2, 3, 4, 5, 6};

        System.out.println(lotto[4]);

        System.out.println(lotto.length);

        for(int i = 0; i < imiona.length; i++) {
            System.out.println(imiona[i]);
    }

        // wypisz liczby z zakresu 1-100 podzoelne przez 3
        // odwroc elementy tablicy [1,3,5] -> [5,3,1]
        // odwracanie tablic jest na rozmowach rekrutacyjnych

        for(int i = 0; i < 100; i++) {
            if(i % 3 == 0)
                System.out.println("jestem podzielna przez 3: " + i);

        }

        int[] tab = new int[] {1, 3, 5, 7, 0};

        for(int i = 0; i < tab.length / 2; i++ ) {
            int temp = tab[i]; // dla i = 0 i = 1 3
            tab[i] = tab[(tab.length - 1 - i)]; // 4 -> 0 3 -> 7
            tab[tab.length-1-i] = temp; // 1 // tab[3] = 3
            System.out.println("iteracja numer  " + i);


        }
        for(int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }
}

