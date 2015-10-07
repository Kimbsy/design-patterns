Adapter (Structural).

This pattern involves a single class which is responsible for joining funcitonalities of independant or incompatiable interfaces. The following example demonstrates an audio player device capable of playing mp3 files which wants to use an advanced audio player capable of playing vlc and mp4 files.

* Create interfaces for MediaPlayer and AdvancedMediaPlayer.
  * `MediaPlayer.java`
  * `AdvancedMediaPlayer.java`
* Create concrete classes implementing the AdvancedMediaPlayer interface.
  * `VlcPlayer.java`
  * `Mp4Player.java`
* Create adapter class implementing MediaPlayer interface.
  * `MediaAdapter.java`
* Create concrete class implementing the MediaPlayer interface.
  * `AudioPlayer.java`
* Use the AudioPlayer to play different types of audio formats.
  * `AdapterPatternDemo`
* Verify the output.
```
Playing mp3 file. Name: beyond the horizon.mp3
Playing mp4 file. Name: alone.mp4
Playing vlc file. Name: far far away.vlc
Invalid media. avi format not supported
```