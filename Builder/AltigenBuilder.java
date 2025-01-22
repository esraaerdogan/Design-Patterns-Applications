public class AltigenBuilder extends SekilBuilder {

    @Override
    public SekilBuilder SetKenarSayisi() {
        sekil.kenarSayisi = 6;
        return this;
    }

    @Override
    public SekilBuilder SetBaslangicKonumu() {
        sekil.baslangicKonumu = 1;
        return this;
    }

    @Override
    public SekilBuilder SetUzunluk() {
        sekil.uzunluk = 3;
        return this;
    }

    @Override
    public SekilBuilder SetKalinlik() {
        sekil.kalinlik = 1;
        return this;
    }

    @Override
    public SekilBuilder SetKenarRengi() {
        sekil.kenarRengi = "sari";
        return this;
    }

    @Override
    public SekilBuilder SetIcRenk() {
        sekil.icRengi = "beyaz";
        return this;
    }
}