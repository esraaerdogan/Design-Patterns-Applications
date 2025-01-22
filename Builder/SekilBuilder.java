public abstract class SekilBuilder{

    protected Sekil sekil;

    public Sekil getSekil() { return sekil; }

    public SekilBuilder() { sekil = new Sekil(); }
    
    public abstract SekilBuilder SetKenarSayisi();
    public abstract SekilBuilder SetBaslangicKonumu();
    public abstract SekilBuilder SetUzunluk();
    public abstract SekilBuilder SetKalinlik();
    public abstract SekilBuilder SetKenarRengi();
    public abstract SekilBuilder SetIcRenk();
}