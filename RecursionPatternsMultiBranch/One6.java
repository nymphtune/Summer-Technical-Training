package RecursionPatternsMultiBranch;

import java.util.*;

public class One6 {
     public static void printPattern(int n, int spaces) {
          if (n <= 0) {
               return;
          }

          System.out.println(" ".repeat(spaces) + "*".repeat(n));
          printPattern(n - 1, spaces + 1);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int n = sc.nextInt();
          printPattern(n, 0);
          sc.close();
     }
}
