package menu;

import menu.MenuItem;
import menu.Sandwich;
import menu.Salad;
import menu.Drink;

//import java.util.Arrays; // for sorting

public class Trio implements MenuItem {
    
    Sandwich sandwich;
    Salad salad;
    Drink drink;

    public Trio(Sandwich sandwichIn, Salad saladIn, Drink drinkIn) {
        this.sandwich = sandwichIn;
        this.salad = saladIn;
        this.drink = drinkIn;
    }

    public String getName() {
        return sandwichIn.getName() + "/" + saladIn.getName() + "/" + drinkIn.getName() + " Trio";
    }

    public double getPrice() {
        double price;

        if (salad.getPrice() < drink.getPrice() && salad.getPrice() < sandwich.getPrice()) {
            price = drink.getPrice() + sandwich.getPrice();
        }

        else if (drink.getPrice() < salad.getPrice() && drink.getPrice() < sandwich.getPrice()) {
            price = salad.getPrice() + sandwich.getPrice();
        }

        else {
            price = salad.getPrice() + drink.getPrice();
        }

        //double[] arr = {sandwich.getPrice(), salad.getPrice(), drink.getPrice()};
        //Arrays.sort(arr);
        //return arr[1] + arr[2];

        return price;
    }

}
