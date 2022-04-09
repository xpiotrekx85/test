public class KlasaObiektProsty {
    public static void main(String[] args) {
        int typProsty = 100;
        Przyklad przyklad = new Przyklad();
        Przyklad przykladDrugi = new Przyklad();

        przyklad.pole = 123;
        przykladDrugi.pole = 333;

        System.out.println("Przykład: " + przyklad.pole);
        System.out.println("PrzykladDrugi: " + przykladDrugi.pole);



    }
}
