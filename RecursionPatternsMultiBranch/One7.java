package RecursionPatternsMultiBranch;

import java.util.Scanner;

public class One7 {
     public static void printPattern(int n, int spaces) {
          if (n <= 0) {
               return;
          }

          printPattern(n - 1, spaces + 1);
          printSpaces(spaces);
          printStars(n);
          System.out.println();
     }

     public static void printSpaces(int count) {
          if (count <= 0) {
               return;
          }

          System.out.print(" ");
          printSpaces(count - 1);
     }

     public static void printStars(int count) {
          if (count <= 0) {
               return;
          }

          System.out.print("* ");
          printStars(count - 1);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int n = sc.nextInt();
          printPattern(n, 0);
          sc.close();
     }
}
