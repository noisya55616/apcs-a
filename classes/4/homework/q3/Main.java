import java.util.*;
import java.io.*; 

public class Main {

    static String reverse(String in) {
        if (in.length() <= 1) return in;
        else return in.substring(in.length() - 1, in.length()) + reverse(in.substring(0, in.length() - 1));
    }

    static boolean isPalindrome(String in) {
        if (in.length() <= 1) return true;
        else {
            String out = in.toLowerCase();

            int i = 0;

            while (i < out.length()) {
                int cast = (int) out.charAt(i);
                if (cast < 97 || cast > 122) {
                    out = out.substring(0, i) + out.substring(i + 1, out.length());
                }
                else i++;
            }

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
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        String str1 = input.nextLine();

        System.out.println(isPalindrome(str1));

        input.close();
    }
}