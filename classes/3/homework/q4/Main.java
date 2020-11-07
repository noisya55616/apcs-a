import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.print("Enter the starting hour: ");
    int hour = input.nextInt();
    System.out.print("am or pm? (lowercase) ");
    String meridiem = input.next(); // AM is ante meridiem and PM is post meridiem
    System.out.print("How much time has elapsed? ");
    int elapsed = input.nextInt() % 24;

    hour += elapsed;

    if (hour == 12 && elapsed > 0) {
        if (meridiem.equals("am")) meridiem = "pm";
        else meridiem = "am";
    }

    else if (hour > 12) {
        hour -= 12;
        if (meridiem.equals("am")) meridiem = "pm";
        else meridiem = "am";
    }

    System.out.println("The time is: " + hour + ":00 " + meridiem);

	input.close();
  }
}