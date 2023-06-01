/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeFactorization;

/**
 *
 * @author krish
 */
public class SmallestPrimeFactor {

    public static void smallestPrimeFactor(int n) {
        // Create a vector to store least primes.
        // Initialize all entries as 0.
        int[] least_prime = new int[n + 1];
        // We need to print 1 for 1.
        System.out.print(1 + " ");
        for (int i = 2; i <= n; i++) {
            // least_prime[i] == 0
            // means it i is prime
            if (least_prime[i] == 0) {
                System.out.print(i + " ");
                // mark it as a divisor for all its
                // multiples if not already marked
                for (int j = i * i; j <= n; j += i) {
                    if (least_prime[j] == 0) {
                        least_prime[j] = i;
                    }
                }
            } else {
                System.out.print(least_prime[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        smallestPrimeFactor(n);
    }
}
