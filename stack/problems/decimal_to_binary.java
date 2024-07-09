package stack.problems;

import java.util.*;

public class decimal_to_binary {

  static int first = -1;
  static int stacks[] = new int[100];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the decimal number: ");
    int number = sc.nextInt();
    dec2bin(number);
    display();
  }
  
  static void push(int data) {
    first = first + 1;
    stacks[first] = data;
  }

  static void dec2bin(int num) {
    while (num != 0) {
      push(num % 2);
      num = num / 2;
    }
  }

  static void display() {
    for (int i = first; i >= 0; i--) {
      System.out.print(stacks[i] + " ");
    }
    System.out.println();
  }
}
