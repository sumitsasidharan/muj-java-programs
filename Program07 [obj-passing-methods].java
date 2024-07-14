// Java Program for objects passing to methods.
// Creating a Class
class ObjectPass {
  int a, b;
  // Constructor
  ObjectPass(int i, int j) {
    a = i;
    b = j;
  }
  
  boolean equalTo(ObjectPass obj) // Method
  {
    // Returns true if obj is equal to the invoking object, an object is passed
    // as an argument to method
    return (obj.a == a && obj.b == b);
  }
}

// Main class
public class Program7 {
  public static void main(String args[]) {
    // Creating object
    ObjectPass obj1 = new ObjectPass(11, 22);
    ObjectPass obj2 = new ObjectPass(11, 22);
    ObjectPass obj3 = new ObjectPass(11, 12);

    // Checking whether object are equal with different values or not
    System.out.println(
        "obj1 == obj2 " + obj1.equalTo(obj2)); // print boolean value as result
    System.out.println(
        "obj1 == obj3 " + obj1.equalTo(obj3)); // print boolean value as result
  }
}