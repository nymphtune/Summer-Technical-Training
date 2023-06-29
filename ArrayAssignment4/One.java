/*Numbers smaller than current number : LC - 1365
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
*/

package ArrayAssignment4;

import java.util.*;

public class One {
     public int[] smaller(int[] nums) {
          int n = nums.length;
          int[] sorted = Arrays.copyOf(nums, n);
          Arrays.sort(sorted);

          Map<Integer, Integer> m = new HashMap<>();
          for (int i = 0; i < n; i++) {
               m.putIfAbsent(sorted[i], i);
          }

          int[] r = new int[n];
          for (int i = 0; i < n; i++) {
               r[i] = m.get(nums[i]);
          }

          return r;
     }

     public static void main(String[] args) {
          int[] nums = { 8, 1, 2, 2, 3 };
          One solution = new One();
          int[] r = solution.smaller(nums);
          System.out.println(Arrays.toString(r));
     }
}
