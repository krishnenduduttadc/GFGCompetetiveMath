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
public class Combination {

    static int nCr(int n, int r) {
        int res = 1;
        for (int i = n; i >= (n - r + 1); i--) {
            res = res * i;
        }
        for (int i = 2; i <= r; i++) {
            res = res / i;
        }
        return res;
    }

// Driver code
    public static void main(String[] args) {
        int n = 5, r = 2;
        System.out.println(nCr(n, r));
    }
}
