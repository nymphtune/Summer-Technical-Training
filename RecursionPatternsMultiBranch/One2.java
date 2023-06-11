package RecursionPatternsMultiBranch;

import java.util.*;

class One2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number");
          int n = sc.nextInt();
          printHollowSquarePattern(n, n);
          sc.close();
     }

     private static void printHollowSquarePattern(int n, int r) {
          if (r == 0) {
               return;
          }
          for (int c = 1; c <= n; c++) {
               if (r == 1 || r == n || c == 1 || c == n) {
                    System.out.print("* ");
               } else {
                    System.out.print("  ");
               }
          }
          System.out.println();
          printHollowSquarePattern(n, r - 1);
     }
}