package mp8;

import java.io.File;
import java.io.FileInputStream;

/**
 * Author: Livia Stein Freitas
 * 
 * Provides three static conversion methods: toBraille(char letter), toASCII(String bits), and
 * toUnicode(String bits).
 */
public class BrailleASCIITables {

  /**
   * Converts an ASCII character to a string of bits representing the corresponding braille
   * character.
   * 
   * @param letter
   * @return
   */
  public static String toBraille(char letter) throws Exception {
    // load asciiTree into the tree
    File ASCIItoBraille = new File("./ASCIIToBraille.txt");
    FileInputStream a2b = new FileInputStream(ASCIItoBraille);
    BitTree ASCIITree = new BitTree(8);
    ASCIITree.load(a2b);
    //convert letter into binary the get() its corresponding value
    int binary = Character.getNumericValue(letter); // this is SO WEIRD aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
    String strBinary = Integer.toString(binary);
    System.out.println(strBinary);
    String result = ASCIITree.get(strBinary);
    return result;
  }

  /**
   * Converts a string of bits representing a braille character to the corresponding ASCII
   * character.
   * 
   * @param bits
   * @return
   */
  public static String toASCII(String bits) throws Exception {
    // load the braille tree
    File brailleToASCII = new File("brailleToASCII.txt");
    FileInputStream b2a = new FileInputStream(brailleToASCII);
    BitTree brailleTree = new BitTree(6);
    brailleTree.load(b2a);
    // get() the value that corresponds with bits
    String result = brailleTree.get(bits);
    return result;
  }

  /**
   * Converts a string of bits representing a braille character to the corresponding Unicode braille
   * character for those bits. Supports up to six bits.
   * 
   * @param bits
   * @return
   */
  public static String toUnicode(String bits) throws Exception {
    // load the braille tree
    File brailleToUnicode = new File("brailleToUnicode.txt");
    FileInputStream b2u = new FileInputStream(brailleToUnicode);
    BitTree brailleTree = new BitTree(6);
    brailleTree.load(b2u);
    // get() value that corresponds with bits
    String result = brailleTree.get(bits);
    return result;
  }

}
