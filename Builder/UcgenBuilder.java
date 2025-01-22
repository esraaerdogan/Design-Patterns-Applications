public class UcgenBuilder extends SekilBuilder {

    @Override
    public SekilBuilder SetKenarSayisi() {
        sekil.kenarSayisi = 3;
        return this;
    }

    @Override
    public SekilBuilder SetBaslangicKonumu() {
        sekil.baslangicKonumu = 20;
        return this;
    }

    @Override
    public SekilBuilder SetUzunluk() {
        sekil.uzunluk = 8;
        return this;
    }

    @Override
    public SekilBuilder SetKalinlik() {
        sekil.kalinlik = 4;
        return this;
    }

    @Override
    public SekilBuilder SetKenarRengi() {
        sekil.kenarRengi = "mor";
        return this;
    }

    @Override
    public SekilBuilder SetIcRenk() {
        sekil.icRengi = "yesil";
        return this;
    }
}