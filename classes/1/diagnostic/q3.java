import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String s = "1";
    int i = 2;
    while (i * i <= n) {
      s = s + " " + i*i;
      i++;
    }
    System.out.println(s);
  }
}