import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj danie: pizza, losos, pomidorowa, ziemniaki");
        String danie = scanner.next();


        switch (danie) {
            case "pizza":
                System.out.println(danie + " bedzie podana za 37 minut");
                break;
            case "losos":
                System.out.println(danie + " bedzie za 15 minut");
                break;
            case "pomidorowa":
                    System.out.println(danie + " bedzie za 3 minutku");
                    break;
            case "ziemniaki":
                System.out.println(danie + " beda za 8 minut");
                break;
            default:
                System.out.println(danie + " nie ma w naszej ofercie :-(");


        }




    }
}
