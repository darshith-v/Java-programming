package stack.problems;

// write a program for implement a stack in an array stack_arr[] using  stack_arr[0] as the top element

public class delete_element {

  static int stack_arr[] = new int[4];
  static int first = -1;

  public static void main(String[] args) {
    push(30);
    push(90);
    push(120);
    push(150);
    pop();
    print();
  }
  
  static void push(int data) {
    first += 1;
    for (int i = first; i > 0; i--)
      stack_arr[i] = stack_arr[i - 1];
    stack_arr[0] = data;
  }

  static int pop() {
    int value;
    value = stack_arr[0];
    for (int i = 0; i < first; i++)
      stack_arr[i] = stack_arr[i + 1];
    first -= 1;
    return value;
  }
  
  static void print() {
    if (first == -1) {
      System.out.println("stack overflowed");
    }
    for (int i = 0; i <= first; i++) {
      System.out.println(stack_arr[i]);
    }
  }
}
