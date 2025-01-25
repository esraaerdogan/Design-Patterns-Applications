public class App {
    public static void main(String[] args) throws Exception {
        AkilliEvSistemi facade= AkilliEvSistemi.Instance(1,2,5,24);
        facade.tvAc();
        facade.tvKanalArtir();
        facade.tvSesArtir();
        facade.klimaGuncelle(30);
        facade.isikAc();
        facade.UykuModu(25);
      
    }
}