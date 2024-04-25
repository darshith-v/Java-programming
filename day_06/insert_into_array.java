package day_06;

import java.util.*;


public class insert_into_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 6, 7, 8, 9, 10 };

        int newArray[] = new int[arr1.length + arr2.length];

        System.out.println("Enter the position: ");
        int pos = sc.nextInt();

        for (int i = 0; i < pos; i++) {
            newArray[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArray[pos + i] = arr2[i];
        }

        for (int i = pos; i < arr1.length; i++) {
            newArray[arr2.length + i] = arr1[i];
        }

        for (int num : newArray) {
            System.out.print(num+" ");
        }
    }
}