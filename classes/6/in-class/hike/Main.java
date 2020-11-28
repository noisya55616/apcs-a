import java.io.*; 
import java.util.*; 

public class Main {

    public static int sumHeights(int[] heights, int start, int end) {
        int out = 0;
        for (int i = start; i < end; i++) {
            out += (int) Math.abs(heights[i] - heights[i + 1]);
        }
        return out;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] heights = {5, 3, 6, 7, 2};
        
        System.out.println(sumHeights(heights, 2, 4));

        System.out.println(sumHeights(heights, 0, 1));

        System.out.println(sumHeights(heights, 0, 4));

        input.close();
    }
}