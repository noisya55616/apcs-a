package shape;

import java.util.*;
import java.io.*;

import shape.TwoDShape;

public class Square extends TwoDShape {
    
    int length;

    public Square(int n, int l) {
        super(n); // We have to call the parent constructor
        length = l;
    }

    public double getArea() { // We have to define those abstract methods!
        return length * length;
    }

    public double getPerimeter() {
        return 4 * length;
    }
}
