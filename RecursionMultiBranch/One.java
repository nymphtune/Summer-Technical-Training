package RecursionMultiBranch;

public class One {
     private int[][] maze;
     private int n;

     public One(int[][] maze) {
          this.maze = maze;
          this.n = maze.length;
     }

     public void solveMaze() {
          int[][] s = new int[n][n];

          if (solve(0, 0, s)) {
               printSolution(s);
          } else {
               System.out.println("No solution found.");
          }
     }

     private boolean solve(int x, int y, int[][] s) {
          // outside the maze or on a blocked cell check
          if (x < 0 || x >= n || y < 0 || y >= n || maze[x][y] == 0) {
               return false;
          }
          // Check if reach goal
          if (x == n - 1 && y == n - 1) {
               s[x][y] = 1;
               return true;
          }
          // current position part of the s path
          s[x][y] = 1;
          // diagonally
          if (solve(x + 1, y + 1, s)) {
               return true;
          }
          // vertically
          if (solve(x, y + 1, s)) {
               return true;
          }
          // horizontally
          if (solve(x + 1, y, s)) {
               return true;
          }
          // Backtrack
          s[x][y] = 0;
          return false;
     }

     private void printSolution(int[][] s) {
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    System.out.print(s[i][j] + " ");
               }
               System.out.println();
          }
     }

     public static void main(String[] args) {
          int[][] maze = {
                    { 1, 0, 1, 1 },
                    { 1, 0, 0, 1 },
                    { 0, 1, 0, 0 },
                    { 1, 0, 1, 1 }
          };// this amze can be changed as needed

          One mazeSolver = new One(maze);
          mazeSolver.solveMaze();
     }
}
