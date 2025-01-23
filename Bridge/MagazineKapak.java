abstract class MagazineKapak { // Abstraction

    private IBoyutImplementor boyut;
    private IRenkImplementor renk;

    public MagazineKapak(IBoyutImplementor boyut, IRenkImplementor renk) {
        this.boyut = boyut;
        this.renk = renk;
    }

    public IBoyutImplementor getBoyut() {
        return boyut;
    }

    public IRenkImplementor getRenk() {
        return renk;
    }

    public void kapakUret() {
        boyut.kapakKes();
        renk.kapakBoya();
    }
}