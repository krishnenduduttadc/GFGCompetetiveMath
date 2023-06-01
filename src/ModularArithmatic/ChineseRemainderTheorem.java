/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModularArithmatic;

/**
 *
 * @author krish
 */
public class ChineseRemainderTheorem {
    // n is size of a[] and m[]. Returns the smallest
    // number res such that:
    // res % a[0] = a[0],
    // res % a[1] = a[1],
    // ..................
    // res % a[n-2] = a[n-1]
    // Assumption: Numbers in a[] are pairwise coprime
    // (gcd for every pair is 1)
    static int findMinX(int a[], int m[], int n) {
        int res = 1; // Initialize result

        // As per the Chinese remainder theorem,
        // this loop will always break.
        while (true) {
            // Check if remainder of res % m[j] is
            // a[i] or not (for all i from 0 to n-1)
            int i;
            for (i = 0; i < n; i++) {
                if (res % m[i] != a[i]) {
                    break;
                }
            }

            // If all remainders matched, we found res
            if (i == n) {
                break;
            }

            // Else try next numner
            res++;
        }
        return res;
    }

    // Driver method
    public static void main(String args[]) {
        int a[] = {2, 4, 1};
        int m[] = {3, 5, 2};
        int x = a.length;
        System.out.println("x is " + findMinX(a, m, x));
    }
}
