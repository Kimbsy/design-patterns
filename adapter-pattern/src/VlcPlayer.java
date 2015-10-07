public class VlcPlayer implements AdvancedMediaPlayer {

  @override
  public void playVlc(String fileName) {
    System.out.println("Playing vlc file. Name: " + fileName);
  }

  @override
  public void playMp4(String fileName) {
    // do nothing
  }

}