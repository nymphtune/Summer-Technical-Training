package RecursionPracticeQuestions;

import java.util.*;

//Write recursive function that takes an array of words and returns an array containing all words capitalized

public class Two {
     public static void main(String[] Args) {
          Scanner sc = new Scanner(System.in);
          int i;
          System.out.print("Enter the lenghth of array: ");
          int ind = sc.nextInt();
          String arr[] = new String[ind];
          System.out.println("Enter the words:");
          for (i = 0; i < ind; i++) {
               arr[i] = sc.next();
          }
          sc.close();
          System.out.println(Arrays.toString(upperArray(arr)));

     }

     public static String[] upperArray(String[] arr) {
          if (arr.length == 0) {
               return new String[0];
          } else {
               String[] upcase = new String[arr.length];
               upcase[0] = arr[0].toUpperCase();
               String[] rema = Arrays.copyOfRange(arr, 1, arr.length);
               String[] remupcase = upperArray(rema);
               System.arraycopy(remupcase, 0, upcase, 1, remupcase.length);
               return upcase;
          }
     }
}