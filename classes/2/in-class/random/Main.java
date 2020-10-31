import java.io.*; 
import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(Math.random()); // This outputs a number in the range [0. 1).

        System.out.println((int) (Math.random() * 10.0)); // This outputs a number from 0 to 9. The highest number will be 9.999999.... which truncates to 9.

        // Now, we want to be able to generate a random number from a maximum to minimum value.

        int min = input.nextInt();
        int max = input.nextInt();

        System.out.println((int) (Math.random() * (max - min + 1) + min)); // This is how you output from a particular range.

        input.close();
    }
}
