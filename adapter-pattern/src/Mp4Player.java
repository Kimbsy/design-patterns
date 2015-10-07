public class Mp4Player implements AdvancedMediaPlayer {

  @override
  public void playVlc(String fileName) {
    // do nothing
  }

  @override
  public void playMp4(String fileName) {
    System.out.println("Playing mp4 file. Name: " + fileName);
  }

}
