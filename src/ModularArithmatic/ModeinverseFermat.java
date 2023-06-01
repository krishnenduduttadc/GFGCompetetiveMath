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
public class ModeinverseFermat {
   // Function to find modular inverse of a
	// under modulo m Assumption: m is prime
	static void modInverse(int a, int m)
	{
		if (a%m == 0)
			System.out.println("Inverse doesn't exist");
		else
		{
			// If a and m are relatively prime, then modulo
			// inverse is a^(m-2) mode m
			System.out.println(
				"Modular multiplicative inverse is "
				+ power(a, m - 2, m));
		}
	}

	static int power(int x, int y, int m)
	{
		if (y == 0)
			return 1;
		int p = power(x, y / 2, m) % m;
		p = (int)((p * (long)p) % m);
		if (y % 2 == 0)
			return p;
		else
			return (int)((x * (long)p) % m);
	}

	// Driver Code
	public static void main(String args[])
	{
		int a = 3, m = 5;
		
		// Function call
		modInverse(a, m);
	} 
}
