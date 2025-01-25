public class Televizyon{
    private int sesSeviye;
    private int kanalNo;

    public Televizyon(int SesSeviye, int KanalNo){
        SesSeviye = sesSeviye;
        KanalNo = kanalNo;
    }    
    
    public int getSesSeviye() { return sesSeviye;}
    public void setSesSeviye(int sesSeviye) {this.sesSeviye = sesSeviye; }

    public int getKanalNo() { return kanalNo; }
    public void setKanalNo(int kanalNo) { this.kanalNo = kanalNo;}

    public void SesArtir() {  
        setSesSeviye(sesSeviye++); 
        System.out.println("ses:" + sesSeviye); 
    }
    public void SesAzalt() { 
        setSesSeviye(sesSeviye--);
        System.out.println("ses:" + sesSeviye); 
    }

    public void ac() { 
        System.out.println("televizyon acik"); 
    }
    public void kapat() { 
        System.out.println("televizyon kapali"); 
    }

    public void KanalArtir() { 
        setKanalNo(kanalNo++); 
        System.out.println("Kanal:" + kanalNo); 
    }
    public void KanalAzalt() { 
        setKanalNo(kanalNo--);
        System.out.println("Kanal:" + kanalNo); 
    }
}