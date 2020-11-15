import java.util.*;
import java.io.*; 

public class Main {
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
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        String str1 = input.nextLine();
        String str2 = input.nextLine();

        System.out.println(removeAll(str1, str2));

        input.close();
    }
}