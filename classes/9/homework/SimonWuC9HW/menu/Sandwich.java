package menu;

import menu.MenuItem;

public class Sandwich implements MenuItem {
    String name;
    double price;

    public Sandwich(String n, double p) {
        name = n; price = p;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
