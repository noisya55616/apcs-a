import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("What's your income? ");
    double income = input.nextDouble();
    System.out.print("What's your housing cost? ");
    double housingCost = input.nextDouble();
    System.out.print("How many children do you have? ");
    double children = input.nextDouble();
    System.out.print("How many children do you have in school? ");
    double schoolChildren = input.nextDouble();

    double tax = 0.0;
    
    if (housingCost >= 8000.0) {
        tax = income * 0.18;
    }
    
    else tax = (income - 10000.0) * 0.18;

    tax -= 500.0 * (children + schoolChildren); // additional 500 off for each school child, in essence

    if (tax >= 2000.0) tax = tax * 1.15;
    if (tax < 0 && housingCost >= 6000 && (children <= 2.0 || schoolChildren == 0.0)) {
        tax = 0.0;
    }

    if (tax >= 0.0) {
        System.out.println("You owe $" + tax + " in taxes");
    }

    else if (tax < 0) {
        System.out.println("You will get $" + (0 - tax) + " in refunds");
    }
	input.close();
  }
}