package RecursionMultiBranch;

import java.util.*;

public class Two {
     public int coinChange(int[] coins, int amount) {
          int result = coinChangeRecursive(coins, amount);
          return result == Integer.MAX_VALUE ? -1 : result;
     }

     private int coinChangeRecursive(int[] coins, int amount) {
          if (amount == 0) {
               return 0;
          }

          if (amount < 0) {
               return Integer.MAX_VALUE;
          }

          int minCoins = Integer.MAX_VALUE;
          for (int coin : coins) {
               int subResult = coinChangeRecursive(coins, amount - coin);
               if (subResult != Integer.MAX_VALUE) {
                    minCoins = Math.min(minCoins, subResult + 1);
               }
          }

          return minCoins;
     }

     public static void main(String[] args) {
          Two coinChange = new Two();
          int[] coins = { 1, 2, 5 };
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the amount:");
          int amount = sc.nextInt();
          int result = coinChange.coinChange(coins, amount);
          System.out.println("Minimum number of coins needed: " + result);
          sc.close();
     }
}
