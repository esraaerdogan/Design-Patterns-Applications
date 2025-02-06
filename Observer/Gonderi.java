import javax.swing.Icon;

public class Gonderi{
    private String icerik;
    private Icon icon;

    public Gonderi(String icerik){
        setIcerik(icerik);
    }

    public String getIcerik() { return icerik; }
    public void setIcerik(String icerik) { this.icerik = icerik; }
    
    public Icon getIcon() { return icon; }
    public void setIcon(Icon icon) { this.icon = icon; }
}