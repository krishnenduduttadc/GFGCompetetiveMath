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
public class SumOfDivisors {
     static int MAXN = 10001;
    static int[] least_prime = new int[MAXN];

    static void leastPrimeFactor()
    {
 
        least_prime[1] = 1;
 
        for (int i = 2; i < MAXN; i++)
        {
             
            // least_prime[i] == 0
            // means it i is prime
            if (least_prime[i] == 0)
            {
                 
                // marking the prime number
                // as its own lpf
                least_prime[i] = i;
 
                // mark it as a divisor for all its
                // multiples if not already marked
                for (int j = i*i; j < MAXN; j += i)
                    if (least_prime[j] == 0)
                        least_prime[j] = i;
            }
        }
 
    }

	static int query(int n)
	{
	    int res=1,prev = least_prime[n];
	    int term = prev,sum= 1+prev;
	    n= n/prev;
	    while(n>1)
	    {
	        if(least_prime[n]==prev)
	        {
	            term = term*prev;
	            sum = sum+term;
	        }
	        else
	        {
	            prev = least_prime[n];
	            res = res * sum;
	            term = prev;
	            sum = 1+ term;
	        }
	        n = n/prev;
	    }
	    res=res*sum;
	    return res;
	}
	
	// Driver Code
	public static void main (String[] args)
	{
	    leastPrimeFactor();
		int n = 72;
		System.out.println(query(n));
	
	}
}
