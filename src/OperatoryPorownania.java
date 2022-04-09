import java.util.Scanner;

public class OperatoryPorownania {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj pierwsza liczbę:");
        int firstNumber = scanner.nextInt();
        System.out.println("podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        boolean result = secondNumber > firstNumber;
        System.out.println(result);
        System.out.println( firstNumber > secondNumber);
        System.out.println(firstNumber == firstNumber);
        System.out.println(firstNumber > secondNumber);
        System.out.println(secondNumber <= firstNumber);
        System.out.println(secondNumber >= secondNumber);
        System.out.println(secondNumber != firstNumber);
        System.out.println(firstNumber != firstNumber);




    }
}
