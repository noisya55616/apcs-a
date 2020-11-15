import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
    // Remove all instances of str2 from str1
	  Scanner input = new Scanner(System.in);
    String str1 = input.nextLine();
    String str2 = input.nextLine();

    while (str1.indexOf(str2) != -1) {
        str1 = str1.substring(0, str1.indexOf(str2)) + str1.substring(str1.indexOf(str2) + str2.length(), str1.length());
    }

    System.out.println(str1);
    
    input.close();
  }
}