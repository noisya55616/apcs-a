import java.io.*; 
import java.util.*; 

public class APLine {
    private int a, b, c;

    public APLine(int inA, int inB, int inC) {
        a = inA; b = inB; c = inC;
    }

    public APLine() {
        a = 0; b = 0; c = 0;
    }

    public double getSlope() {
        return 0.0 - ((double) a / (double) b);
    }

    /**
     * 
     * @param x is the x coordinate to check
     * @param y is the y coordinate to check
     * @return true if the point would lie on the line, otherwise false
     */
    public boolean isOnLine(int x, int y) {
        return a * x + b * y + c == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope();// slope1 is assigned -1.25
        boolean onLine1 = line1.isOnLine(5, -2); // true because 5(5) + 4(-2) + (-17) =0

        APLine line2 = new APLine(-25, 40, 30);
        double slope2 = line2.getSlope();// slope2 is assigned  0.625
        boolean onLine2 = line2.isOnLine(5, -2); // false because -25(5) + 40(-2) + 30 ≠0

        System.out.println("Line 1: " + slope1 + " " + onLine1 + "\nLine 2: " + slope2 + " " + onLine2);

        input.close();
    }
}