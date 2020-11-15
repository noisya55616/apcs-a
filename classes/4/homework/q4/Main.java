import java.util.*;
import java.io.*; 

public class Main {
    static String toPigLatin(String in) {
        String out;
        if (in.indexOf(" ") == -1) {
            out = toPigLatinWord(in);
            return out;
        }
        else {
            out = "";
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

    static String toPigLatinWord(String in) {
        String out = in;
        String vowels = "AEIUOaeiou";
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

        String str1 = input.nextLine();

        System.out.println(toPigLatin(str1));

        input.close();
    }
}