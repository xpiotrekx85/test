import java.util.Scanner;

public class CustomScanner {

    public static void main(String[] args) {
    /*    Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie: ");
        String name = scanner.nextLine();
        System.out.println("czesc " + name + "!");
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe : ");
        int  firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat liczby: " + firstNumber + " to: " + result);



    }
}
