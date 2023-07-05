/*The K Weakest Rows in a Matrix - LC : 1337*/

package Array2D;

import java.util.*;

class Four {
     public int[] kWeakestRows(int[][] mat, int k) {
          int m = mat.length;
          int n = mat[0].length;

          Comparator<int[]> comparator = (a, b) -> {
               if (a[0] != b[0])
                    return a[0] - b[0];
               else
                    return a[1] - b[1];
          };

          PriorityQueue<int[]> pq = new PriorityQueue<>(comparator);

          for (int i = 0; i < m; i++) {
               int count = binarySearch(mat[i], 0, n - 1);
               pq.offer(new int[] { count, i });

               if (pq.size() > k)
                    pq.poll();
          }

          int[] result = new int[k];
          int index = k - 1;
          while (!pq.isEmpty()) {
               result[index--] = pq.poll()[1];
          }

          return result;
     }

     private int binarySearch(int[] row, int left, int right) {
          while (left <= right) {
               int mid = left + (right - left) / 2;
               if (row[mid] == 1) {
                    left = mid + 1;
               } else {
                    right = mid - 1;
               }
          }
          return left;
     }

     public static void main(String[] args) {
          int[][] x = {
                    { 1, 1, 0, 0, 0 },
                    { 1, 1, 1, 1, 0 },
                    { 1, 0, 0, 0, 0 },
                    { 1, 1, 0, 0, 0 },
                    { 1, 1, 1, 1, 1 }
          };
          int k = 3;

          Four solution = new Four();
          int[] weakestRows = solution.kWeakestRows(x, k);

          System.out.println("The k weakest rows are: " + Arrays.toString(weakestRows));
     }
}
