import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    // The for loop.

    for (int i = 0; i < n; i++) {
    /*
        The first initialization is just an initialization (in scope of for loop).
        The second statement is a condition, and the final statement is something
        that runs after every iteration of the loop. The for loop stops once the
        condition stops being met.
    */
        System.out.print(i + "\t");
    }

    System.out.print("\n");

    int k = 6;

    for ( k = 4; k < 8; k++ ){
      System.out.print( k + " ");
    }
    System.out.println( k );

    // The while loop.

	input.close();
  }
}