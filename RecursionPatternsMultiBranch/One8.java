package RecursionPatternsMultiBranch;

import java.util.*;

public class One8 {
     public static void printPyramid(int n) {
          printPyramidHelper(n, 1);
     }

     public static void printPyramidHelper(int n, int row) {
          if (row > n) {
               return;
          }

          printSpaces(n - row);
          printStars(2 * row - 1);
          System.out.println();

          printPyramidHelper(n, row + 1);
     }

     public static void printSpaces(int count) {
          if (count <= 0) {
               return;
          }

          System.out.print(" ");
          printSpaces(count - 1);
     }

     public static void printStars(int count) {
          if (count <= 0) {
               return;
          }

          System.out.print("*");
          printStars(count - 1);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int n = sc.nextInt();
          printPyramid(n);
          sc.close();
     }
}
