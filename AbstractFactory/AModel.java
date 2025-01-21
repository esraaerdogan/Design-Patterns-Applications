public class AModel extends CarFactory{
    @Override
    public void createMotor() { setMotor(new DortSilindir()); }

    @Override
    public void createSanziman() {setSanziman(new DuzVites());}

    @Override
    public void createTekerlek() {   setTekerlek(new KisLastik()); }

    @Override
    public void createRenk() { setRenk(new Beyaz());}
}