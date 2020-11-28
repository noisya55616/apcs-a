import java.io.*; 
import java.util.*; 

public class Main {

    /**
     * 
     * @param in is an input integer
     * @return a boolean value: true if the number is a self-divisor, otherwise false
     */
    public static boolean isSelfDivisor(int in) {
        String input = String.valueOf(in);

        for (int i = 0; i < input.length(); i++) {
            int digit = Integer.parseInt(input.substring(i, i + 1));
            if (digit > 0) {
                if (in % digit != 0) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputInt = input.nextInt();
        if (isSelfDivisor(inputInt)) {
            System.out.println("Self Divisor");
        }

        else {
            System.out.println("Not a self Divisor");
        }
        input.close();
  }
}