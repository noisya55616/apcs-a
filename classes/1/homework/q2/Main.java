import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x1 = input.nextInt();
    int y1 = input.nextInt();
    int x2 = input.nextInt();
    int y2 = input.nextInt();
    int x3 = input.nextInt();
    int y3 = input.nextInt();

    double a = Math.round(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
    double b = Math.round(Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)));
    double c = Math.round(Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)));

    double perimeter = a + b + c;

    double s = (a + b + c) / 2;
    double area = Math.round(Math.sqrt(s * (s - a) * (s - b) * (s-c)));

    double angleA = Math.round(Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c))));
    double angleB = Math.round(Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c))));
    double angleC = Math.round(Math.toDegrees(Math.acos((b * b + a * a - c * c) / (2 * b * a))));

    System.out.println("Length of all sides: " + a + " " + b + " " + c + "\n");
    System.out.println("Angles at all corners: " + angleA + " " + angleB + " " + angleC + "\n");
    System.out.println("Perimeter: " + perimeter + "\n");
    System.out.println("Area: " + area + "\n");
  }
}