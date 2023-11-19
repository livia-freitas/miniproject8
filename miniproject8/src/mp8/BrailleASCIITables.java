package mp8;

import mp4_redo.AssociativeArray;

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

  protected static AssociativeArray<Integer,Integer> createASCIITable(){ //should this be a field?
    AssociativeArray<Integer,Integer> a2b = new AssociativeArray<>();

    //UPPERCASE LETTERS
    a2b.set(01000001,100000);
    a2b.set(01000010,110000);
    a2b.set(01000011,100100);
    a2b.set(01000100,100110);
    a2b.set(01000101,100010);
    a2b.set(01000110,110100);
    a2b.set(01000111,110110);
    a2b.set(01001000,110010);
    a2b.set(01001001,010100);
    a2b.set(01001010,010110);
    a2b.set(01001011,101000);
    a2b.set(01001100,111000);
    a2b.set(01001101,101100);
    a2b.set(01001110,101110);
    a2b.set(01001111,101010);
    a2b.set(01010000,111100);
    a2b.set(01010001,111110);
    a2b.set(01010010,111010);
    a2b.set(01010011,011100);
    a2b.set(01010100,011110);
    a2b.set(01010101,101001);
    a2b.set(01010110,111001);
    a2b.set(01010111,010111);
    a2b.set(01011000,101101);
    a2b.set(01011001,101111);
    a2b.set(01011010,101011);

    //LOWERCASE LETTERS
    a2b.set(01100001,100000);
    a2b.set(01100010,110000);
    a2b.set(01100011,100100);
    a2b.set(01100100,100110);
    a2b.set(01100101,100010);
    a2b.set(01100110,110100);
    a2b.set(01100111,110110);
    a2b.set(01101000,110010);
    a2b.set(01101001,010100);
    a2b.set(01101010,010110);
    a2b.set(01101011,101000);
    a2b.set(01101100,111000);
    a2b.set(01101101,101100);
    a2b.set(01101110,101110);
    a2b.set(01101111,101010);
    a2b.set(01110000,111100);
    a2b.set(01110001,111110);
    a2b.set(01110010,111010);
    a2b.set(01110011,011100);
    a2b.set(01110100,011110);
    a2b.set(01110101,101001);
    a2b.set(01110110,111001);
    a2b.set(01110111,010111);
    a2b.set(01111000,101101);
    a2b.set(01111001,101111);
    a2b.set(01111010,101011);

    //WHITESPACE
    a2b.set(00100000,000000);
    
    return a2b;

  }

  protected static void createBrailleTable(){

  }
}