package RecursionPatternsArrays;

import java.util.*;

public class Two {
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

          int[] ind = findI(arr, num);

          System.out.print("Indexes: [");
          for (int i = 0; i < ind.length; i++) {
               System.out.print(ind[i]);
               if (i < ind.length - 1) {
                    System.out.print(", ");
               }
          }
          System.out.println("]");

          sc.close();
     }

     public static int[] findI(int[] arr, int num) {
          List<Integer> ind = new ArrayList<>();
          findIndex(arr, num, 0, ind);

          int[] result = new int[ind.size()];
          for (int i = 0; i < ind.size(); i++) {
               result[i] = ind.get(i);
          }

          return result;
     }

     private static void findIndex(int[] arr, int num, int index, List<Integer> ind) {
          if (index >= arr.length) {
               return;
          }
          if (arr[index] == num) {
               ind.add(index);
          }
          findIndex(arr, num, index + 1, ind);
     }
}
