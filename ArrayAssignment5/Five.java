/*Count distinct element in every window of size k
i/p : arr[] = {1,2,3,4,4,6,6,7,7}, k = 4
o/p : 4,3,3,2,3,2
Hint : Window Sliding with Hashing*/
package ArrayAssignment5;

import java.util.*;

public class Five {
     public static void countMeth(int[] arr, int k) {
          Map<Integer, Integer> win = new HashMap<>();
          int distinctCount = 0;

          // Count the frequency of elements in the first window
          for (int i = 0; i < k; i++) {
               int count = win.getOrDefault(arr[i], 0);
               if (count == 0) {
                    distinctCount++;
               }
               win.put(arr[i], count + 1);
          }

          System.out.print("Distinct counts in each window: " + distinctCount);

          for (int i = k; i < arr.length; i++) {
               int outgoingElement = arr[i - k];
               int inEle = arr[i];

               int outgoingCount = win.get(outgoingElement);
               if (outgoingCount == 1) {
                    win.remove(outgoingElement);
                    distinctCount--;
               } else {
                    win.put(outgoingElement, outgoingCount - 1);
               }
               int incomingCount = win.getOrDefault(inEle, 0);
               if (incomingCount == 0) {
                    distinctCount++;
               }
               win.put(inEle, incomingCount + 1);

               System.out.print(", " + distinctCount);
          }
     }

     public static void main(String[] args) {
          int[] arr = { 1, 2, 3, 4, 4, 6, 6, 7, 7 };
          int k = 4;
          countMeth(arr, k);
     }
}
