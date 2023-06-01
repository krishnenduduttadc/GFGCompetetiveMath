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
public class Exactly3Divisors {
    // Generates all primes upto n
	// and prints their squares
	static void numbersWith3Divisors(int n)
	{
		boolean[] prime = new boolean[n+1];
        int sr=(int)(Math.sqrt(n));
		for (int p = 2; p <= sr; p++)
		{
			
			// If prime[p] is not changed,
			// then it is a prime
			if (prime[p] == false)
			{
			    System.out.print((p*p)+" ");
				// Update all multiples of p
				for (int i=p*p; i<=sr; i += p)
					prime[i] = true;
			}
		}

	}
	
	// Driver program
	public static void main (String[] args)
	{
		int n = 50;
		numbersWith3Divisors(n);
	}
}
