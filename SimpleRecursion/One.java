package SimpleRecursion;

import java.util.*;

public class One {
     public static int countDigs(int n) {
          if (n < 10) {
               return 1;
          } else {
               return 1 + countDigs(n / 10);
          }
     }

     public static void main(String[] args) {
          System.out.println("Enter the number:");
          Scanner sc = new Scanner(System.in);
          int number = sc.nextInt();
          System.out.println(countDigs(number));
          sc.close();
     }
}
