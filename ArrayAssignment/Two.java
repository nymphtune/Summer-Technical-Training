package ArrayAssignment;

import java.util.*;

public class Two {
     public static void rotateClockwise(int[] nums) {
          int last = nums[nums.length - 1];
          System.arraycopy(nums, 0, nums, 1, nums.length - 1);
          nums[0] = last;
     }

     public static void rotateAnticlockwise(int[] nums) {
          int first = nums[0];
          System.arraycopy(nums, 1, nums, 0, nums.length - 1);
          nums[nums.length - 1] = first;
     }

     public static void main(String[] args) {
          int[] nums = { 1, 2, 3, 4, 5 };
          System.out.println("Original Array: " + Arrays.toString(nums));

          rotateClockwise(nums);
          System.out.println("Array rotated by one in clockwise: " + Arrays.toString(nums));

          rotateAnticlockwise(nums);
          System.out.println("Array rotated by one in anticlockwise: " + Arrays.toString(nums));
     }
}
