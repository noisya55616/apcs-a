package mountain;

import java.io.*; 
import java.util.*; 

public class ClimbInfo {

    private int climbTime;
    private String peakName;

    public ClimbInfo(String peakNameIn, int climbTimeIn) {
        peakName = peakNameIn; climbTime = climbTimeIn;
    }

    public String getName() {
        return peakName;
    }

    public int getTime() {
        return climbTime;
    }

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        input.close();
    }
}