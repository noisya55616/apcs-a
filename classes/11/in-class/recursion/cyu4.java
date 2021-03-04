import java.util.Scanner;

public class cyu4 {
    public static String remove(String str1, String str2) {
        if (str1.indexOf(str2) == -1) return str1;
        String str3 = str1;
        str3 = str3.substring(0, str3.indexOf(str2)) + str3.substring(str3.indexOf(str2) + str2.length(), str3.length());
        return remove(str3, str2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.nextLine();

        String str2 = input.nextLine();

        System.out.println(remove(str1, str2));
    }
}
