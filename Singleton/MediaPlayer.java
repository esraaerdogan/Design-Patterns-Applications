public class MediaPlayer implements Runnable{
    private Kanal kanal;
    private boolean kontrol;
    private static MediaPlayer mediaPlayer;
    private MediaPlayer(){ kontrol=true; }
    public static MediaPlayer getMediaPlayer(){
        if(mediaPlayer == null){ mediaPlayer = new MediaPlayer(); }
        return mediaPlayer;
    }
    public Kanal getKanal() { return kanal; }
    public void setKanal(Kanal kanal) { this.kanal = kanal; }
    public void oynat() {
        kontrol=true;
        new Thread(this).start();
    }
    public void durdur() { kontrol=false; }
    public void kanalSec(Kanal kanal){ setKanal(kanal); }
    @Override
    public void run() {
        while(kontrol){
            App.sleep(1000);
            System.out.println(kanal.getIsim() + " - " + kanal.getLink() + " playing.");
        }
    }
}