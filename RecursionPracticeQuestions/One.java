package RecursionPracticeQuestions;

import java.util.*;

//Write a recursive function that takes a list of numbers as an input and return product of all numbers in list
public class One {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of elements in the list:");
          int n = sc.nextInt();
          List<Integer> num = new ArrayList<>();
          System.out.println("Enter the elements:");
          for (int i = 0; i < n; i++)
               num.add(sc.nextInt());
          int p = calcP(num);
          System.out.println("Product: " + p);
          sc.close();
     }

     public static int calcP(List<Integer> num) {
          if (num.isEmpty())
               return 1;
          else {
               int x = num.get(0);
               List<Integer> rem = num.subList(1, num.size());
               int prem = calcP(rem);
               return x * prem;
          }
     }
}
