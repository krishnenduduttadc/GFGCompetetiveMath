/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModularArithmatic;

/**
 *
 * @author krish
 */
public class CRT {
    // Returns modulo inverse of a
    // with respect to m using extended
    // Euclid Algorithm.
    static int modInv(int a, int m) {
        int m0 = m, t, q;
        int x0 = 0, x1 = 1;

        if (m == 1) {
            return 0;
        }

        // Apply extended Euclid Algorithm
        while (a > 1) {
            // q is quotient
            q = a / m;

            t = m;

            // m is remainder now, process
            // same as euclid's algo
            m = a % m;
            a = t;

            t = x0;

            x0 = x1 - q * x0;

            x1 = t;
        }

        // Make x1 positive
        if (x1 < 0) {
            x1 += m0;
        }

        return x1;
    }

    // n is size of a[] and m[].
    // Returns the smallest number
    // x such that:
    // x % a[0] = m[0],
    // x % a[1] = m[1],
    // ..................
    // x % a[k-2] = m[k-1]
    // Assumption: Numbers in a[] are pairwise
    // coprime (gcd for every pair is 1)
    static int findMinX(int a[], int m[], int n) {
        // Compute product of all numbers
        int prod = 1;
        for (int i = 0; i < n; i++) {
            prod *= m[i];
        }

        // Initialize result
        int result = 0;

        // Apply above formula
        for (int i = 0; i < n; i++) {
            int pi = prod / m[i];
            int inv = modInv(pi, m[i]);
            int term = (pi * inv * a[i]) % prod;
            result = (result + term) % prod;
        }

        return result;
    }

    // Driver method
    public static void main(String args[]) {
        int a[] = {4, 2};
        int m[] = {5, 7};
        int n = a.length;
        System.out.println("x is " + findMinX(a, m, n));
    }
}
