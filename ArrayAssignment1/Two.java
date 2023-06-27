/*Missing Number : LC - 268
i/p : arr[] = {1,2,4,5,6}
o/p : 3*/
package ArrayAssignment1;

public class Two {

     public static int missingNumber(int[] nums) {
          int sum = 0;
          for (int num : nums)
               sum += num;

          return (nums.length * (nums.length + 1)) / 2 - sum;
     }

     public static void main(String[] args) {
          int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
          System.out.println("Missing Number: " + missingNumber(arr));
     }

}
