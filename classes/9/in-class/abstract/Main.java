import java.util.*;
import java.io.*;

import shape.*;

public class Main {

    public static void main(String args[]) {
        // TwoDShape s1 = new TwoDShape(10);
        // Fails, because TwoDShape is abstract. We can't instantiate it.

        Square s1 = new Square(4, 10);
        System.out.println("Area: " + s1.getArea() + "\tPerimeter: " + s1.getPerimeter());
        System.out.println(s1); // This will print the .toString() from TwoDShape!
        // toString() isn't overwritten in the child class and isn't abstract.

        TwoDShape s2 = new Square(4, 10);
        // This works because we aren't instantiating an abstract class: we are still
        // instantiating a square, which is perfectly fine.
        System.out.println("Area: " + s2.getArea() + "\tPerimeter: " + s2.getPerimeter());
        System.out.println(s2);

        Triangle t1 = new Triangle(3, 0, 0, 3, 0, 0, 4);
        System.out.println("Area: " + t1.getArea() + "\tPerimeter: " + t1.getPerimeter());
        System.out.println(t1);

    }

}