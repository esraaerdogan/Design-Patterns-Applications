public class App {
    public static void main(String[] args) {

        CarFactory aModel = new AModel();
        CarFactory bModel = new BModel();
        CarFactory cModel = new CModel();

        // AModel aracı üretimi
        aModel.createMotor();
        aModel.createSanziman();
        aModel.createTekerlek();
        aModel.createRenk();
        System.out.println("\nA Modeli:");
        aModel.calistir();
        aModel.degistirVites();
        aModel.dondurTekerlek();
        aModel.boyama();

        System.out.println("\n----------------------------------");

        // BModel aracı üretimi
        bModel.createMotor();
        bModel.createSanziman();
        bModel.createTekerlek();
        bModel.createRenk();
        System.out.println("\nB Modeli:");
        bModel.calistir();
        bModel.degistirVites();
        bModel.dondurTekerlek();
        bModel.boyama();

        System.out.println("\n----------------------------------");

        // CModel aracı üretimi
        cModel.createMotor();
        cModel.createSanziman();
        cModel.createTekerlek();
        cModel.createRenk();
        System.out.println("\nC Modeli:");
        cModel.calistir();
        cModel.degistirVites();
        cModel.dondurTekerlek();
        cModel.boyama();
    }
}
