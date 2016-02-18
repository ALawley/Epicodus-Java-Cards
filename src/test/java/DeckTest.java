import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class DeckTest {

  // @Rule
  // public ClearRule clearRule = new ClearRule();

  @Test
  public void instantiatesDeckCorrectly(){
    Deck testDeck = new Deck();
    assertEquals(true, testDeck instanceof Deck);
  }

  @Test
  public void getCards_initializesWithCardsList_true() {
    Deck testDeck = new Deck();
    assertEquals(true, testDeck.getCards() instanceof ArrayList);
  }

  @Test
  public void getCards_initalizesWith52Cards_52() {
    Deck testDeck = new Deck();
    assertEquals(52, testDeck.getCards().size());
  }

  @Test
  public void getCards_cardsAreInitalizedWithSuitsAndValues_AceOfSpades() {
    Deck testDeck = new Deck();
    Card aceOfSpades = testDeck.getCards().get(0);
    assertEquals("Ace of Spades", aceOfSpades.getName());
  }

  @Test
  public void getCards_deckContains52UniqueCards_kingOfDiamonds() {
    Deck testDeck = new Deck();
    Card kingOfDiamonds = testDeck.getCards().get(51);
    assertEquals("King of Diamonds", kingOfDiamonds.getName());
  }

  @Test
  public void shuffle_randomizesDeckOrder_false() {
    Deck testDeck = new Deck();
    testDeck.shuffle();
    Card kingOfDiamonds = testDeck.getCards().get(51);
    assertEquals(false, "King of Diamonds".equals(kingOfDiamonds.getName()));
  }

  @Test
  public void draw_drawsFirstCard_AceofSpades() {
    Deck testDeck = new Deck();
    ArrayList<Card> drawOne = testDeck.draw(1);
    assertEquals("Ace of Spades", drawOne.get(0).getName());
  }

  @Test
  public void draw_removesFirstCard_51() {
    Deck testDeck = new Deck();
    ArrayList<Card> drawOne = testDeck.draw(1);
    assertEquals(51, testDeck.getCards().size());
  }

  @Test
  public void draw_drawsSevenCards_7() {
    Deck testDeck = new Deck();
    ArrayList<Card> drawSeven = testDeck.draw(7);
    assertEquals(7, drawSeven.size());
  }
}
