package RecursionPatternsMultiBranch;

public class One19 {
     public static void printPattern(int n, int spaces) {
          if (n <= 0) {
               return;
          }

          printSpaces(spaces);
          printStars(n);
          System.out.println();

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

          System.out.print("*");
          printStars(count - 1);
     }

     public static void main(String[] args) {
          int n = 5;
          printPattern(n, 0);
     }
}
