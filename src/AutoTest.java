public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "W124";
        mercedes.rokProdukcji = 1985;
        mercedes.przebieg = 25000;

        mercedes.info();
        mercedes.jedz();
        mercedes.hamuj();

        Auto noName = new Auto();

        noName.info();


    }
}
