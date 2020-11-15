import java.io.*; 
import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // String declarations

        String str1 = "Stephen";
        String str2 = "Stephen Harper";
        
        // Characters: single characters only, and declared with single quotes

        char x1 = 'a';

        // Allowed methods

        System.out.println(str1.length());

        System.out.println(str1.charAt(3)); // BANNED. Strings are 0-indexed, so the first character is indexed at 0.

        System.out.println(str1.indexOf('e')); // Returns the index of the character.

        System.out.println(str1.indexOf('y')); // It will return a -1 if the character doesn't exist in the string.

        System.out.println(str1.substring(2)); // From 2 to the end.

        System.out.println(str2.substring(3, 7)); // From index 3 to 7 - 1. IT STOPS BEFORE THE LAST ENDINDEX.

        System.out.println(str1.toUpperCase());

        System.out.println(str2.toLowerCase());

        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.substring(i, i+1));
        }

        input.close();
    }
}
