public class PetleBreakContinue {
    public static void main(String[] args) {
        int zmienna;

        for (zmienna = 1; zmienna <= 20; zmienna++){
            if (zmienna == 18){
                continue;
            }
            System.out.println("zmienna: " + zmienna);
        }

        for(zmienna =1; zmienna <=20; zmienna++){
            if (zmienna == 18){
                break;
            }
            System.out.println("zmienana w drugiej petli: " + zmienna);

        }
    }
}
