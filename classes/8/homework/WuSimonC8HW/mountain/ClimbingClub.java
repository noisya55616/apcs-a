package mountain;

import java.io.*; 
import java.util.*;
import mountain.ClimbInfo;

public class ClimbingClub {
    private ArrayList<ClimbInfo> climbList;

    public ClimbingClub() {
        climbList = new ArrayList<ClimbInfo>();
    }

    public ArrayList<ClimbInfo> getClimbList() {
        return climbList;
    }

    public void addClimbA(String peakNameIn, int climbTimeIn) { // addClimb implementation A
        ClimbInfo c1 = new ClimbInfo(peakNameIn, climbTimeIn);
        climbList.add(c1);
    }

    public void addClimb(String peakNameIn, int climbTimeIn) { // addClimb implementation B
        ClimbInfo c1 = new ClimbInfo(peakNameIn, climbTimeIn);

        if (climbList.isEmpty()) {
            climbList.add(c1);
        }

        else {
            boolean placed = false;
            int i = 0;
            while (i < climbList.size() && !placed) {
                String testName = climbList.get(i).getName();
                if (testName.compareTo(peakNameIn) > 0) placed = true;
                else i++;
            }
            climbList.add(i, c1);
        }
    }

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        input.close();
    }
}