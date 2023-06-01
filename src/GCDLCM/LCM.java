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
public class LCM {
    // Recursive method to return gcd of a and b
	static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
	
	// method to return LCM of two numbers
	static int lcm(int a, int b)
	{
		return (a / gcd(a, b)) * b;
	}
	
	// Driver method
	public static void main(String[] args)
	{
		int a = 4, b = 6;
		System.out.println("LCM of " + a +
						" and " + b +
					" is " + lcm(a, b));
	}
}
