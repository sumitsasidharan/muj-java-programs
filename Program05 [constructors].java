// Constructors
public class Program5 {
  int a; // Create a class attribute
  // Create a class constructor for the Program5 class
  public Program5() {
    a = 100; // Set the initial value for the class attribute a
  }
  public static void main(String[] args) {
    Program5 obj1 = new Program5(); // Create an object of class Program5 (This
                                    // will call the constructor)

    System.out.println(obj1.a); // Print the value of a
    System.out.println("--------------------------------");
    Program5 obj2 = new Program5(25);
    System.out.println(obj2.a); // Print the value of a
    System.out.println("--------------------------------");
    Program5 obj3 = new Program5(112233, "Dishaan");
    System.out.println("RollNumber"
        + " "
        + "Name");
    System.out.println(obj3.RollNumber + " " + obj3.Name);
    System.out.println("--------------------------------");
  }
  // Constructor Parameters
  public Program5(int y) {
    a = y + 1;
  }

  // Constructor Parameters
  int RollNumber;
  String Name;
  public Program5(int value, String name) {
    RollNumber = value;
    Name = name;
  }
}