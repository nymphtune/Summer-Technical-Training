package RecursionPatternsMultiBranch;

import java.util.*;

public class One3 {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int n = sc.nextInt();
          printPattern(n, 1);
          sc.close();
     }

     private static void printPattern(int n, int r) {
          if (r > n) {
               return;
          }
          printStars(r);
          System.out.println();
          printPattern(n, r + 1);
     }

     private static void printStars(int count) {
          if (count == 0) {
               return;
          }

          System.out.print("*");
          printStars(count - 1);
     }

}
