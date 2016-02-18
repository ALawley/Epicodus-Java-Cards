import org.junit.*;
import static org.junit.Assert.*;

public class CardTest {

  // @Rule
  // public ClearRule clearRule = new ClearRule();

  @Test
  public void instantiatesCardsCorrectly() {
    Card testCard = new Card("Ace", "Spades");
    assertEquals(true, testCard instanceof Card);
  }

  @Test
  public void getSuit_returnsSuit_spades() {
    Card testCard = new Card("Ace", "Spades");
    assertEquals("Spades", testCard.getSuit());
  }

  @Test
  public void getValue_returnsValue_Ace() {
    Card testCard = new Card("Ace", "Spades");
    assertEquals("Ace", testCard.getValue());
  }
}
