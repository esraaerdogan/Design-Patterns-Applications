public class Grup extends Isim implements Takipci{

    private String isim;

    public Grup(String isim) {
        this.isim = isim;
    }

    public String getIsim() { return isim; }
    
    @Override
    public void bilgiAl(Gonderi gonderi){
        System.out.println(getIsim() + " bilgi aldi:" + gonderi.getIcerik());
    }

}