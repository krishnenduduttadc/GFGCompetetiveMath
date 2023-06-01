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
public class Cassini {

    static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("" + fib(3));
        System.out.println("" + fib(5));
        System.out.println("" + fib(4));

        //Cassini
        //Fn+1*Fn-1-Fn^2=(-1)^n;
        double nplusone = fib(5);
        double nminusone = fib(3);
        double nsqr = Math.pow(fib(4), 2);
        double res=Math.pow(-1,4);
        double result = nplusone * nminusone - nsqr;
        System.out.println("" + result);
        System.out.println("" + res);
    }
}
