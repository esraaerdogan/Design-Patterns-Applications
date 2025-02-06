public class Kullanici extends TakipEdilen implements Paylasim, Takipci{

    private String isim;

    public Kullanici(String isim) {
        this.isim = isim;
    }

    public String getIsim() { return isim; }

    @Override
    public void paylas(Gonderi gonderi){
        System.out.println(getIsim() + "paylasim yapti :" + gonderi.getIcerik());
        bilgilendir(gonderi);
    }

    @Override
    public void bilgiAl(Gonderi gonderi){
        System.out.println(getIsim() + " bilgi aldi:" + gonderi.getIcerik());
    }
}