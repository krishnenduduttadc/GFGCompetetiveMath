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
public class ModInverse1toN {
   // Function to calculate modular
	// inverse using D.P
	static void modularInverse(int n, int m)
	{
		int inv[]=new int[n + 1];
		inv[0] = inv[1] = 1;
		System.out.print(inv[1] + " ");
		for (int i = 2; i <= n; i++)
		{
		    inv[i] = m -((m / i) *inv[m % i] ) % m;
			System.out.print(inv[i] + " ");
		}
	}

	// Driver Program
	public static void main(String args[])
	{
		int n = 5, prime = 13;
		modularInverse(n, prime);
	} 
}
