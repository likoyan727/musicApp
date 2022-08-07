// Liana Ikoyan
// 002395362
// ikoyan@chapman.edu
// CPSC-231-01
// MP4_MusicApp
// This class creates a Listener object, extended from the Accounts class

import java.util.ArrayList;

public class Listener extends Accounts {

  // ArrayList of content favorited by an account
  private ArrayList<Content> m_favoredContent;

  // default constructor
  public Listener() {
    super();
    m_favoredContent = new ArrayList<Content>();
  }

  // overloaded constructor
  public Listener(String id) {
    super(id);
    m_favoredContent = new ArrayList<Content>();
  }

  // accessor method for m_favoredContent
  public ArrayList<Content> getFavoredContent() {
    return m_favoredContent;
  }

  // favorite
  // adds favorited content to favoredContent ArrayList
  public void favorite(Content favoritedContent) {
    m_favoredContent.add(favoritedContent);
  }

}
