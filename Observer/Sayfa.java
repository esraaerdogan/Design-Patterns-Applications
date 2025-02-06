public class Sayfa extends TakipEdilen implements Paylasim{

    private String isim;

    public Sayfa(String isim) {
        this.isim = isim;
    }

    public String getIsim() {  return isim; }
    
    @Override
    public void paylas(Gonderi gonderi) {
        System.out.println(getIsim() + "paylasim yapti :" + gonderi.getIcerik());
        bilgilendir(gonderi);
    }
}