import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int discriminant = b * b - 4 * a * c;
    System.out.println((0 - b + Math.sqrt(discriminant)) / (2 * a));
    System.out.println((0 - b - Math.sqrt(discriminant)) / (2 * a));
  }
}