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
public class AllDivisors {

    static void printDivisors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        int n = 25;

        printDivisors(n);

    }
}
