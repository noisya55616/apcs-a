import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int m = input.nextInt(); int n = input.nextInt();
    String output = "The GCD of " + m + " and " + n + " is ";
    
    while (n > 0) {
        int temp = m % n;
        m = n;
        n = temp;
    }

    System.out.println(output + m);

	input.close();
  }
}