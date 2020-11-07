// Necklace

import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int m = input.nextInt(); int n = input.nextInt();
    int p = (m + n) % 10;
    int q = (n + p) % 10;

    System.out.print(m + " " + n + " " + p + " " + q + " ");

    while (p != m || q != n) {
        int temp = q;
        q = (p + q) % 10;
        p = temp;
        System.out.print(q + " ");
    }

    input.close();
  }
}