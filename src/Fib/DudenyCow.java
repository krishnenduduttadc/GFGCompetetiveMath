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
public class DudenyCow {
    static int count(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return count(n - 1) + count(n - 2);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("No of cows in 6th year "+count(6));
    }
 
}
