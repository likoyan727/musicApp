// Liana Ikoyan
// 002395362
// ikoyan@chapman.edu
// CPSC-231-01
// MP4_MusicApp
// This class creates a Podcast object, extended from the Content class

public class Podcast extends Content {

  // episode number of a podcast
  private int m_episodeNum;

  // default constructor
  public Podcast() {
    super();
    m_episodeNum = 0;
  }

  // overloaded constructor
  public Podcast(String title, String author, int episodeNum) {
    super(title, author, episodeNum);
    m_episodeNum = episodeNum;
  }

  // play
  // displays content being played
  // increases number of times streamed by one
  public void play() {
    m_numTimesStreamed += 1;
    System.out.println("Now playing: ");
    System.out.println(toString);
  }

  // toString
  // returns a string displaying podcast title, artist, and episode number
  // overrides Content toString
  public String toString() {
    return m_title + ", by " + m_artistAccount + ", episode number " + m_episodeNum;
  }



}
