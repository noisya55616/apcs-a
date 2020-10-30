import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();

	double discriminant = Math.sqrt(b * b - 4 * a * c);
	System.out.println((0 - b + discriminant) / (2 * a) + " " + (0 - b - discriminant) / (2 * a));
  }
}