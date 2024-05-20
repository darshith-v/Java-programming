package stack;

public class problem_1 {
  
  static int MAX = 5;

  static int stack_arr[] = new int[MAX];
  static int first = -1;

  public static void main(String[] args) {
    push(10);
    push(20);
    push(30);
    print();
  }

  static void push(int data) {
    int i = 0;
    first += 1;
    for (i = first; i > 0; i--) {
      stack_arr[i] = stack_arr[i - 1];
    }
    stack_arr[0] = data;
  }
  
  static void print() {
    if (first == -1) {
      System.out.println("Stackover loaded");
      System.exit(1);
    }
    
    for (int i = 0; i <= first; i++) {
      System.out.println(stack_arr[i]);
    }
  }
}
