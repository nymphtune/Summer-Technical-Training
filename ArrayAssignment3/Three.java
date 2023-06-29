//Majority Element using Hashmap

package ArrayAssignment3;

import java.util.*;

public class Three {
     public static void main(String[] args) {
          int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
          System.out.println("Majority Element: " + findMajor(nums));
     }

     public static int findMajor(int[] nums) {
          Map<Integer, Integer> m = new HashMap<>();
          int flag = 0;
          int count = 0;

          for (int i : nums) {
               m.put(i, m.getOrDefault(i, 0) + 1);
               if (m.get(i) > count) {
                    count = m.get(i);
                    flag = i;
               }
          }

          return flag;
     }
}
