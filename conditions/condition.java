package conditions;

public class condition {
  /*
  static void myFunction() {
    System.out.println("Hello world");
  }
   
  
  static int myFunction(int a) {
    return a + 7;
  }
  static int myFunction(int x, int y) {
    return x + y;
  }
  */

  static void checkMyAge(int age) {

    if (age > 18){
      System.out.println("you are an adult");
    } else {
      System.out.println("You are not adult");
    }
    
  }


  public static void main(String[] args) {
    // myFunction();
    // System.out.println(myFunction(8));
    // int result = myFunction(9, 10);
    // System.out.println(result);
    checkMyAge(20);
  }
}