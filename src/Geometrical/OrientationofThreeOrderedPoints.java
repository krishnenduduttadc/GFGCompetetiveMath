/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometrical;

/**
 *
 * @author krish
 */
class Point {

    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class OrientationofThreeOrderedPoints {

    public static int orientation(Point p1, Point p2, Point p3) {
        int val = (p2.y - p1.y) * (p3.x - p2.x)
                - (p2.x - p1.x) * (p3.y - p2.y);

        return val;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(1, 2);

        int o = orientation(p1, p2, p3);

        if (o == 0) {
            System.out.print("Linear");
        } else if (o > 0) {
            System.out.print("Clockwise");
        } else {
            System.out.print("CounterClockwise");
        }

    }
}
