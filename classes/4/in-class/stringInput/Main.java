import java.io.*; 
import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.next(); // Initialize with next input until the next space

        System.out.println(str1);

        String str2 = input.nextLine(); // Initialize with next input until the next line
        String str2 = input.nextLine(); // If you read something without nextLine and then read something with nextLine, 
                                        // it will read a blank line unless you read once more. probably something to do with output flusing.

        System.out.println(str2);

        input.close();
    }
}
