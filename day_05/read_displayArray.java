package day_05;

import java.util.Scanner;

public class read_displayArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter the array size: ");

    int arr[] = new int[sc.nextInt()];
    System.out.println("Enter the array element: ");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    
    System.out.println("Elements are: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
