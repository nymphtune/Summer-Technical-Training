package SimpleRecursion;

import java.util.*;

public class Three {
     public static boolean isPrime(int n) {
          if (n <= 1) {
               return false;
          }
          if (n <= 3) {
               return true;
          }
          return isPrimeRecursive(n, 2);
     }

     private static boolean isPrimeRecursive(int n, int div) {
          if (div * div > n) {
               return true;
          }
          if (n % div == 0) {
               return false;
          }
          return isPrimeRecursive(n, div + 1);
     }

     public static void main(String[] args) {
          System.out.println("Enter the number:");
          Scanner sc = new Scanner(System.in);
          int number = sc.nextInt();
          System.out.println(isPrime(number));
          sc.close();
     }
}
