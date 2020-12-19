package shape;

import java.util.*;
import java.io.*;

import shape.TwoDShape;

public class Triangle extends TwoDShape {

    int ax, ay, bx, by, cx, cy;
    
    public Triangle(int n, int axIn, int ayIn, int bxIn, int byIn, int cxIn, int cyIn) {
        super(n);
        ax = axIn;
        ay = ayIn;
        bx = bxIn;
        by = byIn;
        cx = cxIn;
        cy = cyIn;
    }

    public double getArea() {
        double out;

        double dx1 = ax - bx;
        double dy1 = ay - by;

        double dx2 = ax - cx;
        double dy2 = ay - cy;

        double dx3 = cx - bx;
        double dy3 = cy - by;

        double a = Math.sqrt(dx1 * dx1 + dy1 * dy1);
        double b = Math.sqrt(dx2 * dx2 + dy2 * dy2);
        double c = Math.sqrt(dx3 * dx3 + dy3 * dy3);

        double s = (a + b + c) / 2;

        out = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return out;
    }

    public double getPerimeter() {
        double dx1 = ax - bx;
        double dy1 = ay - by;

        double dx2 = ax - cx;
        double dy2 = ay - cy;

        double dx3 = cx - bx;
        double dy3 = cy - by;

        double a = Math.sqrt(dx1 * dx1 + dy1 * dy1);
        double b = Math.sqrt(dx2 * dx2 + dy2 * dy2);
        double c = Math.sqrt(dx3 * dx3 + dy3 * dy3);

        return a + b + c;
    }
}
