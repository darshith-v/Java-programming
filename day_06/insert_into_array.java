package day_06;

import java.util.Scanner;

/**
 * insert_into_array
 */
public class insert_into_array {

  public static void main(String[] args) {
    int n = 6;
    int arr[] = new int[n];
    int arr1[] = new int[1];

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter element to insert: ");
    int ele = sc.nextInt();

    System.out.println("Enter Location to insert: ");
    int loc = sc.nextInt();

    for (int i = n - 1; i >= loc; i--) {
      arr[i + 1] = arr[i];
    }

    for (int i = n; i < n; i++) {
      arr[loc + i] = arr1[i];
    }

    arr[loc] = ele;
    System.out.println(ele);
  }
}