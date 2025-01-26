public class App {
    public static void main(String[] args) throws Exception {

        Bilgisayar bilgisayar = new Bilgisayar();
        Tablet tablet = new Tablet();

        Hp hp = new Hp();
        Canon canon = new Canon();

        bilgisayar.yazdir(hp);
        bilgisayar.yazdir(canon);
        tablet.yazdir(hp);
        tablet.yazdir(canon);

    }
}