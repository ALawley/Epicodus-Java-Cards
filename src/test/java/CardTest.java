import org.junit.*;
import static org.junit.Assert.*;

public class CardTest {

  // @Rule
  // public ClearRule clearRule = new ClearRule();

  @Test
  public void instantiatesCardsCorrectly() {
    Card testCard = new Card();
    assertEquals(true, testCard instanceof Card);
  }
}
