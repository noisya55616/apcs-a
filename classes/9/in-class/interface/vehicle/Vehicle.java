package vehicle;

import java.util.*;
import java.io.*;

public interface Vehicle {

    // Every vehicle has mileage, a price
    final double rate = 0.15; // This is a constant, the depreciation rate.
    public double getMileage();
    public double getPrice();
    public boolean hasBackUpCamera();
    // This is an interface: there are no constructors
    // or instance variables. It CAN have constants.
    // The interface can't have any methods with a body!

}