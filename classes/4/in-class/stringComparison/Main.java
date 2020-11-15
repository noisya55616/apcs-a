import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    
    String str1 = "Apple";
    String str2 = "Boy";
    String str3 = "Apple";

    // Comparing 2 strings for equality

    if (str1.equals(str3)) {
        System.out.println(str1 + " is the same as " + str3);
    }

    if (!str1.equals(str2)) {
        System.out.println(str1 + " isn't the same as " + str2);
    }

    // The CompareTo method

    if (str1.compareTo(str3) == 0) { // You will get 0 only if the ASCII values of every single character are the same
        System.out.println(str1 + " is at the same place in alphabetical order as " + str3);
    }

    if (str1.compareTo(str2) < 0) { // It will make this decision based on the first characters in the strings that are different.
        System.out.println(str1 + " is earlier in alphabetical order than " + str2);
    }

    if (str2.compareTo(str3) > 0) {
        System.out.println(str2 + " is later in alphabetical order as " + str3);
    }

    input.close();
  }
}