public class Tablet implements Device {

    @Override
    public String belgeUret() {
        return "Tablet";
    }
    
    public void yazdir(PrinterTablet printer){
        printer.yazdir(this);
    }
}