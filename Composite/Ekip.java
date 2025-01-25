import java.util.ArrayList;
import java.util.List;

public class Ekip extends Personel{

    private Personel personel;
    private List<Personel> personelListe;
    
    public void setPersonel(Personel personel) { 
        this.personel = personel;
    }
    public Personel getPersonel() { 
        return personel;
    }

    public void setPersonelListe(List<Personel> personelListe) {
        this.personelListe = personelListe;
    }
    public List<Personel> getPersonelListe() {
        return personelListe;
    }

    public Ekip(){}
    
    public Ekip(Personel personel){  
        //buradaki personel dugumun kendisini temsil ediyor
        setPersonel(personel);
        personelListe = new ArrayList<>();
    }

    public void ekle(Personel personel){  
        //buradaki personel, personel dugumunun altindaki personeller
        personelListe.add(personel);
    }

    public void cikar(Personel personel){
        personelListe.remove(personel);
    }

    @Override
    public void IsimGoster() {
        System.out.println(personel.getIsim());
        System.out.println("--------------");
        for(Personel personel :personelListe){
            personel.IsimGoster();
        }
    }
}