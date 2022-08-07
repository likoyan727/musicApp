// Liana Ikoyan
// 002395362
// ikoyan@chapman.edu
// CPSC-231-01
// MP4_MusicApp
// This class

import java.util.ArrayList;
import java.util.Random;

public class ContentCollections implements Comparable<ContentCollections> {

  // Random object
  Random rand = new Random();

  // ArrayList of Content objects
  private ArrayList<Content> m_collection;
  // title of the collection
  private String m_title;


  // default constructor
  public ContentCollections() {
    m_collection = new ArrayList<Content>();
    m_title = "";
  }

  // overloaded constructor
  public ContentCollections(ArrayList<Content> collection, String title) {
    m_collection = collection;
    m_title = title;
  }

  // accesor methods for member variables
  public ArrayList<Content> getCollection() {
    return m_collection;
  }

  // shuffle
  // plays each content object in the collection in a random order
  public void shuffle() {
    ArrayList<Content> collectionCopy = new ArrayList<Content>();

    for (int i = 0; i <  m_collection.size(); ++i) {
      collectionCopy.add(m_collection.get(i));
    }
    Content randContent;
    while (collectionCopy.size() > 0) {
      randContent = collectionCopy.get(rand.nextInt(collectionCopy.size()));
      randContent.play();
      collectionCopy.remove(randContent);

    }

  }

  // add
  // adds specified content to m_collection
  public void add(Content c) {
    m_collection.add(c);
  }

  // compareTo
  // interface Comparable method
  // compares the size of two contentCollections objects
  // returns 0, a negative int, or a positive int depending on the order of the objects
  public int compareTo(ContentCollections otherCollection) {
    if (m_collection.size() > otherCollection.getCollection().size()){
      return 1;
    } else if (m_collection.size() < otherCollection.getCollection().size()){
      return -1;
    } else {
      return 0;
    }
  }

  // toString
  // returns string displaying all content in a collection
  public String toString() {
    String collectionDisplay = "";
    for (Content c : m_collection) {
      collectionDisplay += c.toString() + "\n";
    }
    return collectionDisplay;
  }

}
