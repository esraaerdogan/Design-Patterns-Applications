public class AkilliEvSistemi{  // facade

    private Isik isik;
    private Televizyon televizyon;
    private Klima klima;
    private Kapi kapi;
    //singleton uygulandı.
    
    private AkilliEvSistemi(int isik1,int tkanal,int tses,int ksicaklik ){
        isik = new Isik(isik1);
        televizyon = new Televizyon(tkanal, tses);
        klima = new Klima(ksicaklik);
        kapi = new Kapi();
    }

    private static AkilliEvSistemi _AkilliEvSistemi;

    public static AkilliEvSistemi Instance(int isik1, int tkanal, int tses, int ksicaklik){
        if (_AkilliEvSistemi == null){
            _AkilliEvSistemi = new AkilliEvSistemi(isik1,tkanal,tses,ksicaklik);
        }
        return _AkilliEvSistemi;
    }

    public void isikAc() { isik.Ac(); }
    public void isikKapat() { isik.Kapat(); }

    public void tvAc() { televizyon.ac(); }
    public void tvKapat() { televizyon.kapat(); }

    public void tvSesAzalt() { televizyon.SesAzalt(); }
    public void tvSesArtir() { televizyon.SesArtir(); }

    public void tvKanalAzalt() { televizyon.KanalAzalt(); }
    public void tvKanalArtir() { televizyon.KanalArtir(); }

    public void klimaGuncelle(int a) { klima.guncelle(a); }
    public void klimaAc() { klima.ac(); }
    public void klimaKapat() { klima.kapa(); }    

    public void kapiKilitle() { kapi.kilitle(); }
    public void KapiAc() { kapi.kilitAc(); }

    public void UykuModu(int sicaklik) {
        System.out.println("Uyku Moduna geciliyor yapilan islemler:");
        klimaGuncelle(sicaklik); isikKapat();
        tvKapat();
        klimaAc();
        kapiKilitle();
    }

    public void SinemaModu(int sicaklik){
        System.out.println("sinema Moduna geciliyor:");
        klimaGuncelle(sicaklik);
        isikKapat();
        tvAc();
        klimaAc();
        kapiKilitle();
    }
}