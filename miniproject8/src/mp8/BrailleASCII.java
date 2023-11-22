package mp8;

/**
 * Author: Livia Stein Freitas
 * 
 * A main class that takes two command-line parameters, the first of which represents the target
 * character set and the second of which represents the source characters, and translates the text.
 */
public class BrailleASCII {

  public static void main(String[] args) throws Exception {
    if (args.length != 2) {
      System.err.println("There should be exactly two inputs. Please try again.");
      System.exit(0);
    } else if ((!args[0].equals("unicode")) && (!args[0].equals("ascii"))
        && (!args[0].equals("braille"))) {
      System.err.println("Second argument should be: ascii, braille, or unicode (all lowercase).");
      System.exit(0);
    } // else if
    if (args[0].equals("braille")) {
      String input = args[1];
      String output = "";
      for (int i = 0; i < input.length(); i++) {
        output.concat(BrailleASCIITables.toBraille(input.charAt(i)));
      }
      System.out.println(output);
    } else if (args[0].equals("ascii")) {
      String input = args[1];
      String output = "";
      for (int i = 0; i < input.length(); i++) { //!!!!!!!!!!!! there should be another for loop that substrings the input string into input.length() chunks
        output.concat(BrailleASCIITables.toASCII(input));
      }
      System.out.println(output);
    } else if (args[0].equals("unicode")) {
      String input = args[1];
      String output = "";
      for (int i = 0; i < input.length(); i++) {
        output.concat(BrailleASCIITables.toUnicode(input));
      }
      System.out.println(output);
    } // else if
  }
}
