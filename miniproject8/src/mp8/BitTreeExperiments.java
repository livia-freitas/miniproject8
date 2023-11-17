package mp8;

public class BitTreeExperiments {
  public static void main(String[] args) throws Exception {

    /* SET AND GET FOR BRAILLE TO ASCII */
    BitTree brailleTree = new BitTree(6);
    brailleTree.set("100000", "A");
    System.out.println(brailleTree.get("100000"));
    brailleTree.set("101011", "Z");
    System.out.println(brailleTree.get("101011"));

    /*SET AND GET FOR ASCII TO BRAILLE */
    BitTree ASCIITree = new BitTree(8);
    ASCIITree.set("01000001", "100000");
    System.out.println(ASCIITree.get("01000001"));
    ASCIITree.set("01111010", "101011");
    System.out.println(ASCIITree.get("01111010"));

    /* EDGE CASES */
  }
}
