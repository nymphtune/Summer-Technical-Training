package RecursionPatternsArrays;

import java.util.*;

public class PFive {
     public static void printP(int n) {
          printPattern(n, 1);
     }

     private static void printPattern(int n, int row) {
          if (row > n) {
               return;
          }
          for (int i = 1; i <= row; i++) {
               System.out.print((char) ('A' + row - 1));
          }
          System.out.println();
          printPattern(n, row + 1);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int n = sc.nextInt();
          printP(n);
          sc.close();
     }
}
