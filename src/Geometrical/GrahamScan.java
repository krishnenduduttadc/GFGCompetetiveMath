/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometrical;

import java.util.*;
import java.util.Comparator;

/**
 *
 * @author krish
 */
public class GrahamScan {
    // To find orientation of ordered triplet (p, q, r).
    // The function returns following values
    // 0 --> p, q and r are colinear
    // >0 --> Clockwise
    // <0 --> Counterclockwise
    public static int orientation(Point p, Point q, Point r) {
        int val = (q.y - p.y) * (r.x - q.x)
                - (q.x - p.x) * (r.y - q.y);

        return val;
    }

    // Prints convex hull of a set of n points.
    public static void convexHull(Point arr[], int n) {
        if (n < 3) {
            return;
        }

        int b = 0;
        for (int i = 1; i < n; i++) {
            int y = arr[i].y;
            if (y < arr[b].y || (y == arr[b].y && arr[i].x < arr[b].x)) {
                b = i;
            }
        }
        Point temp = arr[0];
        arr[0] = arr[b];
        arr[b] = temp;
        PointsComparator.p0 = arr[0];
        Arrays.sort(arr, new PointsComparator());
        ArrayList<Point> s = new ArrayList<>();
        s.add(arr[0]);
        s.add(arr[1]);
        for (int i = 2; i < n; i++) {
            while (s.size() >= 2 && orientation(s.get(s.size() - 2), s.get(s.size() - 1), arr[i]) >= 0) {
                s.remove(s.size() - 1);
            }
            s.add(arr[i]);
        }

        for (Point p : s) {
            System.out.println(p.x + " " + p.y);
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args) {

        Point points[] = new Point[5];
        points[0] = new Point(5, 0);
        points[1] = new Point(1, 1);
        points[2] = new Point(3, 2);
        points[3] = new Point(0, -1);
        points[4] = new Point(0, 5);

        int n = points.length;
        convexHull(points, n);

    }
}

class PointsComparator implements Comparator<Point> {

    static Point p0;

    public static int orientation(Point p, Point q, Point r) {
        int val = (q.y - p.y) * (r.x - q.x)
                - (q.x - p.x) * (r.y - q.y);
        return val;
    }

    public int compare(Point p1, Point p2) {
        return orientation(p0, p1, p2);
    }
}
