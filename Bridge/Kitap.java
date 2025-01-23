public class Kitap extends MagazineKapak { 

    public Kitap(IBoyutImplementor boyut, IRenkImplementor renk) {
        super(boyut, renk);
    }

    @Override
    public void kapakUret() {
        System.out.println("Kitap Kapagi Uretiliyor");
        super.kapakUret();
        System.out.println("Kitap Kapagi Uretildi");
        System.out.println("*");
    }
}