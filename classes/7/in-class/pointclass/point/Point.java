package point;

import java.io.*; 
import java.util.*;

public class Point {
    
    // The first step: defining attributes

    public int pubX, pubY;

    private int privX, privY; // Protected members!

    public Point(int x, int y) { // Constructors! This will set the values on creation.
        privX = x;
        privY = y;
    }

    public Point() {
        privX = 0; privY = 0;
    }

    public void setX(int x) { // We can have setter methods that will change the values indirectly!
        privX = x;
    }

    public void setY(int y) {
        privY = y;
    }

    public int getX() {
        return privX;
    }

    public int getY() {
        return privY;
    }

    public String toString() {
        return "x: " + privX + " y: " + privY;
    }

    public void translate(int dx, int dy) {
        privX += dx; privY += dy;
    }

    public double getDistance(Point P) {
        double distance;

        double dx = P.privX - this.privX; // This refers to the instance's x and y values.
        double dy = P.privY - this.privY;

        distance = Math.sqrt(dx * dx + dy * dy);

        return distance;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // calling an integer array:
        // int[] arr = new int[5];
        
        Point p1 = new Point(30, 40); // The new keyword instantiates a new point.
        p1.pubX = 10; p1.pubY = 20;   // We can now access the attributes and methods of the object.
        
        System.out.println(p1.pubX + " " + p1.pubY); // note we are using the public ones

        // pubX and pubY are public and modifiable!
        // However, you don't want to always let this happen directly!

        // You can cut off direct access to variables while still letting methods change them!
        // think about .set() and .get() methods!

        p1.setX(50); p1.setY(100);

        System.out.println(p1.getX() + " " + p1.getY()); // We cannot access privX and Y directly, but only through get and set.

        // Now, let's try something weird.

        System.out.println(p1.toString()); // How does this work?

        // Every custom object in Java has a parent object called Object.
        // Object has a .toString() method that can be accessed by any child object!
        // However, it can be overwritten.

        Point p2 = new Point(15, 25);

        System.out.println(p2); // This prints the output of .toString()!

        // Java does this by default if you call the object without anything after it.
        // We saw this with ArrayList!

        p2.translate(10, 20); // Example of calling a method from the object.

        System.out.println(p2);

        Point f1 = new Point(3, 4);
        Point f2 = new Point(); // initialized to 0, 0

        System.out.println(f1.getDistance(f2));
        
        input.close();
    }

}
