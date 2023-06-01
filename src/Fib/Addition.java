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
public class Addition {
    static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        //Addition
        //Fm+n=FmFn+1+Fm-1Fn;
        int m=3;
        int n=2;
        double fmplusn=fib(3+2);
        double fmnplus1=fib(m)*fib(n+1);
        double fmminus1n=fib(m-1)*fib(n);
        System.out.println(""+fmplusn);
        System.out.println(fmminus1n+fmminus1n);
    }
}
