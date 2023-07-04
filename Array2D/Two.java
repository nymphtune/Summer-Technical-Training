package Array2D;

public class Two {
     public static void rotate(int[][] matrix) {
          for (int i = 0; i < matrix.length; i++) {
               for (int j = i; j < matrix[0].length; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
               }
          }
          for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix.length / 2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix.length - 1 - j];
                    matrix[i][matrix.length - 1 - j] = temp;
               }
          }
     }

     public static void main(String[] args) {
          int[][] matrix = {
                    { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 9 }
          };

          System.out.println("Original Matrix:");
          printMatrix(matrix);

          rotate(matrix);

          System.out.println("Rotated Matrix:");
          printMatrix(matrix);
     }

     private static void printMatrix(int[][] matrix) {
          for (int[] row : matrix) {
               for (int num : row) {
                    System.out.print(num + " ");
               }
               System.out.println();
          }
     }
}
