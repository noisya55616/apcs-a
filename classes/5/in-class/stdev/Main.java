import java.io.*; 
import java.util.*;
import java.text.DecimalFormat;

public class Main {

    public static String stdev(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum / 10.0;

        double topsum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            topsum += Math.pow(arr[i] - average, 2);
        }

        double out = Math.sqrt(topsum / (arr.length - 1.0));

        DecimalFormat df = new DecimalFormat("0.000");

        return df.format(out);
    }
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int [] intArr1 = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
    System.out.println(stdev(intArr1));
    input.close();
  }
}