// Write a program to show code reusability by using Inheritance.
class Business {
  float ItemCost = 500;
}

class Program10 extends Business {
  float Turnover = 100000;
  public static void main(String args[]) {
    Program10 o = new Program10();
    System.out.println("Cost of item is:" + o.ItemCost);
    System.out.println("Turnover is:" + o.Turnover);
  }
}
