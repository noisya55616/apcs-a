import java.io.*; 
import java.util.*; 

public class Alternate {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int m = input.nextInt();
    int n = input.nextInt();
    
    for (int i = m; i <= n; i++) {
      boolean prime = (i != 1);

      int j = 2;

      while (j <= Math.sqrt(i) && prime) {
        prime = (i % j != 0);
        j++;
      }

      if (prime) System.out.print(i + " ");

    }

	input.close();
  }
}