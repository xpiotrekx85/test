import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbę: ");
        int pierwszaLiczba = scanner.nextInt();
        System.out.println("podaj drugą liczbę: ");
        int drugaLiczba = scanner.nextInt();
        System.out.println("Wynik mnożenia:  " + pierwszaLiczba + " *  " + drugaLiczba + " = " + (pierwszaLiczba * drugaLiczba));
        System.out.println("Wynik odejmowania: " + drugaLiczba + " - " + pierwszaLiczba + " = " + (drugaLiczba - pierwszaLiczba));


    }
}
