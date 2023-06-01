/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catalan;

/**
 *
 * @author krish
 */
public class Catalan {
    // A dynamic programming based function to find nth
    // Catalan number
    static int catalanDP(int n) {
        // Table to store results of subproblems
        int dp[] = new int[n + 2];

        // Initialize first two values in table
        dp[0] = 1;
        dp[1] = 1;

        // Fill entries in dp[]
        // using recursive formula
        for (int i = 2; i <= n; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        // Return last entry
        return dp[n];
    }

    // Driver code
    public static void main(String[] args) {
        System.out.print(catalanDP(3));
    }
}
