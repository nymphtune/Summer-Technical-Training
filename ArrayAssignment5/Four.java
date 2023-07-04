/*NBonacci Series
- if n = 2 - fibonacci Series
- if n = 3 - triboancci Series
- if n = n - NBonacci Series
i/p : n = 3, nthTerm = 15
o/p : 0,0,1,1,2,4,7,13,24,44,81,149,274,504
*/
package ArrayAssignment5;

public class Four {
     public static void printNBonacciSeries(int n, int nthTerm) {
          int[] series = new int[nthTerm];
          for (int i = 0; i < nthTerm; i++) {
               if (i < n - 1) {
                    series[i] = 0;
               } else if (i == n - 1) {
                    series[i] = 1;
               } else {
                    for (int j = i - n + 1; j <= i - 1; j++) {
                         series[i] += series[j];
                    }
               }
               System.out.print(series[i] + " ");
          }
     }

     public static void main(String[] args) {
          int n = 3;
          int nthTerm = 15;
          System.out.print("NBonacci Series: ");
          printNBonacciSeries(n, nthTerm);
     }
}
