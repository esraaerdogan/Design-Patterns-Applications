public class Canon implements PrinterTablet, PrinterBilgisayar {

    @Override
    public void yazdir(Bilgisayar bilgisayar) {
        System.out.println(bilgisayar.belgeUret() + ": Canon : yazdirildi");
    }
    
    @Override
    public void yazdir(Tablet tablet) {
        System.out.println(tablet.belgeUret() + ": Canon : yazdirildi");
    }
}