/*Sort 0 and 1 (without any sorting algo)
i/p : arr[] = {0,0,1,1,0,1,0,1,0,0,1,1,1}
o/p : {0,0,0,0,0,0,1,1,1,1,1,1,1}*/

package ArrayAssignment3;

public class One {
     public static void main(String[] args) {
          int[] a = { 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1 };
          sortMeth(a);
          for (int i : a) {
               System.out.print(i + " ");
          }
     }

     public static void sortMeth(int[] a) {
          int flag = 0;
          for (int i : a) {
               if (i == 0) {
                    flag++;
               }
          }
          for (int i = 0; i < a.length; i++) {
               if (i < flag) {
                    a[i] = 0;
               } else {
                    a[i] = 1;
               }
          }
     }
}
