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
public class Catalan2 {

    static int MAXN = 10001;
    static int mod = 1000000007;
    static int[] dp = new int[MAXN];

    // A dynamic programming based function to precompute
    // Catalan numbers
    static void preCompute() {
        dp[0] = 1;
        for (int i = 1; i < MAXN; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] = (dp[i] + dp[j] * dp[i - j - 1] % mod);
                if (dp[i] >= mod) {
                    dp[i] = dp[i] - mod;
                }
            }
        }

    }

    // Driver code
    public static void main(String[] args) {
        preCompute();
        for (int i = 1; i <= 25; i++) {
            System.out.println(dp[i]);
        }
    }
}
