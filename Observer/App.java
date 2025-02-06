public class App {
    public static void main(String[] args) throws Exception {
        
        Kullanici k1 = new Kullanici("Sefa");
        Sayfa s1 = new Sayfa("Yazilim");

        Kullanici t1 = new Kullanici("Emir");
        Grup g1 = new Grup("YzmGrup");

        k1.takipciEkle(t1);
        k1.takipciEkle(g1);
        s1.takipciEkle(g1);

        k1.paylas(new Gonderi("Test 1"));
        s1.paylas(new Gonderi("Test 2"));

    }
}