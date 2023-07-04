/*Question: Given an array of integers, find the maximum bitwise AND value of any two integers in the array.
Input: [3, 5, 8, 10, 12]
Output: 8
Explanation: The maximum bitwise AND value of any two integers in the array is 8, which is the result of the bitwise AND operation between 10 (1010 in binary) and 12 (1100 in binary).*/

package BITAssignment;

public class One {
     public static int findMeth(int[] num) {
          int x = 0;
          int n = num.length;

          for (int i = 0; i < n; i++) {
               for (int j = i + 1; j < n; j++) {
                    int bitwiseAnd = num[i] & num[j];
                    if (bitwiseAnd > x) {
                         x = bitwiseAnd;
                    }
               }
          }

          return x;
     }

     public static void main(String[] args) {
          int[] num = { 3, 5, 8, 10, 12 };
          int result = findMeth(num);
          System.out.println("Maximum Bitwise AND: " + result);
     }
}
