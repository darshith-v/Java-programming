package day_04;

import java.util.*;

public class multipleTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    printTable(sc.nextInt());
  }

  public static void printTable(int n) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(n * i);
    }
  }
}