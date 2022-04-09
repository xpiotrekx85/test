public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        // ang. conditional statements

       int wiek = 18;
       boolean przyszedltata = false;
       boolean przyszedlZMama = true;


       if(wiek < 10) {
           System.out.println("warunek spełniony");
       } else if(przyszedltata) {
           System.out.println("od razu podaj");
        }else if(przyszedlZMama) {
           System.out.println("pozwol im na zakup");
       }else {
           System.out.println("warunek nie został spełniony");
       }

    int liczba = 5;

       if(liczba % 2 == 0) {
           System.out.println("liczba  jest parzysta");
       } else {
           System.out.println("liczba nie jest parzysta");
       }


      double kwota = 5555321.89;
      if (kwota <= 85525) {
          double podatek = kwota * 0.17;
          System.out.println("podatek do zaplaty w pierwszym progu wynosi: " + podatek);
      } else if(kwota > 85525) {
          double podatek = kwota * 0.32;
          System.out.println("podatek do zaplaty  w drugim progu wynosi: " + podatek);
      } else {
          System.out.println("nie moge obliczyc podatku, sprawdz wprowadzone dane!");
      }

    double pierwszaLiczba = 5.0;
    double drugaLiczba = 3.0;







    }

}