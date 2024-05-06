package stack;

import java.util.Arrays;

public class stack {

  static int max = 4;
  static int top = -1;
  static int arr[] = new int[max];

  public static void main(String[] args) {
    push(1);
    push(2);
    push(4);
    push(9);
  }

  static void push(int data) {
    if (top == max - 1) {
      System.out.println("stack overflow");
      return;
    }
    top = top + 1;
    arr[top] = data;
    System.out.println(Arrays.toString(arr));
  }
}
