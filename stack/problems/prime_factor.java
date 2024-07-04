package stack.problems;

import java.util.Scanner;

public class prime_factor {
  static int max = 100;

  static int first = -1;
  static int stack_arr[] = new int[max];

  public static void main(String[] args) {
    System.out.println("Please enter the positive number");
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();
    prime_fac(number);
  }
  
  static void push(int data) {
    first += 1;
    stack_arr[first] = data;
  }
  
  static void prime_fac(int num) {
    int i = 2;
    while (i != 1) {
      while (num % i == 0) {
        push(i);
        num = num / i;
      }
      i++;
    }
    
  }
}
