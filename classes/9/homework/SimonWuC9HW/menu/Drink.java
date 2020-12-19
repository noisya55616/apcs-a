package menu;

import menu.MenuItem;

public class Drink implements MenuItem {
    
    String name;
    double price;

    public Drink(String n, double p) {
        name = n; price = p;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
