package SimpleRecursion;

import java.util.*;

public class Four {
     public static List<Integer> generatePrime(int start, int end) {
          List<Integer> primes = new ArrayList<>();
          if (start > end) {
               return primes;
          }

          if (isPrime(start)) {
               primes.add(start);
          }

          primes.addAll(generatePrime(start + 1, end));
          return primes;
     }

     public static boolean isPrime(int n) {
          if (n <= 1) {
               return false;
          }
          if (n <= 3) {
               return true;
          }
          if (n % 2 == 0 || n % 3 == 0) {
               return false;
          }

          int i = 5;
          while (i * i <= n) {
               if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
               }
               i += 6;
          }

          return true;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int start = sc.nextInt();
          int end = sc.nextInt();
          List<Integer> primes = generatePrime(start, end);
          sc.close();
          System.out.println("Prime numbers between " + start + " and " + end + ":");
          for (int prime : primes) {
               System.out.print(prime + " ");
          }
     }
}
