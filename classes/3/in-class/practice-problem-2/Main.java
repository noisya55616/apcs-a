import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    boolean prime = true;

    for (int i = 2; i < Math.ceil(Math.sqrt(n)); i++) {
        if (n % i == 0) prime = false;
    }

    if (n == 1) prime = false;

    if (prime) {
        System.out.println("Prime");
    }

    else System.out.println("Not a prime");

	input.close();
  }
}