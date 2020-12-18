import java.io.*; 
import java.util.*;
import mountain.*;

public class Main {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        
        ClimbingClub list = new ClimbingClub();

        list.addClimb("Carol", 100);
        list.addClimb("Boris", 200);
        list.addClimb("Aria", 20);
        list.addClimb("Terrance", 50);

        ArrayList<ClimbInfo> mountainList;
        mountainList = list.getClimbList();

        for (int i = 0; i < mountainList.size(); i++) {
            String name = mountainList.get(i).getName();
            System.out.print(name + " ");
        }

        input.close();
    }
}