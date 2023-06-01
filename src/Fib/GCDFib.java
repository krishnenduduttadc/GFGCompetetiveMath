/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fib;

/**
 *
 * @author krish
 */
public class GCDFib {
    static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    
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
    
    public static void main(String[] args) {
        //GCD(Fm,Fn)=Fgcd(m,n);
        int m=5;
        int n=4;
        double left=gcd(fib(m),fib(n));
        System.out.println(""+left);
        
        double right=fib(gcd(m,n));
        System.out.println(""+right);
        
    }
}
