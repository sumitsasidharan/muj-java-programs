class A
{
    public void Method1 (String str1) {
        System.out.println(str1);
    }
}

class B
{
    public void Method2(String str1) {
        System.out.println(str1);
    }
}

public class Main
{
    public static void main (String arg[]) {
        String str = "Manipal University, Jaipur";

        // Creating an instance of class A
        A objA = new A();
        objA.Method1(str);

        System.out.println("=======================");

        B objB = new B();
        String strB = "Good";
        objB.Method2(strB);
    }
}