import java.util.Scanner;

public class Time {

    private int hour;

    private int minute;     

    /* Complete required constructors and methods here */  

    /*
    *Default constructor that sets time to 1200.  
    */ 

    public Time() {
        hour = 12;
        minute = 0;
    }

    /*
     * If h is between 1 and 23 inclusive, set the hour to h. 
     * Otherwise, set the hour to 0. If m is between 0 and 59 inclusive, 
     * set the minutes to m. Otherwise, set the minutes to 0. 
    */ 

    public Time(int h, int m) {
        if (h < 24 && h > 0) hour = h;
        else hour = 0;
        if (m < 60 && m >= 0) minute = m;
        else minute = 0;
    }

     

     /* Returns the time as a String of length 4 in the format: 0819. 

      * Notice that if the hour or minute is one digit, it should 

      * print a zero first. For example, 6 should print as 06.

     */

    public String toString()

    {
        String hours;
        if (hour < 10) hours = "0" + String.valueOf(hour);
        else hours = String.valueOf(hour);
        String minutes;
        if (minute < 10) minutes = "0" + String.valueOf(minute);
        else minutes = String.valueOf(minute);
       
        return hours + minutes;

     }

     

     /*

      * Returns the time as a String converted from military time 

      * to standard time. For example, 0545 becomes 5:45 am and 

      * 1306 becomes 1:06 pm.

      */ 

     public String convert()

     {
        String minutes;

        if (minute < 10) minutes = "0" + String.valueOf(minute);
        else minutes = String.valueOf(minute);

        String hours;

        String meridiem = "am";

        if (hour > 12) {
            hours = String.valueOf(hour - 12);
            meridiem = "pm";
        }
        else if (hour == 0) {
            hours = "12";
        }
        else hours = String.valueOf(hour);

        return hours + ":" + minutes + " " + meridiem;

     }

     

    /*

     * Advances the time by one minute. 

     * Remember that 60 minutes = 1 hour. 

     * Therefore, if your time was 0359, and you add one minute, 

     * it becomes 0400. 2359 should increment to 0000.

     */ 

    public void increment()

    {

      minute++;

      if (minute == 60) {
          minute = 0;
          hour++;
      }

      if (hour == 24) {
          hour = 0;
      }

    }

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        int h = input.nextInt();

        int m = input.nextInt();

        Time t1 = new Time(h, m);

        System.out.println(t1);

        System.out.println(t1.convert());

        t1.increment();

        System.out.println(t1);
        input.close();
    }
      

}