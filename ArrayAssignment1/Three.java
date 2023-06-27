//Remove Duplicate from sorted array : LC - 26
package ArrayAssignment1;

import java.util.*;

public class Three {
     public static int removeDuplicates(int[] nums) {
          int i = 0;
          for (int n : nums)
               if (i == 0 || n > nums[i - 1])
                    nums[i++] = n;
          return i;
     }

     public static void main(String[] args) {
          int[] nums = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
          System.out.println("Original Array: " + Arrays.toString(nums));

          int newLength = removeDuplicates(nums);
          System.out.println("Array after removing duplicates: ");
          System.out.print("[ ");
          for (int i = 0; i < nums.length - newLength + 1; i++) {
               System.out.print(nums[i] + " ");
          }
          System.out.print("] \n");
          System.out.println("New Length: " + newLength);
     }

}
