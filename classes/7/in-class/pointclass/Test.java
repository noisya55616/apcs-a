import java.io.*; 
import java.util.*;
import point.*;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Circle c1 = new Circle(10, 15, 10);

        System.out.println(c1);

        System.out.println(c1.getArea());


        Point c2 = new Circle(10, 15, 10);
        // Just like how you can convert from int to double but not from double to int,
        // you can define a point as a circle, and it will work just fine.

        input.close();
    }
}