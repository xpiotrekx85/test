public class Auto {

    public String marka;
    public String model;
    public Integer rokProdukcji;
    public Integer przebieg;

    public void jedz() {
        System.out.println("jade");
    }

    public void hamuj() {
        System.out.println("hamuj");


    }
    public void info() {
        System.out.println("marka " + marka);
        System.out.println("Model " + model);
        System.out.println("przebieg " + przebieg);
        System.out.println("Rok produkcji " + rokProdukcji);
    }

}
