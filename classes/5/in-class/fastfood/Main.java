import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int burgerCal[] = {461, 431, 430, 0};

    int sideCal[] = {100, 57, 70, 0};

    int drinkCal[] = {130, 160, 118, 0};

    int dessertCal[] = {167, 266, 75, 0};

    int burger = input.nextInt() - 1;

    int side = input.nextInt() - 1;

    int drink = input.nextInt() - 1;

    int dessert = input.nextInt() - 1;

    int total = burgerCal[burger] + sideCal[side] + drinkCal[drink] + dessertCal[dessert];

    System.out.println("Your total Calorie count is " + total + ".");

    input.close();
  }
}