import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int intM = input.nextInt();
    
    System.out.println("Meter: " + intM / 100 + "\nCentimeter: " + intM % 100); // Rely on the truncation from int
    input.close();
  }
}