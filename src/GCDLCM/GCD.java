/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GCDLCM;

/**
 *
 * @author krish
 */
public class GCD {
    // Recursive function to return gcd of a and b
	static int gcd(int a, int b)
	{
		// Everything divides 0
		if (a == 0)
		return b;
		if (b == 0)
		return a;
	
		// base case
		if (a == b)
			return a;
	
		// a is greater
		if (a > b)
			return gcd(a-b, b);
		return gcd(a, b-a);
	}
	
	// Driver method
	public static void main(String[] args)
	{
		int a = 12, b = 15;
		System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
	}
}
