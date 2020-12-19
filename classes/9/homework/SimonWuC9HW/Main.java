import java.io.*;
import java.util.*;
import menu.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Sandwich blt = new Sandwich("BLT", 5.50);
        Salad caesar = new Salad("Caesar Salad", 4.25);
        Drink coke = new Drink("Coca-Cola", 3.50);

        Trio lunch = new Trio(blt, caesar, coke);

        System.out.print("For lunch, I'm getting the " + lunch.getName() + ", which costs $" + lunch.getPrice() + ".");

        input.close();
    }
}
