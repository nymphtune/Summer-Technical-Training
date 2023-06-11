package RecursionPatternsMultiBranch;

import java.util.*;

//using loops
public class One20 {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter element : (greater than 5)");
          int n = sc.nextInt();
          for (int i = 3; i <= n; i++) {
               for (int j = n - i; j >= 1; j--) {
                    System.out.print(" ");
               }
               for (int k = 1; k <= i; k++) {
                    System.out.print("*");
               }
               for (int k = 2; k <= i; k++) {
                    System.out.print("*");
               }
               for (int j = (n - i) * 2; j >= 1; j--) {
                    System.out.print(" ");
               }
               for (int k = 1; k <= i; k++) {
                    System.out.print("*");
               }
               for (int k = 2; k <= i; k++) {
                    System.out.print("*");
               }
               System.out.println("");
          }
          for (int i = 1; i <= (n * 2) - 1; i++) {
               for (int j = 2; j <= i; j++) {
                    System.out.print(" ");
               }
               for (int k = (n * 4) - 1; k >= i * 2; k--) {
                    System.out.print("*");
               }
               System.out.println("");
          }
          sc.close();
     }
}
