import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Family name: ");
    String familyName = input.next();
    System.out.print("Given name: ");
    String givenName = input.next();
    System.out.print("Hourly pay rate: ");
    double rate = input.nextDouble();
    System.out.print("Hours worked: ");
    double hours = input.nextDouble();
    System.out.print("Tax category (A-E): ");
    String taxCategory = input.next();
    System.out.print("Make a donation? (Y or N): ");
    String donation = input.next();
    System.out.println("Name: " + givenName + " " + familyName);
    double grossPay = rate * hours;
    if (hours > 40.0) grossPay += (hours - 40.0) * 2.0 * rate;
    System.out.println("Gross pay: $" + grossPay);
    double deduction = 0;
    if (taxCategory.equals("A")) deduction = 0;
    else if (taxCategory.equals("B")) deduction = grossPay * 0.1;
    else if (taxCategory.equals("C")) deduction = grossPay * 0.2;
    else if (taxCategory.equals("D")) deduction = grossPay * 0.29;
    else if (taxCategory.equals("E")) deduction = grossPay * 0.35;
    if (donation.equals("Y")) deduction += 20.0;
    System.out.println("Deductions: $" + deduction);
    System.out.println("Net pay: $" + (grossPay - deduction));
	input.close();
  }
}