//Sort Array By Parity : LC : 905

package ArrayAssignment5;

import java.util.Arrays;

public class Two {
     public static int[] sortArrayByParity(int[] nums) {
          int left = 0;
          int right = nums.length - 1;

          while (left < right) {
               if (nums[left] % 2 == 1 && nums[right] % 2 == 0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
               }

               if (nums[left] % 2 == 0) {
                    left++;
               }

               if (nums[right] % 2 == 1) {
                    right--;
               }
          }

          return nums;
     }

     public static void main(String[] args) {
          int[] nums = { 3, 1, 2, 4 };
          int[] sortedArray = sortArrayByParity(nums);
          System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
     }
}
