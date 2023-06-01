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
public class Binary2Gray {

    public static int greyConverter(int n) {
        return n ^ (n >> 1);
    }

    // Driver code
    public static void main(String[] args) {
        int n = 14;
        System.out.println(greyConverter(n));

        n = 9;
        System.out.println(greyConverter(n));
    }
}
