package stack.problems;

public class final_code {
  static int max = 5;
  static int stack_arr[] = new int[max];
  static int first = -1;

  public static void main(String[] args) {
    push(33);
    push(66);
    push(69);
    push(99);
    push(90);
    pop();
    print();
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

}
