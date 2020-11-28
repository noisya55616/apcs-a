import java.io.*; 
import java.util.*; 

public class Main {

    /**
     * Q1 Part A
     * @param arr an input array of integers
     * @return the sum of all of the elements of the array
     */
    public static int arraySum(int[] arr) {
        int out = 0;

        for (int i = 0; i < arr.length; i++) {
            out += arr[i];
        }

        return out;
    }

    /**
     * Q1 Part B
     * @param arr2D a 2D array of integers
     * @return an array of the sums of integers in each row
     */
    public static int[] rowSums(int[][] arr2D) {
        int[] out = new int[arr2D.length];

        for (int i = 0; i < arr2D.length; i++) {
            out[i] = arraySum(arr2D[i]);
        }

        return out;
    }

    /**
     * Q1 Part C
     * @param arr2D a 2D array of integers
     * @return a boolean value: true if the array is diverse and false otherwise
     */
    public static boolean isDiverse(int[][] arr2D) {
        int[] sums = rowSums(arr2D);

        // TODO: Reduce complexity
        // Right now, everything is compared to everything else: about O(n^2) complexity
        // Possible to reduce to O(nlogn) complexity using binary search
        // Binary search is O(logn), searching for every single element is O(nlogn)
        for (int i = 0; i < sums.length - 1; i++) {
            for (int j = i + 1; j < sums.length; j++) {
                if (sums[i] == sums[j]) return false;
            }
        }

        return true;
    }

  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int[] arr1 = {1, 2, 3, 4, 5, 6}; // Sum is 21

    int[][] mat1 = { {1, 2, 3, 4}, {2, 4, 6, 8}, {3, 6, 9, 12} }; // Sums are 10, 20, 30, and is diverse

    int[][] mat2 = { {1, 2, 3, 4}, {1, 2, 3, 4}, {3, 6, 9, 12} }; // Not diverse

    System.out.print("Contents of arr1: ");

    for (int i = 0; i < arr1.length; i++) {
        System.out.print(arr1[i] + " ");
    }

    System.out.print("\n\n");

    System.out.print("Contents of mat1:\n");

    for (int i = 0; i < mat1.length; i++) {
        for (int j = 0; j < mat1[i].length; j++) {
            System.out.print(mat1[i][j] + "\t");
        }
        System.out.print("\n");
    }

    System.out.print("\nContents of mat2:\n");

    for (int i = 0; i < mat2.length; i++) {
        for (int j = 0; j < mat2[i].length; j++) {
            System.out.print(mat2[i][j] + "\t");
        }
        System.out.print("\n");
    }

    System.out.print("\n");

    System.out.print("Sum of elements of arr1: " + arraySum(arr1) + "\n"); // Should print out 21

    int[] sums = rowSums(mat1);

    System.out.print("Sums of the rows of mat1: ");

    for (int i = 0; i < sums.length; i++) {
        System.out.print(sums[i] + " "); // Should print out 10 20 30
    }

    System.out.print("\n");

    System.out.println("mat1 is diverse: " + isDiverse(mat1)); // Should return true

    System.out.println("mat2 is diverse: " + isDiverse(mat2)); // Should return false

    input.close();
  }
}