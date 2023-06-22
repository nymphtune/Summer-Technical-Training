//Permutations - LeetCode : 46
package BacktrackingAssignment;

import java.util.*;

public class One {
    public List<List<Integer>> permute(int[] n) {
        List<List<Integer>> x = new ArrayList<>();
        backtrack(n, new ArrayList<>(), x);
        return x;
    }

    private void backtrack(int[] n, List<Integer> temp, List<List<Integer>> x) {
        if (temp.size() == n.length) {
            x.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < n.length; i++) {
                if (temp.contains(n[i])) {
                    continue; // Skip already used elements
                }
                temp.add(n[i]);
                backtrack(n, temp, x);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int l = sc.nextInt();
        int[] n = new int[l];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < l; i++) {
            n[i] = sc.nextInt();
        }
        One one = new One();
        List<List<Integer>> x = one.permute(n);
        System.out.println(x);
        sc.close();
    }
}