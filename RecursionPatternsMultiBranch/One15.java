package RecursionPatternsMultiBranch;

import java.util.*;

public class One15 {
     static int istars = 5;

     static void printpattern(int rows, int irows) {
          if (irows > rows) {
               return;
          } else {
               printstarspace(rows, irows);
               System.out.println();
               printpattern(rows, irows + 1);
          }
     }

     static void printstarspace(int rows, int irows) {
          for (int spaces = 0; spaces < irows; spaces++) {
               System.out.print(" ");
          }
          for (int stars = 1; stars <= istars; stars++) {
               System.out.print("* ");
          }
          istars--;
     }

     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int rows = sc.nextInt();
          int irows = 1;
          printpattern(rows, irows);
          sc.close();
     }

}
