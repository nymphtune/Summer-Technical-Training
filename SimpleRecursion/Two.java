package SimpleRecursion;

import java.util.*;

public class Two {
     public static int countZeros(int n) {
          if (n == 0) {
               return 0;
          }
          if (n % 10 == 0) {
               return 1 + countZeros(n / 10);
          } else {
               return countZeros(n / 10);
          }
     }

     public static void main(String[] args) {
          System.out.println("Enter the number:");
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          System.out.println(countZeros(n));
          sc.close();
     }

}
