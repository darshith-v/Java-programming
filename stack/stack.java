package stack;

public class stack {

  static int max = 4;
  static int top = -1;
  static int arr[] = new int[max];

  public static void main(String[] args) {
    push(1);
    push(2);
    push(4);
    push(9);
    pop();
    pop();
    print();
  }

  public static void push(int data) {
    if (top == max - 1) {
      System.out.println("stack overflow");
      return;
    }
    top = top + 1;
    arr[top] = data;
    // System.out.println(Arrays.toString(arr));
  }

  public static int pop() {
    int value;

    if (top == -1) {
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
