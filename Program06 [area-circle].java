// Program To find area of a circle using Default and Parameterized Constructor
class Program6 {
  double area, r, pi;
  
  Program6() // Default Constructor
  {
    r = 2;
  }
  
  Program6(double R) // Parameterized Constructor
  {
    r = R;
  }

  void area() // Area calculation
  {
    pi = 3.14;
    area = pi * r * r;
    System.out.println("" + area);
  }
  
  public static void main(String args[]) {
    Program6 r1 = new Program6(); // Default Constructor Is Called
    Program6 r2 = new Program6(4); // Parameterized Constructor
    
    System.out.println("Area of rectangle with default constructor is:");
    r1.area();
    
    System.out.println("Area of rectangle with parameterized constructor is:");
    r2.area();
  }
}