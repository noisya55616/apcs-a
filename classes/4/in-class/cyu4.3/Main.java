import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
    // Remove all instances of str2 from str1
	Scanner input = new Scanner(System.in);
    String str1 = input.nextLine();

    while (str1.indexOf(" ") != -1) {
        System.out.println(str1.substring(0, str1.indexOf(" ")));
        str1 = str1.substring(str1.indexOf(" ") + 1, str1.length());
    }

    System.out.println(str1);
    
    input.close();
  }
}