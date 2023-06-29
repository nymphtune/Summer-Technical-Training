/*Max Chunks To Make Sorted : LC - 769
Input: a = [4,3,2,1,0]
Output: 1*/

package ArrayAssignment4;

public class Two {
     public int sortMeth(int[] a) {
          int chunks = 0;
          int max = 0;

          for (int i = 0; i < a.length; i++) {
               max = Math.max(max, a[i]);

               if (max == i) {
                    chunks++;
               }
          }

          return chunks;
     }

     public static void main(String[] args) {
          int[] a = { 4, 3, 2, 1, 0 };
          Two solution = new Two();
          int x = solution.sortMeth(a);
          System.out.println(x);
     }
}
