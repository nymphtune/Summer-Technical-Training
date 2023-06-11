package RecursionPatternsMultiBranch;

import java.util.*;

class Two {
     public static int climb(int n) {
          if (n <= 2) {
               return n;
          }
          return climb(n - 1) + climb(n - 2);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of stairs:");
          int stairs = sc.nextInt();
          System.out.println("Number of ways to climb " + stairs + " stairs: " + climb(stairs));
          sc.close();
     }
}