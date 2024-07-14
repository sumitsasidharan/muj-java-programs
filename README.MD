### Program 1: Write a Program whether number entered is palindrome or not. 

```java
import java.util.Scanner;
import java.util.*;    

public class Main {
    
	    public static void main(String[] args) {
		       //Write code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
        
        while(originalNumber != 0) {
            int remainder = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            originalNumber /= 10;
        }
        
        if(number == reversedNumber) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
                
        scanner.close();
    }
	
}
```


### Program 2: Write a Program whether number entered is armstrong or not. 

Examples of Armstrong numbers include 370, 371, 407, 1634, 8208, and 9474.

```java
import java.util.Scanner;
public class Main {
    // write your code here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        if(isArmstrong(number)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
        
        scanner.close();
    }

    // Function to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0;
        originalNumber = number;
        
        // Count number of digits
        int n = String.valueOf(number).length();
        
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }
        
        return result == number;
    }
}
```



### Program 3: Write a Program to print all even from 1 to N using for loop. 

```java
import java.util.Scanner;

public class Main {
    	
    public static void main(String[] args) {
		  //wite code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // printing all even numbers from 1 to N using 'for' Loop
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
        
        scanner.close();
    }
}
```


### Program 4: Write a Java Program to find largest element in an array

```java
import java.util.Scanner;
public class Main {
    
	public static void main(String[] args) {
		  
        Scanner scanner = new Scanner(System.in);
        
        // Input size of the array
        // int n = scanner.nextInt();
        int n = 5;
        
        // Input elements of the array
        int[] arr = new int[n];
        // System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Find the largest element
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        // Print the largest element
        System.out.println(largest);
        
        scanner.close();
    }
    
}
```


### Program 5: Write a Program to print Fibonacci number between 1 to N. 

```java
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
		  // write code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // Print the first N numbers
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i));
        }        
        
        scanner.close();
    }

     // Function to print the fibonacci series
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }
}
```