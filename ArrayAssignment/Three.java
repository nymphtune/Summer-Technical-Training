package ArrayAssignment;

import java.util.*;

public class Three {
     public static void rotateArray(int[] nums, int k) {
          int n = nums.length;
          k = k % n; // Normalize k if it is greater than array length
          reverse(nums, 0, n - 1);
          reverse(nums, 0, k - 1);
          reverse(nums, k, n - 1);
     }

     public static void reverse(int[] nums, int start, int end) {
          while (start < end) {
               int temp = nums[start];
               nums[start] = nums[end];
               nums[end] = temp;
               start++;
               end--;
          }
     }

     public static void main(String[] args) {
          int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
          int k = 3;
          System.out.println("Original Array: " + Arrays.toString(nums));

          rotateArray(nums, k);
          System.out.println("Array rotated by " + k + " positions: " + Arrays.toString(nums));
     }
}
