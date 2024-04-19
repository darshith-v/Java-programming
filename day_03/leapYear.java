package day_03;

import java.util.*;

public class leapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    if((n % 400 == 0) || (n % 4 == 0) && (n % 100 != 0)){
      System.out.println("Its a leap year");
    } else {
      System.out.println("Its not a leap year");
    }
  } 
}
