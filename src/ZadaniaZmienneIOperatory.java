public class ZadaniaZmienneIOperatory {
    public static void main(String[] args) {
      /*  1. Utwórz program, w którym stworzysz zmienne i przypiszesz do tych
        zmiennych wartości takie jak Twój wiek, wzrost, waga. Niech będą w
        jednostkach lata, metry, kilogramy odpowiednio. Będziesz potrzebował 3 zmienne.
                Zastanów się nad nazewnictwem oraz typem zmiennych. Na koniec wypisz wszystko na ekran.
        */

        int wiek = 37;
        float  wzrost = 1.72f;
        float waga = 100.0f;

        // obliczanie BMI wzor masa / wzrost ^2


        float bmi = (float) (waga / Math.pow(wzrost, 2));
        System.out.println("bmi: " + bmi);

        // konwersja wyniku na liczbe calkowita float na int

        int bmiInt = (int) bmi;
        System.out.println(bmiInt);


        int a = 13;
        int b = 2;
        int c = 3;
        int d = 11;

        int wDzielnia = a / b;
        System.out.println(wDzielnia);
        int wDzielnia2 = a / c;
        System.out.println(wDzielnia);
        int wDzielnia3 = a / d;
        System.out.println(wDzielnia);

        int rDzielenia = a % b;
        System.out.println(rDzielenia);
        int rDzielenia2 = a % c;
        System.out.println(rDzielenia);
        int rDzielenia3 = a % d;
        System.out.println(rDzielenia);





    }
}
