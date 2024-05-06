package day_07;

import java.util.*;

public class marge_two_array{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    int b[] = new int[4];

    int arr[] = new int[a.length + b.length];

    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
      arr[i] = a[i];
    }

    for (int i = 0; i < b.length; i++) {
      b[i] = sc.nextInt();
      arr[i + a.length] = b[i];
    }
    
    System.out.println(Arrays.toString(arr));
    
  }
}