import java.io.*; 
import java.util.*; 
// import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Making a scanner object

    int age = input.nextInt(); // This interprets input as integer.

    double hst = input.nextDouble(); // This interprets input as doubles.

    String name = input.next(); // This is how you take in input as pure string,

    System.out.println("You are " + age + " years old, the Harmonized Sales Tax is " + hst + " and your name is " + name + ".");

    input.close();
  }
}