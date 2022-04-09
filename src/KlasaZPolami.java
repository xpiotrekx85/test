public class KlasaZPolami {
    int liczbaCalkowita;

    void zwrocWartoscPola() {
        System.out.println("Zwrocona wartosc z pola: " + liczbaCalkowita);
    }

    void ustawWartoscPola(int wartosc) {
        liczbaCalkowita = wartosc;

    }

    int zwrocWartoscPolaZMetody() {
        return liczbaCalkowita;
    }
}
