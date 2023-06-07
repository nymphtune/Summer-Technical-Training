package SimpleRecursion;

import java.util.*;

public class Five {
     public static boolean isArmstrong(int number) {
          int digits = countDigits(number);
          int sumOfPowers = SumOfPowers(number, digits);
          return number == sumOfPowers;
     }

     public static int countDigits(int number) {
          if (number == 0) {
               return 0;
          }
          return 1 + countDigits(number / 10);
     }

     public static int SumOfPowers(int number, int digits) {
          if (number == 0) {
               return 0;
          }
          int digit = number % 10;
          return (int) Math.pow(digit, digits) + SumOfPowers(number / 10, digits);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number:   ");
          int number = sc.nextInt();
          System.out.println(isArmstrong(number));
          sc.close();
     }
}
