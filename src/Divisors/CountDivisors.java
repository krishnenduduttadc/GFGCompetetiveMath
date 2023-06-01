/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Divisors;

/**
 *
 * @author krish
 */
public class CountDivisors {

    // function to count the divisors
    static int countDivisors(int n) {
        int res = 1;
        for (int i = 2; i * i <= n; i++) {
            int cnt = 0;
            while (n % i == 0) {
                n = n / i;
                cnt++;
            }
            res = res * (cnt + 1);
        }
        if (n >= 2) {
            res = res * 2;
        }
        return res;
    }

    /* Driver program to test above function */
    public static void main(String args[]) {
        int n = 72;
        System.out.println(countDivisors(n));
    }
}
