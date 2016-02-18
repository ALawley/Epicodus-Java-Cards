import java.util.ArrayList;

public class Deck {
  private static final String[] SUITS = {"Spades", "Clubs", "Hearts", "Diamonds"};
  private static final String[] VALUES = {
    "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
  };
  private ArrayList<Card> mCards;

  public Deck() {
    mCards = new ArrayList<Card>();
  }

  public ArrayList<Card> getCards() {
    return mCards;
  }
}
