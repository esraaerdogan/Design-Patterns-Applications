public class App {
    public static void main(String[] args) {
        
        // A4 boyutunda kırmızı bir dergi kapağı
        Dergi dergi1 = new Dergi(new A4Boyut(), new KirmiziKapak());
        dergi1.kapakUret();

        // A5 boyutunda mavi bir kitap kapağı
        Kitap kitap1 = new Kitap(new A5Boyut(), new MaviKapak());
        kitap1.kapakUret();
    }
}
