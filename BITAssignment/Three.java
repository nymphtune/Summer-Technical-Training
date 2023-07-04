/*Question: https://www.interviewbit.com/problems/palindromic-binary-representation/ */

package BITAssignment;

public class Three {
     public static boolean isPalindrome(int num) {
          int reverse = 0;
          int temp = num;

          while (temp > 0) {
               reverse <<= 1;
               if ((temp & 1) == 1) {
                    reverse |= 1;
               }
               temp >>= 1;
          }

          return num == reverse;
     }

     public static int findMeth(int A) {
          int count = 0;
          int number = 0;

          while (count < A) {
               number++;
               if (isPalindrome(number)) {
                    count++;
               }
          }

          return number;
     }

     public static void main(String[] args) {
          int A = 5;
          int result = findMeth(A);
          System.out.println("Ath Number with Palindrome Binary Representation: " + result);
     }
}
