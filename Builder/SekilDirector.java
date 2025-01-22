public class SekilDirector {

    public Sekil Build(SekilBuilder sekilBuilder)
    {
        sekilBuilder.SetKenarSayisi();
        sekilBuilder.SetBaslangicKonumu();
        sekilBuilder.SetUzunluk();
        sekilBuilder.SetKalinlik();
        sekilBuilder.SetKenarRengi();
        sekilBuilder.SetIcRenk();
        
        return sekilBuilder.sekil;
    }

}