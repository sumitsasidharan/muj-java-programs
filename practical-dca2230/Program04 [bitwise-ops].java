// Bitwise Operators
public class Program4 {
  public static void main(String[] args) {
    // Bitwise AND (&)
    int x = 4, y = 5; //
    System.out.println("x & y = " + (x & y));
    System.out.println("-------------------------------------");

    // Bitwise inclusive OR (|)
    System.out.println("x | y = " + (x | y)); // 100 | 101
    System.out.println("-------------------------------------");
    // Bitwise exclusive OR (^) = XOR
    System.out.println("x ^ y = " + (x ^ y));
    System.out.println("-------------------------------------");

    // Bitwise Complement (~)
    int c = 5;
    System.out.println("~c = " + (~c));
    System.out.println("-------------------------------------");

    // Bitwise Right Shift Operator >>
    int z = 25;
    System.out.println("Bitwise Right Shift Operator z>>3 = " + (z >> 3));

    System.out.println("-------------------------------------");
    // Bitwise Left Shift Operator <<
    z = 10;
    System.out.println("Bitwise Left Shift Operator z<<3 = " + (z << 3));
  }
}