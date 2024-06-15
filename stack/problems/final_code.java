package stack.problems;

import java.util.*;

public class final_code {
  static int max = 5;
  static int stack_arr[] = new int[max];
  static int first = -1;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int choice, data;
    while (true) {
      System.out.println("1. Push");
      System.out.println("2. Pop");
      System.out.println("3. Print the top element: ");
      System.out.println("4. Print the top element: ");
      System.out.println("5. Quit");
      System.out.println("6. Please enter your choices: ");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Enter the element to be pushed : ");
          data = sc.nextInt();
          push(data);
          break;

        case 2:
          data = pop();
          System.out.println("Deleted element is " + data);
          break;

        case 3:
          System.out.println("The topmost element of the stack" + peek());
          break;

        case 4:
          print();
          break;

        case 5:
          System.exit(1);

        default:
          System.out.println("wrong choice");

      }
    }
    
  }
  
  static void push(int data) {
    if (isFull()) {
      System.out.println("Stack Overflowed");
    }
    first += 1;
    for (int i = first; i > 0; i--)
      stack_arr[i] = stack_arr[i - 1];

    stack_arr[0] = data;
  }
  
  static int pop() {
    if (isEmpty()) {
      System.out.println("Stack Empty");
      System.exit(0);

    }
    int i, value;
    value = stack_arr[0];
    for (i = 0; i < first; i++)
      stack_arr[i] = stack_arr[i + 1];
    first -= 1;
    return value;
  }

  static void print() {
    if (isEmpty()) {
      System.out.println("stack Empty");
      System.exit(0);
    }
    for (int i = 0; i <= first; i++) {
      System.out.println(stack_arr[i]);
    }
  }

  static Boolean isEmpty() {
    if (first == -1) 
      return true;
    else 
      return false;
  }
  
  static Boolean isFull() {
    if (first == max - 1)
      return true;
    else
      return false;
  }

  static int peek(){
    if(isEmpty()){
      System.out.println("Sytem underflow\n");
      System.exit(0);
    }
    return stack_arr[0];
  }

}
