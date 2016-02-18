public class Card {
  private String mSuit;
  private String mValue;

  public Card(String value, String suit){
    mSuit = suit;
    mValue = value;
  }

  public String getSuit() {
    return mSuit;
  }

  public String getValue() {
    return mValue;
  }

  public String getName() {
    return mValue + " of " + mSuit;
  }
}
