public class Bilgisayar implements Device {
    
    @Override
    public String belgeUret() {
        return "Bilgisayar";
    }

    public void yazdir(PrinterBilgisayar printer){
        printer.yazdir(this);
    }

}