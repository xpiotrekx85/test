public class KlasaDlaMetody {

    // typZwracany nazwaMetody(parametry) {
    // }

    void metodaKtoraNicNieZwraca() {
        System.out.println("Wartosc wypisana z metody");



    }

    void metodaKtoraPrzyjmujeArgument(int liczba, char pojedynczyZnak) {
        liczba++;
        System.out.println("Wartosc z metody " + liczba + "" + pojedynczyZnak);


    }

    void nazewnictwoDwolneAleKolejnaMetoda(boolean czyPokazac, int liczba) {
        if (czyPokazac) {
            System.out.println("liczba: " + liczba);
        } else {
            System.out.println("Nie pozwolono pokazac");
        }
    }

        int  dodawanie(int a, int b) {
            int wynik = a + b;
            System.out.println("dodawanie: " + wynik);
            return wynik;
        }

        double dodajCosPoPrzecinku(double liczbaDobule) {
        double wynik = liczbaDobule + 0.55;
        return wynik;
        }

        boolean zamienWartoscLogiczna(boolean wartoscLogiczna) {
        return !wartoscLogiczna;
        }

        int zwrocOdWartosciLogicznej(boolean czyZwrocic, int liczba) {
        if (czyZwrocic) {
            return liczba;
            } else {
                return  0;
            }


        }

        int przykladKolejnej() {
        return 100;
            //System.out.println("wartosc zostala zwrocona");

        }

        void voidKtoryMialbyCosZwracac(boolean czyZakonczyc) {
        if(czyZakonczyc){
            return;
        }
            System.out.println("cos zapisane bo nie zakpnczone wartoscia logiczna");
        }

    }





