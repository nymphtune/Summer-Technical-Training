/*Question: Given a non-negative integer n, find the number of integers x such that 0 <= x <= n and n & x == x
Input: n = 5
Output: 4
Explanation: The integers x that satisfy the condition are 0, 1, 4, and 5.
*/

package BITAssignment;

public class Two {
     public static int countMeth(int n) {
          int count = 0;
          int mask = Integer.MAX_VALUE;

          while ((n & mask) != 0) {
               mask <<= 1;
               count++;
          }

          return count;
     }

     public static void main(String[] args) {
          int n = 5;
          int result = countMeth(n);
          System.out.println("Number of Integers: " + result);
     }
}
