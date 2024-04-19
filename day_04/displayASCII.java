package day_04;

public class displayASCII {
  public static void main(String[] args) {
    for (int i = 0; i <= 255; i++) {
      // System.out.println("ASCII value of " + i + " is " + (char) i);
      System.out.printf("%d , %c \n " , i, (char)i);
    }
  }
  }
