package RecursionPatternsMultiBranch;

import java.util.*;

//could not figure recursion out
public class One18 {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number");
          int n = sc.nextInt();
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");
               }
               // loop calculates space
               for (int k = 1; k <= 2 * i - 2; k++) {
                    System.out.print(" ");
               }
               for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }
          // logic to print the second half pattern
          for (int i = n - 1; i >= 1; i--) {
               for (int j = i; j <= n; j++) {
                    System.out.print("*");
               }
               // loop calculates space
               for (int k = 1; k <= (2 * i) - 2; k++) {
                    System.out.print(" ");
               }
               for (int j = i; j <= n; j++) {
                    System.out.print("*");
               }
               System.out.println();
               sc.close();
          }
     }
}
