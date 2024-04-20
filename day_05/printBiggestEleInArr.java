package day_05;

import java.util.Scanner;

public class printBiggestEleInArr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array: ");
    int arr[] = new int[sc.nextInt()];
    int Big = 0;

    System.out.println("Enter the elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] > Big) {
        Big = arr[i];
      }
    }
    System.out.println("The Biggest number of array is: " + Big);

  }
}
