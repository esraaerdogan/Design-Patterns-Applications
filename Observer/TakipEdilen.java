import java.util.ArrayList;
import java.util.List;

public class TakipEdilen extends Isim{

    private List<Takipci> takipciler;

    public TakipEdilen(){
        takipciler = new ArrayList<>();
    }

    public void takipciEkle(Takipci takipci){
        takipciler.add(takipci);
    }

    public void bilgilendir(Gonderi gonderi){
        for(Takipci takipci : takipciler){
            takipci.bilgiAl(gonderi);
        }
    }
}