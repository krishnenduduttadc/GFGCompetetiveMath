/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeFactorization;

import java.util.Scanner;

/**
 *
 * @author krish
 */
public class PrimeFactorsMultileQueries {
    static final int MAXN = 100001;
	
	// stores smallest prime factor for every number
	static int spf[] = new int[MAXN];
	
	// Calculating SPF (Smallest Prime Factor) for every
	// number till MAXN.
	// Time Complexity : O(nloglogn)
	static void sieve()
	{
		spf[1] = 1;
		for (int i=2; i<MAXN; i++)
	
			// marking smallest prime factor for every
			// number to be itself.
			spf[i] = i;
	
		// separately marking spf for every even
		// number as 2
		for (int i=4; i<MAXN; i+=2)
			spf[i] = 2;
	
		for (int i=3; i*i<MAXN; i++)
		{
			// checking if i is prime
			if (spf[i] == i)
			{
				// marking SPF for all numbers divisible by i
				for (int j=i*i; j<MAXN; j+=i)
	
					// marking spf[j] if it is not
					// previously marked
					if (spf[j]==j)
						spf[j] = i;
			}
		}
	}
	
	// A O(log n) function printing primefactorization
	// by dividing by smallest prime factor at every step
	static void getFactorization(int x)
	{
		while (x != 1)
		{
			System.out.print(spf[x]+" ");
			x = x / spf[x];
		}
	}
	
	// Driver method
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		// precalculating Smallest Prime Factor
		sieve();
		int q=sc.nextInt();
		for(int i=1;i<=q;i++)
		{
		    int x=sc.nextInt();
		    System.out.print("prime factorization for " + x + " : ");
		    getFactorization(x);
		    System.out.println();
		}
	}
}
