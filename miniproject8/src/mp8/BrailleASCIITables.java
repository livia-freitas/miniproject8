package mp8;

import mp4_redo.AssociativeArray;

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
  protected static String toBraille(char letter) {
    // STUB: : create a BitTree that represents an ASCII character as a bit (can we use a hashtable
    // to do that?).
    // Traverse it bits.length() times using a for loop.
    // Append an empty string each time you traverse it.
    return new String();
  }

  /**
   * Converts a string of bits representing a braille character to the corresponding ASCII
   * character.
   * 
   * @param bits
   * @return
   */
  protected static String toASCII(String bits) {
    // STUB: create a BitTree that represents the alphabet (or just create nodes as needed?).
    // Traverse it bits.length() times using a for loop. Return a character (as a string).
    return new String();
  }

  /**
   * Converts a string of bits representing a braille character to the corresponding Unicode braille
   * character for those bits. Supports up to six bits.
   * 
   * @param bits
   * @return
   */
  protected static String toUnicode(String bits) {
    // STUB
    return new String();
  }

  protected static AssociativeArray<String, String> createASCIITable() { // should this be a
                                                                         // field?
    AssociativeArray<String, String> a2b = new AssociativeArray<>();

    // UPPERCASE LETTERS
    a2b.set("01000001", "100000");
    a2b.set("01000010", "110000");
    a2b.set("01000011", "100100");
    a2b.set("01000100", "100110");
    a2b.set("01000101", "100010");
    a2b.set("01000110", "110100");
    a2b.set("01000111", "110110");
    a2b.set("01001000", "110010");
    a2b.set("01001001", "010100");
    a2b.set("01001010", "010110");
    a2b.set("01001011", "101000");
    a2b.set("01001100", "111000");
    a2b.set("01001101", "101100");
    a2b.set("01001110", "101110");
    a2b.set("01001111", "101010");
    a2b.set("01010000", "111100");
    a2b.set("01010001", "111110");
    a2b.set("01010010", "111010");
    a2b.set("01010011", "011100");
    a2b.set("01010100", "011110");
    a2b.set("01010101", "101001");
    a2b.set("01010110", "111001");
    a2b.set("01010111", "010111");
    a2b.set("01011000", "101101");
    a2b.set("01011001", "101111");
    a2b.set("01011010", "101011");

    // LOWERCASE LETTERS
    a2b.set("01100001", "100000");
    a2b.set("01100010", "110000");
    a2b.set("01100011", "100100");
    a2b.set("01100100", "100110");
    a2b.set("01100101", "100010");
    a2b.set("01100110", "110100");
    a2b.set("01100111", "110110");
    a2b.set("01101000", "110010");
    a2b.set("01101001", "010100");
    a2b.set("01101010", "010110");
    a2b.set("01101011", "101000");
    a2b.set("01101100", "111000");
    a2b.set("01101101", "101100");
    a2b.set("01101110", "101110");
    a2b.set("01101111", "101010");
    a2b.set("01110000", "111100");
    a2b.set("01110001", "111110");
    a2b.set("01110010", "111010");
    a2b.set("01110011", "011100");
    a2b.set("01110100", "011110");
    a2b.set("01110101", "101001");
    a2b.set("01110110", "111001");
    a2b.set("01110111", "010111");
    a2b.set("01111000", "101101");
    a2b.set("01111001", "101111");
    a2b.set("01111010", "101011");

    // WHITESPACE
    a2b.set("00100000", "000000");

    return a2b;

  }

  protected static AssociativeArray<String, String> createBrailletoAsCIITable() {

    AssociativeArray<String, String> b2a = new AssociativeArray<>();

    b2a.set("100000", "A");
    b2a.set("110000", "B");
    b2a.set("100100", "C");
    b2a.set("100110", "D");
    b2a.set("100010", "E");
    b2a.set("110100", "F");
    b2a.set("110110", "G");
    b2a.set("110010", "H");
    b2a.set("010100", "I");
    b2a.set("010110", "J");
    b2a.set("101000", "K");
    b2a.set("111000", "L");
    b2a.set("101100", "M");
    b2a.set("101110", "N");
    b2a.set("101010", "O");
    b2a.set("111100", "P");
    b2a.set("111110", "Q");
    b2a.set("111010", "R");
    b2a.set("011100", "S");
    b2a.set("011110", "T");
    b2a.set("101001", "U");
    b2a.set("111001", "V");
    b2a.set("101101", "X");
    b2a.set("101111", "Y");
    b2a.set("101011", "Z");
    b2a.set("010111", "W");
    b2a.set("000000", " ");

    return b2a;
  }

  protected static AssociativeArray<String, String> createBrailletoUnicodeTable() {

    AssociativeArray<String, String> b2u = new AssociativeArray<>();

    b2u.set("000000", "2800");
    b2u.set("100000", "2801");
    b2u.set("010000", "2802");
    b2u.set("110000", "2803");
    b2u.set("001000", "2804");
    b2u.set("101000", "2805");
    b2u.set("011000", "2806");
    b2u.set("111000", "2807");
    b2u.set("000100", "2808");
    b2u.set("100100", "2809");
    b2u.set("010100", "280A");
    b2u.set("110100", "280B");
    b2u.set("001100", "280C");
    b2u.set("101100", "280D");
    b2u.set("011100", "280E");
    b2u.set("111100", "280F");
    b2u.set("000010", "2810");
    b2u.set("100010", "2811");
    b2u.set("010010", "2812");
    b2u.set("110010", "2813");
    b2u.set("001010", "2814");
    b2u.set("101010", "2815");
    b2u.set("011010", "2816");
    b2u.set("111010", "2817");
    b2u.set("000110", "2818");
    b2u.set("100110", "2819");
    b2u.set("010110", "281A");
    b2u.set("110110", "281B");
    b2u.set("001110", "281C");
    b2u.set("101110", "281D");
    b2u.set("011110", "281E");
    b2u.set("111110", "281F");
    b2u.set("000001", "2820");
    b2u.set("100001", "2821");
    b2u.set("010001", "2822");
    b2u.set("110001", "2823");
    b2u.set("001001", "2824");
    b2u.set("101001", "2825");
    b2u.set("011001", "2826");
    b2u.set("111001", "2827");
    b2u.set("000101", "2828");
    b2u.set("100101", "2829");
    b2u.set("010101", "282A");
    b2u.set("110101", "282B");
    b2u.set("001101", "282C");
    b2u.set("101101", "282D");
    b2u.set("011101", "282E");
    b2u.set("111101", "282F");
    b2u.set("000011", "2830");
    b2u.set("100011", "2831");
    b2u.set("010011", "2832");
    b2u.set("110011", "2833");
    b2u.set("001011", "2834");
    b2u.set("101011", "2835");
    b2u.set("011011", "2836");
    b2u.set("111011", "2837");
    b2u.set("000111", "2838");
    b2u.set("100111", "2839");
    b2u.set("010111", "283A");
    b2u.set("110111", "283B");
    b2u.set("001111", "283C");
    b2u.set("101111", "283D");
    b2u.set("011111", "283E");
    b2u.set("111111", "283F");
    return b2u;
  }
}
