public class App {
    public static void main(String[] args) throws Exception {
        SekilDirector sd=new SekilDirector();

        Sekil kare = sd.Build(new KareBuilder());
        Sekil ucgen = sd.Build(new UcgenBuilder());
        Sekil altigen = sd.Build(new AltigenBuilder());
        kare.SekilVer();
        ucgen.SekilVer();
        altigen.SekilVer();
    }
}