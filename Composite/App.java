public class App {
    
    public static void main(String[] args) throws Exception {
        Yonetici yonetici1 = new Yonetici();
        yonetici1.setIsim("Y1");
        Gelistirici gelistirici1 = new Gelistirici();
        gelistirici1.setIsim("G2");
        Tasarimci tasarimci1 = new Tasarimci();
        tasarimci1.setIsim("T2");
        Tasarimci tasarimci2 = new Tasarimci();
        tasarimci2.setIsim("T3");

        Ekip ey1 = new Ekip(yonetici1);
        Ekip eg1 = new Ekip(gelistirici1);
        eg1.ekle(tasarimci2);
        
        ey1.ekle(eg1);
        ey1.ekle(tasarimci1);
        ey1.IsimGoster();

        /*
            CİKTİ:

            Y1
            --------------
            G2
            --------------
            T3
            T2
            
            Bu çıktı, Yonetici (Y1) tarafından yönetilen bir ekip içerisinde:
                Gelistirici (G2)'nin bir alt ekibi olduğu,
                Bu alt ekibin Tasarimci (T3) içerdiği,
                Ayrıca, ana ekibin direkt olarak başka bir Tasarimci (T2) içerdiği 
            hiyerarşiyi temsil eder.
            
        */

    }
}