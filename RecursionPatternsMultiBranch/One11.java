package RecursionPatternsMultiBranch;

import java.util.*;

public class One11 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int n = sc.nextInt();
          printCrossDiagonalPattern(n, n, 1);
          sc.close();
     }

     private static void printCrossDiagonalPattern(int n, int i, int j) {
          if (i <= 0) {
               return;
          }

          if (j <= n) {
               if (j == i || j == (n - i + 1)) {
                    System.out.print("*");
               } else {
                    System.out.print(" ");
               }

               printCrossDiagonalPattern(n, i, j + 1);
          } else {
               System.out.println();
               printCrossDiagonalPattern(n, i - 1, 1);
          }
     }
}
