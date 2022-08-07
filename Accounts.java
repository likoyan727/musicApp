// Liana Ikoyan
// 002395362
// ikoyan@chapman.edu
// CPSC-231-01
// MP4_MusicApp
// This class creates an account object, either an artist account or listener account

import java.util.ArrayList;

public class Accounts {

  // id associated with the account
  private String m_id;

  // default constructor
  public Accounts() {
    m_id = "";
  }

  // overloaded constructor
  public Accounts(String id) {
    m_id = id;
  }

  // accessor method for m_id
  public String getId() {
    return m_id;
  }

  // toString
  // returns string displaying account id
  public String toString() {
    return "Account ID: " + m_id;
  }


}
