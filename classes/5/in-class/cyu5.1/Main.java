import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    String str = input.next();

    int min = str.length();
    int max = str.length();

    String strMax = str;
    String strMin = str;

    for (int i = 0; i < 9; i++) {
        str = input.next();

        if (str.length() > max) {
            max = str.length();
            strMax = str;
        }

        if (str.length() < min) {
            min = str.length();
            strMin = str;
        }
    }

    System.out.print(strMax + "\n" + strMin + "\n");

    input.close();
  }
}