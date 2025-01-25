public class Klima{

    private int sicaklik;

    public Klima(int Sicaklik){
       this.sicaklik = Sicaklik;
    }
    
    public int getSicaklik() { return sicaklik; }
    public void setSicaklik(int sicaklik) { this.sicaklik = sicaklik; }
    
    public void guncelle(int a) {
        sicaklik = a;
        System.out.println("Sicaklik: "+sicaklik);
    }

    public void ac(){ 
        System.out.println("klima acildi");
    }

    public void kapa(){ 
        System.out.println("klima kapandi"); 
    }
}