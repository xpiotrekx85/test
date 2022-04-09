public class TabliceJednowymiarowe {
    public static void main(String[] args) {
        // arrays

       int [] tablica;
       tablica = new int[10];
       tablica[0] = 5;
       tablica[1] = 10;
       tablica[2]  = 12;
       tablica[3] = 155;

        System.out.println(tablica[3]);
        double [] tablicaDabli = new double[5];
        tablicaDabli[0] = 12.5;
        tablicaDabli[1] = 55.5;
        tablicaDabli[2] = 13.6;
        System.out.println(tablicaDabli[3]);

        //System.out.println(tablicaDabli[98]);

        int[] nowaTablicIntow = {10, 7, 5, 10, 11};
        System.out.println(nowaTablicIntow[2]);

        System.out.println(nowaTablicIntow.length);



    }
}
