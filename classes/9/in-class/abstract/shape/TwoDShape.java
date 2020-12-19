package shape;

import java.util.*;
import java.io.*;

public abstract class TwoDShape {

    int side;

    public TwoDShape(int n) {
        side = n;
    }

    public abstract double getArea(); // This abstract keyword means that we don't define anything by default: this is defined later.
    public abstract double getPerimeter();

    public String toString() {
        return "Number of sides: " + side;
    }

}