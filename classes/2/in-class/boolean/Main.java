import java.io.*; 
import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isHungry = true;
        boolean isThirsty = false;

        if (isHungry) {
            System.out.println("You should order some pizza.");
        }

        else if (isThirsty) {
            System.out.println("Maybe you should get some coffee.");
        }
    }
}
