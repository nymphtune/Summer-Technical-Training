/*Lucky Number - LC : 1380
Rotate Image - LC - 48
Spiral Matrix - LC : 54*/
package Array2D;

import java.util.*;

public class One {
     public static List<Integer> luckyNumbers(int[][] matrix) {
          List<Integer> result = new ArrayList<>();

          for (int row = 0; row < matrix.length; row++) {
               int minCol = minColInRow(matrix, row);
               int value = matrix[row][minCol];
               if (checkIfMaxInCol(matrix, minCol, value)) {
                    result.add(value);
               }
          }

          return result;
     }

     private static int minColInRow(int[][] matrix, int row) {
          int minIndex = 0;
          int min = matrix[row][minIndex];
          for (int col = 1; col < matrix[row].length; col++) {
               if (matrix[row][col] < min) {
                    min = matrix[row][col];
                    minIndex = col;
               }
          }
          return minIndex;
     }

     private static boolean checkIfMaxInCol(int[][] matrix, int col, int value) {
          for (int row = 0; row < matrix.length; row++) {
               if (matrix[row][col] > value)
                    return false;
          }
          return true;
     }

     public static void main(String[] args) {
          int[][] matrix = {
                    { 3, 7, 8 },
                    { 9, 11, 13 },
                    { 15, 16, 17 }
          };

          List<Integer> luckyNumbers = luckyNumbers(matrix);
          System.out.println("Lucky Numbers: " + luckyNumbers);
     }
}
