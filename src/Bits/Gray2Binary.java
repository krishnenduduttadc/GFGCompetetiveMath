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
public class Gray2Binary {

    public static int binaryConverter(int n) {
        int res = 0;
        while (n > 0) {
            res ^= n;
            n >>= 1;
        }
        return res;
    }

    // Driver code
    public static void main(String[] args) {
        int n = 9;
        System.out.println(binaryConverter(n));
    }
}
