/*
 * Sum of upper and lower triangles
 * https://practice.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-
 * 1587115621/1
 * 
 */

package Array2D;

import java.util.*;

public class Five {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number of r: ");
          int r = sc.nextInt();
          System.out.print("Enter the number of c: ");
          int c = sc.nextInt();

          int[][] x = new int[r][c];

          System.out.println("Enter the x elements:");
          for (int i = 0; i < r; i++) {
               for (int j = 0; j < c; j++) {
                    x[i][j] = sc.nextInt();
               }
          }

          int upperTriangleSum = 0;
          int lowerTriangleSum = 0;

          for (int i = 0; i < r; i++) {
               for (int j = 0; j < c; j++) {
                    if (j >= i) {
                         upperTriangleSum += x[i][j];
                    }
                    if (j <= i) {
                         lowerTriangleSum += x[i][j];
                    }
               }
          }

          System.out.println("Sum of upper triangle: " + upperTriangleSum);
          System.out.println("Sum of lower triangle: " + lowerTriangleSum);
          sc.close();
     }
}
