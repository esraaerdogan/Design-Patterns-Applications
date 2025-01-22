public class KareBuilder extends SekilBuilder {

    //Concrete Builder

    @Override
    public SekilBuilder SetKenarSayisi() {
        sekil.kenarSayisi = 4;
        return this;
    }

    @Override
    public SekilBuilder SetBaslangicKonumu() {
        sekil.baslangicKonumu = 0;
        return this;
    }

    @Override
    public SekilBuilder SetUzunluk() {
        sekil.uzunluk = 5;
        return this;
    }

    @Override
    public SekilBuilder SetKalinlik() {
        sekil.kalinlik = 2;
        return this;
    }

    @Override
    public SekilBuilder SetKenarRengi() {
        sekil.kenarRengi = "kirmizi";
        return this;
    }

    @Override
    public SekilBuilder SetIcRenk() {
        sekil.icRengi = "mavi";
        return this;
    }
}