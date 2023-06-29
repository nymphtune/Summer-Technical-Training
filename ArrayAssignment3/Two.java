/*DNF - Sort Colors - LC : 75 (without any sorting algo)
i/p : x[] = {0,0,1,2,0,1,0,2,0,2,1,2,1}
o/p : {0,0,0,0,0,1,1,1,1,2,2,2,2}*/
package ArrayAssignment3;

public class Two {
     public static void main(String[] args) {
          int[] x = { 0, 0, 1, 2, 0, 1, 0, 2, 0, 2, 1, 2, 1 };
          sortMeth(x);
          for (int i : x) {
               System.out.print(i + " ");
          }
     }

     public static void sortMeth(int[] x) {
          int low = 0;
          int mid = 0;
          int high = x.length - 1;

          while (mid <= high) {
               if (x[mid] == 0) {
                    swap(x, low, mid);
                    low++;
                    mid++;
               } else if (x[mid] == 1) {
                    mid++;
               } else if (x[mid] == 2) {
                    swap(x, mid, high);
                    high--;
               }
          }
     }

     public static void swap(int[] x, int i, int j) {
          int temp = x[i];
          x[i] = x[j];
          x[j] = temp;
     }
}
