import java.util.ArrayList;

public class KanalActivity implements Activity{
    private ArrayList<Kanal> kanalListesi;
    @Override
    public void onCreate() { kanalListesi = new ArrayList<>(); }
    public void kanalEkle(Kanal kanal){ kanalListesi.add(kanal); }
}