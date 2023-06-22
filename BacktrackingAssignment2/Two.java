//Combination Sum - LC : 39
package BacktrackingAssignment2;

import java.util.*;

public class Two {
     public List<List<Integer>> combinationSum(int[] c, int t) {
          List<List<Integer>> res = new ArrayList<>();
          Arrays.sort(c);
          backtrack(res, new ArrayList<>(), c, t, 0);
          return res;
     }

     private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] c, int rem,
               int start) {
          if (rem < 0) {
               return;
          } else if (rem == 0) {
               res.add(new ArrayList<>(temp));
          } else {
               for (int i = start; i < c.length; i++) {
                    if (i > start && c[i] == c[i - 1]) {
                         continue;
                    }
                    temp.add(c[i]);
                    backtrack(res, temp, c, rem - c[i], i);
                    temp.remove(temp.size() - 1);
               }
          }
     }

     public static void main(String[] args) {
          Two two = new Two();
          int[] c = { 2, 3, 6, 7 };
          int t = 7;
          List<List<Integer>> x = two.combinationSum(c, t);
          System.out.println(x);
     }
}
