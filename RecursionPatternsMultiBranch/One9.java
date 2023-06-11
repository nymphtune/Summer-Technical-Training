package RecursionPatternsMultiBranch;

import java.util.*;

public class One9 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int n = sc.nextInt();
          printDiamondPattern(n, 1);
          sc.close();
     }

     private static void printDiamondPattern(int n, int row) {
          if (row <= n) {
               printSpaces(n - row);
               printStars(row);
               System.out.println();
               printDiamondPattern(n, row + 1);
          } else {
               printDiamondPatternBottom(n, 1);
          }
     }

     private static void printDiamondPatternBottom(int n, int row) {
          if (row <= n - 1) {
               printSpaces(row);
               printStars(n - row);
               System.out.println();
               printDiamondPatternBottom(n, row + 1);
          } else {
               // Base case: last row of the diamond pattern
               printSpaces(0);
               printStars(1);
               System.out.println();
          }
     }

     private static void printSpaces(int count) {
          if (count <= 0) {
               return;
          }
          System.out.print(" ");
          printSpaces(count - 1);
     }

     private static void printStars(int count) {
          if (count <= 0) {
               return;
          }
          System.out.print("* ");
          printStars(count - 1);
     }
}
