package mp8;

import static org.junit.Assert.*;
import org.junit.Test;

public class BitTreeTests {

  BitTree brailleTree = new BitTree(6);
  BitTree ASCIITree = new BitTree(8);

  /* Checks that set() works for Braille->ASCII */
  @Test
  public void getASCIITest() throws Exception {
    brailleTree.set("100000", "A");
    assertEquals(brailleTree.get("100000"), "A");
  }

  /* Checks that set() works for ASCII->Braille */
  @Test
  public void getBrailleTest() throws Exception {
    ASCIITree.set("01000001", "100000");
    assertEquals(ASCIITree.get("01000001"), "100000");
  }
}
