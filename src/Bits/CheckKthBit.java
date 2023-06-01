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
public class CheckKthBit {

    public static void isKthBitSet(int n,
            int k) {
        if ((n & (1 << (k - 1))) == 1) {
            System.out.print("SET");
        } else {
            System.out.print("NOT SET");
        }
    }

    // driver code 
    public static void main(String[] args) {
        int n = 5, k = 1;
        isKthBitSet(n, k);
    }
}
