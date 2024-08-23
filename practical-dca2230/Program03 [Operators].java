class Main {
  public static void main(String[] args) {
    // Java Arithmetic Operators
    // declare variables
    int a = 100, b = 10;
    // addition operator
    System.out.println("a + b = " + (a + b));
    // subtraction operator
    System.out.println("a - b = " + (a - b));
    // multiplication operator
    System.out.println("a * b = " + (a * b));

    // division operator
    System.out.println("a / b = " + (a / b));
    // modulo operator
    System.out.println("a % b = " + (a % b));
    // Assignment Operators
    // create variables
    int x = 4;
    int var;
    // assign value using =
    var = x;
    System.out.println("var using =: " + var);
    // assign value using =+
    var += x; // var = var+ x 8
    System.out.println("var using +=: " + var);

    // assign value using =*
    var *= x; // var = var*x 32
    System.out.println("var using *=: " + var);
    // Relational Operators
    // create variables
    int a1 = 7, b1 = 11;
    // value of a1 and b1
    System.out.println("a1 is " + a1 + " and b1 is " + b1);
    // == operator
    System.out.println(a1 == b1); // false
    // != operator
    System.out.println(a1 != b1); // true
    // > operator
    System.out.println(a1 > b1); // false

    // < operator
    System.out.println(a1 < b1); // true
    // >= operator
    System.out.println(a1 >= b1); // false
    // <= operator
    System.out.println(a1 <= b1); // true
    
    // Logical Operators
    // && operator
    System.out.println((5 > 3) && (8 > 5)); // true && AND
    System.out.println((5 > 3) && (8 < 5)); // false
    // || operator
    System.out.println((5 < 3) || (8 > 5)); // true || OR
    System.out.println((5 > 3) || (8 < 5)); // true
    System.out.println((5 < 3) || (8 < 5)); // false

    // ! operator
    System.out.println(!(5 == 3)); // !false= true
    System.out.println(!(5 > 3)); // !true =false
    
    // Unary Operators
    // declare variables
    int m = 12, n = 12;
    int result1, result2;
    // original value
    System.out.println("Value of m: " + m);
    // increment operator
    result1 = ++m;
    System.out.println("After increment: " + result1);
    System.out.println("Value of n: " + n);

    // decrement operator
    result2 = --n;
    System.out.println("After decrement: " + result2);
    
    // Ternary Operator
    int Z = 81;
    String result;
    // ternary operator
    result = (Z == 80) ? "Even" : "Odd";
    System.out.println(result);
  }
}