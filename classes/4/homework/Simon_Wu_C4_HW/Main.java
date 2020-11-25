import java.util.*;
import java.io.*; 

public class Main {
    /*
     * @param in is a non-empty string
     * @return a reversed version of in
     */
    static String reverse(String in) {
        if (in.length() <= 1) return in;
        // A recursive method
        // I just learned about recursion in C++ for competitive programming so I decided to try it out here
        else return in.substring(in.length() - 1, in.length()) + reverse(in.substring(0, in.length() - 1));
    }

    /*
     * @param in is a non-empty string
     * @param rem is a non-empty string
     * @return a string that is in with all instances of rem removed
     */
     static String removeAll(String in, String rem) {
        String out = in;
        if (!rem.equals("")) {
            while (out.indexOf(rem) != -1) {
                out = out.substring(0, out.indexOf(rem)) + out.substring(out.indexOf(rem) + rem.length(), out.length());
            }
            return out;
        }
        
        else {
            return out;
        }
    }

    /*
     * @param in is a non-empty string
     * @return a boolean value of whether or not in is a palindrome
     */
    static boolean isPalindrome(String in) {
        if (in.length() <= 1) return true;
        else {
            String out = in.toLowerCase();

            int i = 0;

            // Removes non-letter characters (spaces, punctuation, etc.)
            while (i < out.length()) {
                int cast = (int) out.charAt(i);
                if (cast < 97 || cast > 122) {
                    out = out.substring(0, i) + out.substring(i + 1, out.length());
                }
                else i++;
            }

            // If the string has a lot of punctuation, see if it's a trivial case
            if (out.equals("") || out.length() == 1) return true;

            else {

                String left = out.substring(0, out.length() / 2);
                String right;

                if (out.length() % 2 == 0) {
                    right = reverse(out.substring(out.length() / 2, out.length()));
                }

                else {
                    right = reverse(out.substring((out.length() / 2) + 1, out.length()));
                }

                return left.equals(right);
            }
        }
    }

    /*
     * @param in is a non-empty string
     * @return the Pig Latin version of in
     */
    static String toPigLatin(String in) {
        String out;
        if (in.indexOf(" ") == -1) {
            out = toPigLatinWord(in);
            return out;
        }
        else {          // This looks through the input string for individual words (separated by spaces) and then
            out = "";   // uses the other method (toPigLatinWord()) to translate the words and add them to the output
            out = toPigLatinWord(in.substring(0, in.indexOf(" ")));
            in = in.substring(in.indexOf(" ") + 1, in.length());

            while (in.indexOf(" ") != -1) {
                int space = in.indexOf(" ");
                out = out + " " + toPigLatinWord(in.substring(0, space));
                in = in.substring(space + 1, in.length());
            }

            out = out + " " + toPigLatinWord(in);
            return out;
        }
    }

    /*
     * @param in is a non-empty string without any spaces
     * @return the Pig Latin version of in
     */
    static String toPigLatinWord(String in) {   // This method translates only a single word into Pig Latin
        String out = in;                        // It makes it a lot easier to translate sentences, and is
        String vowels = "AEIUOaeiou";           // more modular.
        int firstVowel = -1;
        int i = 0;

        if (in.equals("")) return "";
        else {
            while (firstVowel == -1 && i < out.length()) {
                if (vowels.indexOf(out.substring(i, i + 1)) != -1) firstVowel = i;
                i++;
            }

            if (firstVowel == -1) return out + "ay";
            if (firstVowel == 0) return out + "yay";
            else return out.substring(firstVowel, out.length()) + out.substring(0, firstVowel) + "ay";
        }
    }
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        System.out.print("String reversal method\nInput: ");

        String str1 = input.nextLine();

        System.out.print("Reversed: " + reverse(str1) + "\n\n");

        /**************************************************/

        System.out.print("String removal method\nInput: ");

        str1 = input.nextLine();

        System.out.print("String to remove: ");

        String str2 = input.nextLine();

        System.out.print("Removed: " + removeAll(str1, str2) + "\n\n");

        /**************************************************/

        System.out.print("Palindrome detection method\nInput: ");

        str1 = input.nextLine();

        System.out.print("Input is a palindrome: " + isPalindrome(str1) + "\n\n");

        /**************************************************/

        System.out.print("Pig Latin translation method\nInput: ");

        str1 = input.nextLine();

        System.out.print("Pig Latin translation: " + toPigLatin(str1) + "\n\n");

        input.close();
    }
}