import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    String name = input.nextLine();

    System.out.print(name.substring(0, 1) + " ");

    name = name.substring(name.indexOf(" ") + 1, name.length());

    System.out.print(name.substring(0, 1) + " ");

    name = name.substring(name.indexOf(" ") + 1, name.length());

    System.out.print(name.substring(0, 1) + "\n");
    
    input.close();
  }
}