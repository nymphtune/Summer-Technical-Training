package SimpleRecursion;

import java.util.*;

public class Six {
     public static boolean isPalindrome(String str) {
          if (str.length() <= 1) {
               return true;
          }
          char f = str.charAt(0);
          char l = str.charAt(str.length() - 1);

          if (f == l) {
               String rem = str.substring(1, str.length() - 1);
               return isPalindrome(rem);
          } else {
               return false;
          }
     }

     public static void main(String[] Args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the string: ");
          String str = sc.next();
          System.out.println(isPalindrome(str));
          sc.close();
     }
}
