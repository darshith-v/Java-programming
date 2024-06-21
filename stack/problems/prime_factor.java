package stack.problems;

public class prime_factor {
  static int max = 5;

  static int first = -1;
  static int stack_arr[] = new int[max];
  public static void main(String[] args) {
    push(10);
  }
  
  static void push(int data) {
    first += 1;
    stack_arr[first] = data;
    
  }
}
