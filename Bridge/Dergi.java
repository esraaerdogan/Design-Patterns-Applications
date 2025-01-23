public class Dergi extends MagazineKapak {

    public Dergi(IBoyutImplementor boyut, IRenkImplementor renk) {
        super(boyut, renk);
    }

    @Override
    public void kapakUret() {
        System.out.println("Dergi Kapagi Uretiliyor");
        super.kapakUret();
        System.out.println("Dergi Kapagi Uretildi");
        System.out.println("*");
    }
}
