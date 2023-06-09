package RecursionPatternsArrays;

import java.util.*;

public class PFour {
     public static void printP(int n) {
          printPattern(n, 1, 1);
     }

     private static void printPattern(int n, int row, int count) {
          if (row > n) {
               return;
          }
          for (int i = 1; i <= row; i++) {
               System.out.print(count + " ");
               count++;
          }

          System.out.println();
          printPattern(n, row + 1, count);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int n = sc.nextInt();
          printP(n);
          sc.close();
     }
}
