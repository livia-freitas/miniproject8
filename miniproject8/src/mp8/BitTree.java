package mp8;

import java.io.InputStream;
import java.io.PrintWriter;

/**
 * Author: Livia Stein Freitas
 * Documentation inspired by Samuel Rebelsky's project instructions.
 * 
 * Stores mappings from bits to values. Implements a constructor, set(), get(), dump(), and load().
 */
public class BitTree{

  /**
   *  Builds a tree that will store mappings from strings of n bits to strings. 
   *  ->  Tree for mapping braille to ASCII: new BitTree(6). 
   *  ->  Tree for mapping ASCII to braille: new BitTree(7) or new BitTree(8).
   * @param n
   */
  protected BitTree(int n){

  }
  /**
   * Follows the path through the tree given by bits (adding nodes as appropriate) and adds or replaces the value at the end with value. 
   * Set should throw an exception if bits is the inappropriate length or contains values other than 0 or 1.
   * @param bits
   * @param value
   */
  protected void set(String bits, String value){

  }
/**
 * Follows the path through the tree given by bits,
   returning the value at the end. If there is no such path, or if bits is the incorrect length, get should throw an exception.
 */
  protected String get(String bits){
    //STUB
    return new String();
  } 

  /**
   * Prints out the contents of the tree in CSV format. For example, one row of our braille tree will be “101100,M”
   * @param pen
   */
  protected void dump(PrintWriter pen){

  }

  /**
   * Reads a series of lines of the form bits,value and stores them in the tree.
   * @param source
   */
  protected void load(InputStream source){

  }

  class BitTreeNode{

  }

  class BitTreeLeaf{
    
  }
}
