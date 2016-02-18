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

}
