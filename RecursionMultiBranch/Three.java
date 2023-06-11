package RecursionMultiBranch;

import java.util.*;

public class Three {
     public void solveTowerOfHanoi(int n, char source, char auxiliary, char destination) {
          if (n == 1) {
               System.out.println("Move disk 1 from " + source + " to " + destination);
               return;
          }

          solveTowerOfHanoi(n - 1, source, destination, auxiliary);
          System.out.println("Move disk " + n + " from " + source + " to " + destination);
          solveTowerOfHanoi(n - 1, auxiliary, source, destination);
     }

     public static void main(String[] args) {
          Three towerOfHanoi = new Three();
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the no. of disks:");
          int n = sc.nextInt();
          char source = 'A';
          char auxiliary = 'B';
          char destination = 'C';
          towerOfHanoi.solveTowerOfHanoi(n, source, auxiliary, destination);
          sc.close();
     }
}
