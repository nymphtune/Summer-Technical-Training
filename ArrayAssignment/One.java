package ArrayAssignment;

import java.util.*;

public class One {
     public static void findPairSum(int[] nums, int target) {
          Arrays.sort(nums); // Sort the array in ascending order
          int left = 0;
          int right = nums.length - 1;

          while (left < right) {
               int sum = nums[left] + nums[right];
               if (sum == target) {
                    System.out.println("Pair found: " + nums[left] + ", " + nums[right]);
                    left++;
                    right--;
               } else if (sum < target) {
                    left++;
               } else {
                    right--;
               }
          }
     }

     public static void main(String[] args) {
          int[] nums = { 2, 4, 7, 11, 15 };
          int target = 9;
          findPairSum(nums, target);
     }
}
