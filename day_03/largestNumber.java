// find largest number without using array
package day_03;

import java.util.*;

public class largestNumber {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n, element;
    int large = 0;
    System.out.println("Enter the no of elements: ");

    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      element = sc.nextInt();
      if (element > large) {
        large = element;
      }
    }
    
    System.out.println(large + " is the largest number");
  }
}
