public class OperatoryLogicznee {
    public static void main(String[] args) {
        boolean firstValue = 2 > 1;
        boolean secondValue = 2 < 1;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // & - opefator i - wtedyy gdy dwa wyrazenia skladowe sa rowne true
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); // true

        //|| lub > true gdy jedno wyrazenie skladowe jest rowne true

        System.out.println(firstValue || secondValue); // true
        System.out.println(secondValue || thirdValue); // false

        // !  negacja, zwraca wartosc przeciwna do wyrazenia przed ktorym sie znajduje
        System.out.println(!firstValue);
        System.out.println(!(firstValue&secondValue)); // true




    }
}
