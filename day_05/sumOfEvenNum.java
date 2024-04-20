package day_05;

import java.util.Scanner;

public class sumOfEvenNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of Array");
    int arr[] = new int[sc.nextInt()];
    int sum = 0;

    System.out.println("Enter elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] % 2 == 0)
        sum = sum + arr[i];
      
    }

    System.out.println("Sum of the Array is: " + sum);
  }
}
