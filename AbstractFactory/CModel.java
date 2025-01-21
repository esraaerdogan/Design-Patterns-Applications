public class CModel extends CarFactory{

    @Override
    public void createMotor() { setMotor(new UcSilindir()); }

    @Override
    public void createSanziman() { setSanziman(new OtomatikVites()); }

    @Override
    public void createTekerlek() { setTekerlek(new YazLastik()); }

    @Override
    public void createRenk() { setRenk(new Kirmizi()); }
    
}