import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbę: ");
        int pierwszaLiczba = scanner.nextInt();
        System.out.println("podaj drugą liczbę: ");
        int drugaLiczba = scanner.nextInt();

        int dodawanie = pierwszaLiczba + drugaLiczba;
        int odejmowanie = pierwszaLiczba - drugaLiczba;
        int mnozenie = pierwszaLiczba * drugaLiczba;
        int dzielenie = pierwszaLiczba / drugaLiczba;
        int resztaZDzielenia = pierwszaLiczba % drugaLiczba;

        System.out.println("dodawanie " + dodawanie);
        System.out.println("odejmowanie " + odejmowanie);
        System.out.println("mnozenie " + mnozenie);
        System.out.println("dzielenie " + dzielenie);
        System.out.println("reszta z dzielenia " + resztaZDzielenia);

        Calculator kalkulator = new Calculator();
        System.out.println("wynik dodawania " + (kalkulator.dodaj(2, 4)));
        System.out.println("Wynik odejmowania " + (kalkulator.odejmij(1, 4)));
        System.out.println("Wynik dzielenia " + (kalkulator.pddziel(5, 7)));
        System.out.println("Wynik mnozenia " + (kalkulator.pomnoz(7, 11)));
        System.out.println("Reszta z dzielenia " + (kalkulator.reszta(10, 3)));



    }
}
