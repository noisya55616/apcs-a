import java.io.*; 
import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (4 >= 3) 
            System.out.println("4 at least as big as 3"); // Greater than or equal to
            System.out.println("4 at least as big as 3");

        if (4 >= 3 && 10 < 20) { // You can link expressions, of course. This is greater than (not equal)
            System.out.println("4 is at least as big as 3, and 10 is less than 20");
        }

        int a = 10;

        if ( a > 10 && a < 20 ) {
            a = 2 * a;
            System.out.println( a );
        }
        else
            a--;
            System.out.println( a );
    }
}