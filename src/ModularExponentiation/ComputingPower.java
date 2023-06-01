/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModularExponentiation;

/**
 *
 * @author krish
 */
public class ComputingPower {
    static int power(int x, int n)
	{
		if(n == 0)
			return 1;

		int temp = power(x, n/2);

		temp = temp * temp;

		if(n % 2 == 0)
			return temp;
		else
			return temp * x; 
	}

	public static void main (String[] args) {
		
		int x = 3, n = 5;

		System.out.println(power(x, n));

	}
}
