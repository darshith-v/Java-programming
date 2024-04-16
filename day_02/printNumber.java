package day_02;

public class printNumber {
  public static void main(String[] args) {
    int x = 0, y = 0;
    while (++x <= 5) {  // ++x pre increment x , x++ post increment
      while (++y <= 5) {         // ++y pre increment y, y++ post increment
        System.out.println(y);
      }
      System.out.println(y);
    }
  }
}
