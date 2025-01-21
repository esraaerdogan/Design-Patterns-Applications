public abstract class CarFactory{
    private Motor motor;
    private Sanziman sanziman;
    private Tekerlek tekerlek;
    private Renk renk;

    public abstract void createMotor();
    public abstract void createSanziman();
    public abstract void createTekerlek();
    public abstract void createRenk();

    public void calistir(){ 
        System.out.println("Motor çalıştırılıyor...");
        getMotor().calistir();
    }

    public void degistirVites() {
        System.out.println("Vites değiştiriliyor...");
        getSanziman().degistir();
    }

    public void dondurTekerlek() {
        System.out.println("Tekerlek dönüyor...");
        getTekerlek().dondur();
    }

    public void boyama() {
        System.out.println("Araba boyanıyor...");
        getRenk().doldur();
    }

    public void setMotor(Motor motor) { this.motor = motor; }
    public Motor getMotor() {return motor; }

    public void setRenk(Renk renk) { this.renk = renk;}
    public Renk getRenk() { return renk;}

    public void setSanziman(Sanziman sanziman) { this.sanziman = sanziman;}
    public Sanziman getSanziman() { return sanziman; }

    public void setTekerlek(Tekerlek tekerlek) { this.tekerlek = tekerlek; }
    public Tekerlek getTekerlek() { return tekerlek; }
}
