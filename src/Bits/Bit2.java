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
public class Bit2 {

    /* Driver program to test above function */
    public static void main(String[] args) {
        int a = 10, b = 14;

        // left shift  
        System.out.println(a << 1);
        System.out.println(a << 2);
        System.out.println(a << 4);

        // right shift
        System.out.println(a >> 1);
        System.out.println(a >> 2);
        System.out.println(a >> 4);

        // negation Operator
        System.out.println(~a);
        System.out.println(~b);
    }
}
