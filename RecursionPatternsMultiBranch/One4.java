package RecursionPatternsMultiBranch;

import java.util.*;

public class One4 {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number");
          int n = sc.nextInt();
          patternPrint(n);
          sc.close();
     }

     private static void patternPrint(int n) {
          if (n == 0) {
               return;
          }
          for (int i = 1; i <= n; i++) {
               System.out.print("*");
          }
          System.out.println();
          patternPrint(n - 1);
     }
}
