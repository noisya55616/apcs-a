import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
    double n = input.nextInt();
    double result = ( 1 / Math.sqrt( 5 ) ) * ( Math.pow( ( 1 + Math.sqrt( 5 ) ) / 2, n ) - Math.pow( ( 1 - Math.sqrt( 5 ) ) / 2, n ));
    System.out.println(Math.round(result));
  }
}