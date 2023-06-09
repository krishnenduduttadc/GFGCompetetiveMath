/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GCDLCM;

/**
 *
 * @author krish
 */
public class LinearDeophantine {

    static int x, y;

// Function to implement the extended
// euclid algorithm
    static int gcd_extend(int a, int b) {

        // Base Case
        if (b == 0) {
            x = 1;
            y = 0;
            return a;
        } // Recursively find the gcd
        else {
            int g = gcd_extend(b, a % b);
            int x1 = x, y1 = y;
            x = y1;
            y = x1 - (a / b) * y1;
            return g;
        }
    }

// Function to print the solutions of
// the given equations ax + by = c
    static void print_solution(int a, int b, int c) {
        if (a == 0 && b == 0) {

            // Condition for infinite solutions
            if (c == 0) {
                System.out.print("Infinite Solutions "
                        + "Exist" + "\n");
            } // Condition for no solutions exist
            else {
                System.out.print("No Solution exists"
                        + "\n");
            }
        }
        int gcd = gcd_extend(a, b);

        // Condition for no solutions exist
        if (c % gcd != 0) {
            System.out.print("No Solution exists" + "\n");
        } else {

            // Print the solution
            System.out.print("x = " + x * (c / gcd)
                    + ", y = " + y * (c / gcd) + "\n");
        }
    }

// Driver Code
    public static void main(String[] args) {
        int a, b, c;

        // Given coefficients
        a = 4;
        b = 18;
        c = 10;

        // Function Call
        print_solution(a, b, c);
    }
}
