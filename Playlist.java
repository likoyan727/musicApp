// Liana Ikoyan
// 002395362
// ikoyan@chapman.edu
// CPSC-231-01
// MP4_MusicApp
// This class creates a Playlist object, extended from the ContentCollections class

public class Playlist extends ContentCollections {

  // default constructor
  public Playlist() {
    super();
  }

  // add
  // adds a song or podcast to the ArrayList
  public void add(Content content) {
    m_collection.add(content);
  }

  // remove
  // removes and song or podcast from the ArrayList
  public void remove(Content content) {
    m_collection.remove(content);

  }

}
