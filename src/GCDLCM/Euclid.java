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
public class Euclid {
    static int gcd(int a, int b)
	{
	if (b == 0)
		return a;
	return gcd(b, a % b);
	}
	
	// Driver method
	public static void main(String[] args)
	{
		int a = 12, b = 15;
		System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
	}
}
