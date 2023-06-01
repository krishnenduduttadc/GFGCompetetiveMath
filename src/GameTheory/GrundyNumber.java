/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameTheory;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author krish
 */
public class GrundyNumber {

    public static int calculateMex(Set<Integer> Set) {
        int Mex = 0;

        while (Set.contains(Mex)) {
            Mex++;
        }

        return (Mex);
    }

// A function to Compute Grundy Number
// of 'n'. Only this function varies
// according to the game
    public static int calculateGrundy(int n, int[] pick, int size) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            // A Hash Table
            Set<Integer> Set = new HashSet<Integer>();
            for (int j = 0; j < size; j++) {
                if (i - pick[j] >= 0) {
                    Set.add(dp[i - pick[j]]);
                }
            }
            dp[i] = calculateMex(Set);
        }

        return dp[n];
    }

// Driver code
    public static void main(String[] args) {
        int n = 5;
        int[] pick = {1, 2, 3};
        int ans = calculateGrundy(n, pick, 3);
        if (ans > 0) {
            System.out.print("1st is winner");
        } else if (ans == 0) {
            System.out.print("2nd is winner");
        }

    }
}
