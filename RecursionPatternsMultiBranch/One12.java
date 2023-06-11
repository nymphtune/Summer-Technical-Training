package RecursionPatternsMultiBranch;

import java.util.*;

public class One12 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int n = sc.nextInt();
          printPattern(n, 1);
          sc.close();
     }

     private static void printPattern(int n, int row) {
          if (row > n) {
               return;
          }

          for (int i = 1; i <= row; i++) {
               System.out.print("*");
          }

          System.out.println();

          printPattern(n, row + 1);

          for (int i = 1; i <= row; i++) {
               System.out.print("*");
          }

          System.out.println();
     }
}
