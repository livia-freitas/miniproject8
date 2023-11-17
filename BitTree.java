package mp8;

import java.io.InputStream;
import java.io.PrintWriter;

/**
 * Author: Livia Stein Freitas Documentation inspired by Samuel Rebelsky's project instructions.
 * 
 * Stores mappings from bits to values. Implements a constructor, set(), get(), dump(), and load().
 */
public class BitTree {

  int size;
  BitTreeNode first;
  // comecar por aqui!!!!!!!!!

  /**
   * Builds a tree that will store mappings from strings of n bits to strings. -> Tree for mapping
   * braille to ASCII or Unicode: new BitTree(6). -> Tree for mapping ASCII to braille: new
   * BitTree(8).
   * 
   * @param n
   */
  protected BitTree(int n) {
    this.size = n;
    this.first = new BitTreeNode(-1);//the first node doesn't count.
  }// BitTree(int n)

  /**
   * Follows the path through the tree given by bits (adding nodes as appropriate) and adds or
   * replaces the value at the end with value. Set should throw an exception if bits is the
   * inappropriate length or contains values other than 0 or 1.
   * 
   * @param bits
   * @param value
   */
  protected void set(String bits, String value) throws Exception {

    if (bits.length() != 6) {
      throw new Exception("Bits' length should be 8."); // add a more specific exception
    } else {
      BitTreeNode current = this.first;
      for (int i = 0; i < this.size; i++) {
        if (bits.charAt(i) == 0) {//if bit is 0, go left
          current.left = new BitTreeNode(0);
          current = current.left;
        } else if (bits.charAt(i) == 1) {//if bit is 1, go right
          current.right = new BitTreeNode(1);
          current = current.right;
        } // else if
      } // for
      current.result = value;
    }
  }// set(String bits, String value)

  /**
   * Follows the path through the tree given by bits, returning the value at the end. If there is no
   * such path, or if bits is the incorrect length, get should throw an exception.
   */
  protected String get(String bits) throws Exception {
    // Add Exception!!!
    BitTreeNode current = this.first;
    for(int i = 0; i < this.size; i++){//checar se essas condicoes tao certas ou vai um Node alem do necessario
       if (bits.charAt(i) == 0) {//if bit is 0, go left
          current = current.left;
        } else if (bits.charAt(i) == 1) {//if bit is 1, go right
          current = current.right;
        } // else if
    }
    return current.result;
  }

  /**
   * Prints out the contents of the tree in CSV format. For example, one row of our braille tree
   * will be “101100,M”
   * 
   * @param pen
   */
  protected void dump(PrintWriter pen) {
    // confusa. pesquisar "how to dump the contents of a binary tree in Java" no youtube
  }

  /**
   * Reads a series of lines of the form bits,value and stores them in the tree.
   * 
   * @param source
   */
  protected void load(InputStream source) {
    // for loop pra ler todas linhas. parse uma linha por vez e set(bits,value) logo em seguida.

  }

  public class BitTreeNode { // if it's an inner class it should be able to use the BitTree methods
    BitTreeNode left;
    BitTreeNode right;
    int value;
    String result;

    public BitTreeNode(int bit) {
      this.left = null;
      this.right = null;
      this.value = bit;
      this.result = null;
    }
  }
}
