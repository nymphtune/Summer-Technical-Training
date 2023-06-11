package RecursionPatternsMultiBranch;

import java.util.*;

public class One5 {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int n = sc.nextInt();
          printUpsideDownMirrorLeftTrianglePattern(n, 1);
          sc.close();
     }

     private static void printUpsideDownMirrorLeftTrianglePattern(int n, int row) {
          if (row > n) {
               return;
          }

          for (int i = 1; i <= n - row; i++) {
               System.out.print(" "); // Print spaces before stars
          }

          for (int j = 1; j <= row; j++) {
               System.out.print("*"); // Print stars
          }

          System.out.println(); // Move to the next line

          printUpsideDownMirrorLeftTrianglePattern(n, row + 1);
     }

}
