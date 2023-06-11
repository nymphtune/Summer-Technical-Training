package RecursionPatternsMultiBranch;

import java.util.*;

public class One1 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int n = sc.nextInt();
          printSquarePattern(n, n);
          sc.close();
     }

     private static void printSquarePattern(int n, int r) {
          if (r == 0) {
               return;
          }
          for (int i = 0; i < n; i++) {
               System.out.print("* ");
          }
          System.out.println();
          printSquarePattern(n, r - 1);
     }
}
