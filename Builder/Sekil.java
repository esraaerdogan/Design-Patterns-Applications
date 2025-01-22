public class Sekil {

    public int kenarSayisi;
    public int baslangicKonumu;
    public int uzunluk;
    public int kalinlik;

    public String kenarRengi;
    public String icRengi;

    public int getKenarSayisi() { return kenarSayisi; }
    public void setKenarSayisi(int kenarSayisi) { this.kenarSayisi = kenarSayisi; }

    public int getBaslangicKonumu() { return baslangicKonumu; }
    public void setBaslangicKonumu(int baslangicKonumu) { this.baslangicKonumu = baslangicKonumu; }
    
    public int getUzunluk() { return uzunluk; }
    public void setUzunluk(int uzunluk) { this.uzunluk = uzunluk; }

    public int getKalinlik() { return kalinlik; }
    public void setKalinlik(int kalinlik) { this.kalinlik = kalinlik; }

    public String getKenarRengi() { return kenarRengi; }
    public void setKenarRengi(String kenarRengi) { this.kenarRengi = kenarRengi; }

    public String getIcRengi() { return icRengi; }
    public void setIcRengi(String icRengi) { this.icRengi = icRengi; }

    public void SekilVer(){
        System.out.println(kenarSayisi + " kenarlı, bir kenarının uzunluğu " + uzunluk +
                            ", kalinliği " + kalinlik + " olan, kenar rengi " + kenarRengi + 
                            ", iç kenar rengi " + icRengi + " olan sekil getirilmistir.");
    }
}