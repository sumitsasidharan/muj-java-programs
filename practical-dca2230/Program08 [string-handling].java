// Write a program to show string handling (Character Extraction and String
// Comparison).
class Program8 {
  public static void main(String[] args) {
    String str = "With focus on holistic education";

    // Character Extraction
    char ch[] = new char[4];
    str.getChars(4, 7, ch, 0);
    System.out.println(ch);

    // string comparison

    String string1 = new String("With");
    String string2 = new String("focus");
    String string3 = new String("holistic");
    String string4 = new String("education");
    String string5 = new String("Education");

    // Comparing for String 1 != String 2
    System.out.println("Compare " + string1 + " and " + string2 + ":"
        + string1.equalsIgnoreCase(string2));
    // Compare for String 3 = String 4
    System.out.println("Compare " + string3 + " and " + string4 + ":"
        + string3.equalsIgnoreCase(string4));
    // Compare for String 4 = String 5
    System.out.println("Compare " + string4 + " and " + string5 + ":"
        + string4.equalsIgnoreCase(string5));
    // Compare for String 1 != String 4
    System.out.println("Compare " + string1 + " and " + string4 + ":"
        + string1.equalsIgnoreCase(string4));

    // Compare for String 4 != String 5
    System.out.println("Compare " + string4 + " and " + string5 + ":"
        + string1.equals(string4));
  }
}