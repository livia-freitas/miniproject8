package mp8;

/**
 * Author: Livia Stein Freitas
 * 
 * Provides three static conversion methods: toBraille(char letter), toASCII(String bits), and toUnicode(String bits).
 */
public class BrailleASCIITables {

  /**
   * Converts an ASCII character to a string of bits representing the corresponding braille character.
   * @param letter
   * @return
   */
  protected static String toBraille(char letter){
    //STUB: : create a BitTree that represents an ASCII character as a bit (can we use a hashtable to do that?). 
    //Traverse it bits.length() times using a for loop.
    // Append an empty string each time you traverse it.
    return new String();
  }

  /**
   * Converts a string of bits representing a braille character to the corresponding ASCII character.
   * @param bits
   * @return
   */
  protected static String toASCII(String bits){
    //STUB: create a BitTree that represents the alphabet (or just create nodes as needed?). 
    //Traverse it bits.length() times using a for loop. Return a character (as a string).
    return new String();
  }

  /**
   * Converts a string of bits representing a braille character to the corresponding Unicode braille character for those bits. Supports up to six bits.
   * @param bits
   * @return
   */
  protected static String toUnicode(String bits){
    //STUB 
    return new String();
  }

  protected static void createASCIITree(){

  }

  protected static void createBrailleTree(){

  }
}