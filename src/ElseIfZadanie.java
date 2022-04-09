import java.sql.SQLOutput;
import java.util.Scanner;

public class ElseIfZadanie {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("podaj swoj wiek, proszę :-)");
        int wiek = scanner.nextInt();

        if (wiek >= 18) {
            System.out.println("juz podaję alkohol ;)");
        } else {
            System.out.println("sory, gregory. jestes za mlody");
        }


    }
}
