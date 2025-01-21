public class BModel extends CarFactory{

    @Override
    public void createMotor() { setMotor(new UcSilindir());  }

    @Override
    public void createSanziman() { setSanziman(new OtomatikVites()); }

    @Override
    public void createTekerlek() { setTekerlek(new KisLastik()); }

    @Override
    public void createRenk() { setRenk(new Siyah());}
    
}