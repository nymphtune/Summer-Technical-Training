package RecursionPatternsMultiBranch;

import java.util.*;

public class One16 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number");
          int n = sc.nextInt();
          printPattern(n, 0);
          sc.close();
     }

     private static void printPattern(int n, int spaces) {
          if (n <= 0) {
               return;
          }
          for (int i = 0; i < spaces; i++) {
               System.out.print(" ");
          }
          for (int i = 0; i < (2 * n - 1); i++) {
               System.out.print("*");
          }
          System.out.println();
          printPattern(n - 1, spaces + 1);
     }
}
