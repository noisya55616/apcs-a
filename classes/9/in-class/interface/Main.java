import java.util.*;
import java.io.*;

import vehicle.*;

public class Main {

    public static void main(String args[]) {
        // You can't create an instance of an interface!
        // Vehicle v1 = new Vehicle();

        Sedan s1 = new Sedan(2000, 20000, 100); // year, price, tank capacity
        Vehicle v2 = new Sedan(2020, 55000, 70); // As with abstracts, we can declare a sedan
        System.out.println("s1 will have a mileage of " + s1.getMileage());
        System.out.println("v2 will have a mileage of " + v2.getMileage());
    }

}