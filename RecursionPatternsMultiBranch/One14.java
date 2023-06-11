package RecursionPatternsMultiBranch;

import java.util.*;

public class One14 {
     static void printpattern(int rows, int irows, int digit) {
          if (irows > rows) {
               return;
          } else {
               printdigit(rows, irows, digit);
          }
     }

     static void printdigit(int rows, int irows, int digit) {
          for (int j = 1; j <= irows; j++) {
               System.out.print(digit + " ");
               digit++;
          }
          System.out.println();
          printpattern(rows, irows + 1, digit);
     }

     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int n = sc.nextInt();
          int irows = 1;
          int digit = 1;
          printpattern(n, irows, digit);
          sc.close();
     }
}
