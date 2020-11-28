import java.io.*; 
import java.util.*; 

public class Main {

    public static int matchUp(String[] a, String[] b) {
        int out = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != "" && b[i] != "") {
                if (a[i].charAt(0) == b[i].charAt(0)) {
                    out++;
                }
            }
        }
        return out;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] str1 = {"aa", "bb", "cc"};
        String[] str2 = {"aaa", "xx", "bb"};
        System.out.println(matchUp(str1, str2));

        String[] str3 = {"aaa", "b", "bb"};

        System.out.println(matchUp(str1, str3));

        String[] str4 = {"", "", "ccc"};

        System.out.println(matchUp(str1, str4));
        input.close();
    }
}