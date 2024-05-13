package stack;

import java.util.*;

public class isFull_isEmpty {
  static int max = 4;
  static int top = -1;
  static int arr[] = new int[max];

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int choices, data;
    while (true) {
      System.out.println("1. Push");
      System.out.println("2. Pop");
      System.out.println("3. Print the top element");
      System.out.println("4. Print all the element of stack");
      System.out.println("5. Quit");
      System.out.println("\n");
      System.out.println("Please enter your choices: ");
      choices = sc.nextInt();

      switch (choices) {
        case 1:
          System.out.println("Enter the value to be pushed: ");
          data = sc.nextInt();
          push(data);
          break;

        case 2:
          data = pop();
          System.out.println("Deleted element is: " + data);
          System.out.println("\n");
          break;

        default:
          break;
      }
    }
  }
  
  public static boolean isFull() {
    if (top == max - 1)
      return true;
    else
      return false;
  }
  
  public static boolean isEmpty() {
    if(top == -1)
      return true;
    else
      return false;  
  }

  public static void push(int data) {
    if (isFull()) {
      System.out.println("stack overflow");
      return;
    }
    top = top + 1;
    arr[top] = data;
    // System.out.println(Arrays.toString(arr));
  }

  public static int pop() {
    int value;

    if (isEmpty()) {
      System.out.println("Stack Overflowed !");
      System.exit(0);
    }
    value = arr[top];
    top = top - 1;
    return value;
  }

  public static void print() {
    if (top == -1) {
      System.out.println("Stack overflow.");
      return;
    }

    for (int i = top; i >= 0; i--) {
      System.out.println(arr[i]);
    }
  }
}
