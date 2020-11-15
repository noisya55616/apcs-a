import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
    // Remove all instances of str2 from str1
	  Scanner input = new Scanner(System.in);
      String s1 = "xyz";
      String s2 = s1;
      String s3 = s2;

      System.out.println((s1 == s2) + " " + (s1 == s3));

      String str = "a";

      char ch = str.substring(0, 1);

      System.out.println(ch);
    
    input.close();
  }
}