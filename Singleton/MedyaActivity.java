public class MedyaActivity implements Activity{
    private MediaPlayer mediaPlayer;
    @Override
    public void onCreate() { mediaPlayer=MediaPlayer.getMediaPlayer(); }
    public void play(){ mediaPlayer.oynat(); }
    public void pause(){ mediaPlayer.durdur(); }
    public void kanalSec(Kanal kanal){
        mediaPlayer.kanalSec(kanal);
        mediaPlayer.oynat();
    }
}
