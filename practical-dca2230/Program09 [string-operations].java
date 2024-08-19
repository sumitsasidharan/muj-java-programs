public class Program9 {
  public static void main(String[] args) {
    String str = "Manipal University, Jaipur";
    int len = str.length();

    System.out.println("The length of the txt string is: " + len);
    System.out.println("--------------------------------------------");
    System.out.println(str.toUpperCase());
    System.out.println("--------------------------------------------");
    System.out.println(str.toLowerCase());
    System.out.println("--------------------------------------------");

    System.out.println(str.indexOf("U"));
    System.out.println("--------------------------------------------");
    String Name1 = "Jaipur";
    String Name2 = "University";
    System.out.println(Name1 + " " + Name2);
    System.out.println("--------------------------------------------");
    System.out.println(Name1.concat(Name2));
    System.out.println("--------------------------------------------");

    String str1 = " Manipal University, Jaipur ";
    str1 = str1.trim();
    System.out.println(str1);
    System.out.println("--------------------------------------------");

    String str2 = "It is car";
    String replace =
        str2.replace('c', 'j'); // replaces all occurrences of 'c' to 'j'
    System.out.println(replace);
    System.out.println("--------------------------------------------");
    replace = str2.replace(
        "car", "good"); // replaces all occurrences of "car" to "good"
    System.out.println(replace);
    System.out.println("--------------------------------------------");

    String s1 = "Car";
    String s2 = "Car";
    String s3 = new String("Good");
    String s4 = "Jar";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
    System.out.println("--------------------------------------------");

    s1 = "CAR";
    s2 = "car";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println("--------------------------------------------");

    str = "Manipal University, Jaipur";
    int index = str.indexOf('p');
    System.out.println("Index of the letter p : " + index);
    int firstIndex = str.indexOf("Uni");
    System.out.println("First occurrence of char U"
        + " is found at : " + firstIndex);
  }
}