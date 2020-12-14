package point;

import java.io.*; 
import java.util.*;
import point.Point;

public class Circle extends Point { // This is how you inherit from point.

    private int privR;

    public Circle(int x, int y, int r) {
        // We need to call the parent instructor!
        super(); // super is the parent object. We can access all of its attributes and methods!
        super.setX(x);
        super.setY(y);
        privR = r;
    }

    public Circle() {
        // We need to call the parent instructor!
        super();
        super.setX(0);
        super.setY(0);
        privR = 0;
    }

    //@Override
    public String toString() { // We don't have to rewrite everything...
        return super.toString() + " r: " + privR;
    }

    public double getArea() {
        return Math.PI * privR * privR;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Circle c1 = new Circle(10, 15, 10);

        System.out.println(c1.getArea());

        input.close();
    }
}