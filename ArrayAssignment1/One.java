/*Array Subtraction
i/p : arr_1[] = {9,8,7,5}, arr_2[] = {1,2,3,8}*/

package ArrayAssignment1;

import java.util.*;

public class One {
     public static int[] subtractArrays(int[] arr1, int[] arr2) {
          int[] result = new int[arr1.length];
          for (int i = 0; i < arr1.length; i++) {
               result[i] = arr1[i] - arr2[i];
          }
          return result;
     }

     public static void main(String[] args) {
          int[] arr1 = { 9, 8, 7, 5 };
          int[] arr2 = { 1, 2, 3, 8 };

          int[] subtractionResult = subtractArrays(arr1, arr2);
          System.out.println("Subtraction Result: " + Arrays.toString(subtractionResult));
     }
}
