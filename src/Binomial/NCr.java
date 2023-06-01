/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binomial;

/**
 *
 * @author krish
 */
public class NCr {

    static int nCr(int n, int r) {
        int[] dp = new int[r + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, r); j > 0; j--) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[r];
    }

// Driver code
    public static void main(String[] args) {
        int n = 5, r = 3;
        System.out.println(nCr(n, r));
    }
}
