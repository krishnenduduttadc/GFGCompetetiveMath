/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberTheory;

/**
 *
 * @author krish
 */
public class EularTotientEfficient {
    static int phi(int n)
	{
		// Initialize result as n
		int result = n;

		// Consider all prime factors of n and for
		// every prime factor p, multiply result
		// with (1 - 1/p)
		for (int p = 2; p * p <= n; ++p) {
			// Check if p is a prime factor.
			if (result % p == 0) {
				// If yes, then update n and result
				while (n % p == 0)
					n /= p;
				result = result - result/p ;
			}
		}

		// If n has a prime factor greater than sqrt(n)
		// (There can be at-most one such prime factor)
		if (n > 1)
			result = result = result - result/n;

		return result;
	}

	// Driver program to test above function
	public static void main(String args[])
	{
		int n=24;
			System.out.println("phi(" + n + ") = " + phi(n));
	}
}
