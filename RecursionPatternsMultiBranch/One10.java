package RecursionPatternsMultiBranch;

import java.util.Scanner;

public class One10 {
     public static void printDiagonal(int n) {
          printDiagonalHelper(n, 1);
     }

     public static void printDiagonalHelper(int n, int row) {
          if (row > n) {
               return;
          }

          printSpaces(row - 1);
          System.out.println("*");

          printDiagonalHelper(n, row + 1);
     }

     public static void printSpaces(int count) {
          if (count <= 0) {
               return;
          }

          System.out.print(" ");
          printSpaces(count - 1);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int n = sc.nextInt();
          printDiagonal(n);
          sc.close();
     }
}
