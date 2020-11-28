import java.io.*; 
import java.util.*; 

public class Main {

    public static boolean scoresIncreasing(int[] in) {
        for (int i = in.length - 1; i > 0; i--) {
            if (in[i] < in[i - 1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = {1, 3, 4};
        System.out.println(scoresIncreasing(arr1));

        int[] arr2 = {1, 3, 2};
        System.out.println(scoresIncreasing(arr2));

        int[] arr3 = {1, 1, 4};
        System.out.println(scoresIncreasing(arr3));
        input.close();
    }
}