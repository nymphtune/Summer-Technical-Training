/*Find subarray whose sum is equal to given sum
i/p : {10,20,30,40,50,60}, sum = 90
*/
package ArrayAssignment5;

public class Three {
     public static void findSubarrayWithSum(int[] arr, int sum) {
          int currentSum = arr[0];
          int start = 0;

          for (int i = 1; i <= arr.length; i++) {
               while (currentSum > sum && start < i - 1) {
                    currentSum -= arr[start];
                    start++;
               }

               if (currentSum == sum) {
                    System.out.println("Subarray found from index " + start + " to " + (i - 1));
                    return;
               }

               if (i < arr.length) {
                    currentSum += arr[i];
               }
          }

          System.out.println("No subarray found with the given sum.");
     }

     public static void main(String[] args) {
          int[] arr = { 10, 20, 30, 40, 50, 60 };
          int sum = 90;
          findSubarrayWithSum(arr, sum);
     }
}
