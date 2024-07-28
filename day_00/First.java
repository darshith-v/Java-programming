package day_00;

import java.util.*;

public class First {

  /*
  public static void printName(String name) {
    System.out.println(name);
    return;
  } 
   */
  public static int calculateSum(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    int result = calculateSum(a, b);
    System.out.println(result);
  }
}
