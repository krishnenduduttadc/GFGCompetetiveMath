/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bits;

/**
 *
 * @author krish
 */
public class PowerOfTwo {

    static boolean isPow2(int n) {
        if (n == 0) {
            return true;
        }

        return ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {

        int n = 4;
        System.out.println(isPow2(n));
    }
}
