public class StudentTest {

    public static void main(String[] args) {

        Student basia = new Student();

        basia.numerIndeksu = 1500;
        basia.nick = "Jaro";
        basia.email = "aa@bb.com";


        Student ola = new Student();

        ola.numerIndeksu = 800;
        ola.nick = "olaaaar";
        ola.email = "oola@bb.com";

        Student marysia = new Student();
        marysia.numerIndeksu = 700;
        marysia.nick = "maryska";
        marysia.email = "huehuehue@mamam.com";

        Student[] studenci = new Student[3];
        studenci[0] = basia;
        studenci[1] = ola;
        studenci[2] = marysia;

        for(int i = 0; i < studenci.length; i++) {
            studenci[i].email();
            studenci[i].numerIndeksu();
            studenci[i].nick();

        }

    }
}
