// Liana Ikoyan
// 002395362
// ikoyan@chapman.edu
// CPSC-231-01
// MP4_MusicApp
// This class creates content objects representing the content of the app, either songs or podcasts

import java.util.ArrayList;

public class Content implements Comparable<Content> {

  // title of the content
  private String m_title;
  // account name of the content's artist
  private String m_artistAccount;
  // ArrayList of up to 3 genres
  private String[] m_genres = new String[3];
  // number of times the content was streamed
  private int m_numTimesStreamed;

  // default constructor
  public Content() {
    m_title = "";
    m_artistAccount = "";
    m_genres = m_genres;
    m_numTimesStreamed = 0;
    }

  // overloaded constructor
  // creates song content object
  public Content(String title, String artistAccount) {
    m_title = title;
    m_artistAccount = artistAccount;
    m_numTimesStreamed = 0;
    }

  // accessor methods for member variables
  public int getNumTimesStreamed() {
    return m_numTimesStreamed;
  }

  // play
  // displays content being played
  // increases number of times streamed by one
  public void play() {
    m_numTimesStreamed += 1;
    System.out.println("Now playing: ");
    System.out.println(this);
  }


  // compareTo
  // interface Comparable method
  // compares the number of times two content objects are streamed
  // returns 0, a negative int, or a positive int depending on the order of the objects
  public int compareTo(Content otherContent) {
    if (m_numTimesStreamed > otherContent.getNumTimesStreamed()){
      return 1;
    } else if (m_numTimesStreamed < otherContent.getNumTimesStreamed()){
      return -1;
    } else {
      return 0;
    }
  }

  // toString
  // returns a string displaying content title and artist
  public String toString() {
    return m_title + ", by " + m_artistAccount;
  }


}
