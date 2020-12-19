package menu;

import menu.MenuItem;
import menu.Sandwich;
import menu.Salad;
import menu.Drink;

public class Trio implements MenuItem {
    
    String name;
    double price;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {

        name = sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
        
        if (salad.getPrice() < drink.getPrice() && salad.getPrice() < sandwich.getPrice()) {
            price = drink.getPrice() + sandwich.getPrice();
        }

        else if (drink.getPrice() < salad.getPrice() && drink.getPrice() < sandwich.getPrice()) {
            price = salad.getPrice() + sandwich.getPrice();
        }

        else {
            price = salad.getPrice() + drink.getPrice();
        }

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
