// Write a program to show Streams basics in java.

import java.util.*;
import java.util.stream.*;

class Program11 {
  public static void main(String args[]) {
    // list of integers Creation
    List<Integer> number = Arrays.asList(3, 1, 7, 2);
    // map method
    List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
    System.out.println(square);
    // System.out.println('\n');

    // list of String creation
    List<String> names = Arrays.asList("Area", "of", "circle");
    // Use of filter method
    List<String> result = names.stream()
                              .filter(s -> s.startsWith("c"))
                              .collect(Collectors.toList());
    System.out.println(result);
    // System.out.println('\n');
    
    // Use of sorted method
    List<String> show = names.stream().sorted().collect(Collectors.toList());
    System.out.println(show);
    // System.out.println('\n');
    // list of integers creation
    List<Integer> numbers = Arrays.asList(4, 3, 7, 1, 2);

    // System.out.println('\n');
    // Use of forEach method
    number.stream().map(x -> x * x).forEach(y -> System.out.println(y));
    // System.out.println('\n');
    // Use of reduce method
    int odd = number.stream()
                  .filter(x -> x % 2 == 1)
                  .reduce(0, (total, k) -> total + k);
    System.out.println("Total of odd values is: " + odd);
  }
}