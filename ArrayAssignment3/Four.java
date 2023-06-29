/*Gas Station - LC : 134
gas = [1,2,3,4,5], cost = [3,4,5,1,2]*/

package ArrayAssignment3;

public class Four {
     public static void main(String[] args) {
          int[] gas = { 1, 2, 3, 4, 5 };
          int[] cost = { 3, 4, 5, 1, 2 };
          int start = canCompleteCircuit(gas, cost);
          System.out.println("Starting Gas Station: " + start);
     }

     public static int canCompleteCircuit(int[] gas, int[] cost) {
          int tGas = 0;
          int cGas = 0;
          int start = 0;

          for (int i = 0; i < gas.length; i++) {
               tGas += gas[i] - cost[i];
               cGas += gas[i] - cost[i];

               if (cGas < 0) {
                    start = i + 1;
                    cGas = 0;
               }
          }

          if (tGas < 0) {
               return -1;
          } else {
               return start;
          }
     }
}
