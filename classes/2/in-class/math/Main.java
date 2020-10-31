import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Addition
    System.out.println(2 + 4); // 6

    // Subtraction
    System.out.println(6 - 4); // 2

    // Multiplication
    System.out.println(6 * 4); // 24

    // Division
    System.out.println(10 / 2); // 5

    // Division, but weird
    System.out.println(10 / 3); // 3. Java always truncates decimals for integers.

    // To get decimal points, you need to use decimal points explicitly to make the numbers represented as double.
    System.out.println(10.0 / 3.0);

    // Now, we start to use the Math library.

    // Square roots: the result of the sqrt function is always a double.
    System.out.println(Math.sqrt(16)); // 4.0: This will be a double: you can always typecast to get integers.

    // This is typecasting a double to an integer.
    System.out.println((int) Math.sqrt(16)); // 4

    // Powers: the second argument is the exponent. This returns a double.
    System.out.println(Math.pow(2, 3)); // 8.0

    // Ceiling function. This returns a double.
    System.out.println(Math.ceil(13.4)); // 14: This always goes up.

    // Floor function. This returns a double.
    System.out.println(Math.floor(13.4)); // 13: This goes down, always.

    input.close();
  }
}