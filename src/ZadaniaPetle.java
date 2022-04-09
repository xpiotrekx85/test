public class ZadaniaPetle {
    public static void main(String[] args) {

        for(int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }

        for (int j = 30; j >= -1000; j--){
            System.out.print(j + " ");
        }

        for (int k = 0; k <= 30; k = k + 2){
            System.out.println(k);
        }

        int a = 0;
        int b = 30;
        for(int l = a; l <= b; l++){
            System.out.println(l);
        }

        int[] tab = {11, 15, 155, 155, 80, 32, -204, 50, 10, 11};

        for(int i = 0; i <= tab.length - 1; i++)
            System.out.println(tab[i] + " ");
        System.out.println();
        for(int i = tab.length - 1; i >= 0; i--)
            System.out.println(tab[i]);

        System.out.println();
        int wynik = 0;
        for(int i = 0; i < tab.length - 1; i++)
            //wynik = tab[i] + wynik;
            wynik += tab[1];

            System.out.println(wynik
            );


        System.out.println("pół choinki :-)");

        int n = 50;
        int liczbaGwiazdek = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= liczbaGwiazdek; j++){
                System.out.print("*");
            }
            System.out.println();
                liczbaGwiazdek++;
        }
    }
}
