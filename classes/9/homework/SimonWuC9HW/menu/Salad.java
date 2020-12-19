package menu;

import menu.MenuItem;

public class Salad implements MenuItem {
    
    String name;
    double price;

    public Salad(String n, double p) {
        name = n; price = p;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
