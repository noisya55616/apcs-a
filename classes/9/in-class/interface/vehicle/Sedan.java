package vehicle;

import java.util.*;
import java.io.*;

import vehicle.Vehicle;

public class Sedan implements Vehicle {

    int year; // year of manufacture
    double price; // purchase price
    int tank; // tank capacity

    public Sedan(int y, double p, int t) {
        year = y;
        price = p;
        tank = t;
    }

    // All we need to do to actually make this class is define the methods.
    public double getMileage() {
        return tank / 10.0 * 100;
        // Imagine that it gets 100KM every 10 liters.
    }
    public double getPrice() {
        return price;
    }
    public boolean hasBackUpCamera() {
        return false;
    }

    // We can have our own methods, too.
    public String toString() {
        return "Year: " + year + " Price: " + price + " Tank capacity: " + tank;
    }
}