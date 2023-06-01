/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameTheory;

/**
 *
 * @author krish
 */
public class CompositeGames {

    static int calculateGrundy(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 3;
        } else {
            return (n % (3 + 1));
        }
    }

    static void findWinner(int n1, int n2) {

        if (calculateGrundy(n1) == calculateGrundy(n2)) {
            System.out.println("2nd is winner");
        } else {
            System.out.println("1st is winner");
        }
    }

// Driver code
    public static void main(String[] args) {
        int n1 = 1, n2 = 5;
        findWinner(n1, n2);
    }
}
