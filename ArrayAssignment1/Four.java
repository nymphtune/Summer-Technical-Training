/*Odd Element in array
i/p : arr[] = {1,1,2,2,3,3,4,5,5,6,6};
o/p : 4*/
package ArrayAssignment1;

public class Four {
     public static int findOddElement(int[] arr) {
          int result = 0;
          for (int num : arr) {
               result ^= num; // XOR operation to find the odd occurring element
          }
          return result;
     }

     public static void main(String[] args) {
          int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
          int oddElement = findOddElement(arr);
          System.out.println("Odd Element: " + oddElement);
     }
}
