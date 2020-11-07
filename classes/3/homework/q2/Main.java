import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    
    int j = 2;

    while (n != 1 && j <= n) {
        if (n % j == 0) {
            System.out.print(j + " ");
            n /= j;
        }
        else j++;
    }

	input.close();
  }
}