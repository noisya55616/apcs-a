import java.util.*;
import java.io.*; 

public class Main {
    static String reverse(String in) {
        if (in.length() <= 1) return in;
        else return in.substring(in.length() - 1, in.length()) + reverse(in.substring(0, in.length() - 1));
    }
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        String str1 = input.nextLine();

        System.out.println(reverse(str1));

        input.close();
    }
}