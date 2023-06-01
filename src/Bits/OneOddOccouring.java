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
public class OneOddOccouring {

    static int findOdd(int arr[], int n) {
        int res = 0;

        for (int i = 0; i < n; i++) {
            res = res ^ arr[i];
        }

        return res;
    }

    public static void main(String[] args) {

        int arr[] = {4, 3, 4, 4, 4, 5, 5, 3, 3}, n = 9;

        System.out.println(findOdd(arr, n));
    }
}
