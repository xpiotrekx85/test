import java.util.Scanner;

public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę: ");
        int numer = scanner.nextInt();


        if(numer == 0) {
            System.out.println("liczba to zero");
        } else if (numer > 10) {
            System.out.println("liczba dodatnia, wieksza od 10");
        } else if(numer < 5) {
            System.out.println("liczba mniejsza od 5");
                } else {
            System.out.println("Zaden warunek nie został spelnony");
        }
    }
}
