// Letter Combinations of a phone number - LeetCode : 17

package BacktrackingAssignment;

import java.util.*;

public class Two {
     private static final Map<Character, String> x = new HashMap<>();

     static {
          x.put('0', "");
          x.put('1', "");
          x.put('2', "abc");
          x.put('3', "def");
          x.put('4', "ghi");
          x.put('5', "jkl");
          x.put('6', "mno");
          x.put('7', "pqrs");
          x.put('8', "tuv");
          x.put('9', "wxyz");
     }

     public List<String> letterCombinations(String dig) {
          List<String> comb = new ArrayList<>();
          if (dig == null || dig.isEmpty()) {
               return comb;
          }
          backtrack("", dig, comb);
          return comb;
     }

     private void backtrack(String now, String dig, List<String> comb) {
          if (dig.isEmpty()) {
               comb.add(now);
               return;
          }
          char digit = dig.charAt(0);
          String a = x.get(digit);
          for (char letter : a.toCharArray()) {
               backtrack(now + letter, dig.substring(1), comb);
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the digits(without pressing enter): ");
          String dig = sc.next();
          Two two = new Two();
          List<String> result = two.letterCombinations(dig);
          System.out.println(result);
          sc.close();
     }
}
