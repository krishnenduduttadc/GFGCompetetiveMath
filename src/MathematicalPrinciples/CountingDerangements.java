/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathematicalPrinciples;

/**
 *
 * @author krish
 */
public class CountingDerangements {
    // Function to count
	// derangements
	static int countDer(int n)
	{
		// Base cases
		if (n == 1) return 0;
		if (n == 2) return 1;
		
		// countDer(n) = (n-1)[countDer(n-1) + der(n-2)]
		return (n - 1) * (countDer(n - 1) +
						countDer(n - 2));
	}
	
	// Driver Code
	public static void main (String[] args)
	{
		int n = 4;
		System.out.println( "Count of Derangements is "
							+countDer(n));

	}
}
