public class Hp implements PrinterBilgisayar, PrinterTablet {

    @Override
    public void yazdir (Bilgisayar bilgisayar) {
        System.out.println(bilgisayar.belgeUret() + ": Hp : yazdirildi");
    }
    
    @Override
    public void yazdir(Tablet tablet) {
        System.out.println(tablet.belgeUret() + ": Hp : yazdirildi");
    }
}