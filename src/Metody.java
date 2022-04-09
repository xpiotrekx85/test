public class Metody {
    public static void main(String[] args) {
        // ang. methods

        KlasaDlaMetody nazwaObiektu = new KlasaDlaMetody();
        nazwaObiektu.metodaKtoraNicNieZwraca();
        nazwaObiektu.metodaKtoraPrzyjmujeArgument(5,'b');
        nazwaObiektu.nazewnictwoDwolneAleKolejnaMetoda(false, 5);

        int wynikDodawanie =  nazwaObiektu.dodawanie(5, 6);
        System.out.println(wynikDodawanie);
        double dodawanieDabla = nazwaObiektu.dodajCosPoPrzecinku(2.5);
        System.out.println(dodawanieDabla);

        boolean zwracamWartoscBoolean = nazwaObiektu.zamienWartoscLogiczna(true);
        System.out.println(zwracamWartoscBoolean);

        nazwaObiektu.voidKtoryMialbyCosZwracac(true);
    }
}
