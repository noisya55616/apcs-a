import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int sum = 0;

    while (n > 0) {
        sum += n % 10;
        n = (n - n % 10) / 10;
    }

    System.out.println(sum);

	input.close();
  }
}