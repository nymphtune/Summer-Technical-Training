package RecursionPatternsArrays;

import java.util.*;

public class One {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the number of elements in the array: ");
          int n = sc.nextInt();

          int[] arr = new int[n];
          System.out.println("Enter the elements of the array:");
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }

          System.out.print("Enter the element to be found: ");
          int num = sc.nextInt();

          int lastIndex = lastIndex(arr, num);
          System.out.println("Last Index: " + lastIndex);

          sc.close();
     }

     public static int lastIndex(int[] arr, int num) {
          return searchLastIndex(arr, num, arr.length - 1);
     }

     private static int searchLastIndex(int[] arr, int num, int index) {
          if (index < 0) {
               return -1;
          }
          if (arr[index] == num) {
               return index;
          }

          return searchLastIndex(arr, num, index - 1);
     }
}
