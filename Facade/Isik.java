public class Isik{

    private boolean durum;

    public Isik(int d){
        if (d == 1){ durum = true; }
        if (d==0) { durum = false; }
    }

    public boolean isDurum(){  return durum; }
    public void setDurum(boolean durum){ this.durum=durum; }

    public void Ac() {
        durum = true;
        System.out.println("Isik Acik");
    }

    public void Kapat(){
        durum = false;
        System.out.println("Isik Kapali");
    }
}  