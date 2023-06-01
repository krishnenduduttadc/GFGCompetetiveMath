/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fib;

import java.util.ArrayList;

/**
 *
 * @author krish
 */
public class FibomodM {
    static int fibMod(int n, int m)
    {
        ArrayList<Integer> fib=new ArrayList<>();
        fib.add(0);
        fib.add(1);
        int pis=1;
        for(int i=2;i<m*m;i++)
        {
            fib.add(fib.get(i-1)+fib.get(i-2));
            if(fib.get(i)%m==1 && fib.get(i-1)%m==0){
                pis=i-1;
                break;
            }
        }
        return fib.get(n%pis)%m;
        
    }
	
	/* Driver program to test above function */
	public static void main(String[] args)
	{
		int n = 9 , m = 4;
		System.out.println(fibMod(n,m));
	}
}
