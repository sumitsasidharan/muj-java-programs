// Need to write inputs in 'Cmd Input'
public class Main
{
    public static void main (String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        
        int v1 = Integer.parseInt(args[0]);
        int v2 = Integer.parseInt(args[1]);
        
        // perform arithmetic operations
        int sum = v1 + v2;
        int difference = v1 - v2;
        
        System.out.println("Sum : " + sum);
        
        System.out.println("Difference : " + difference);
    }
}