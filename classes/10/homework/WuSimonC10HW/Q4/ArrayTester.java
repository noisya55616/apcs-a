import java.util.ArrayList;

public class ArrayTester {
    public static int[] getColumn(int[][] arr2D, int c) {
        int[] ret = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            ret[i] = arr2D[i][c];
        }
        return ret;
    }

    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        // Dummy implementation for testing
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < arr2.length; i++) {
            al.add(arr2[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (al.indexOf(arr1[i]) == -1) return false;
        }
        return true;
    }

    public static boolean containsDuplicates(int[] arr) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (al.isEmpty()) al.add(arr[i]);
            else {
                if (al.indexOf(arr[i]) != -1) return true;
                else al.add(arr[i]);
            }
        }
        return false;
    }

    public static boolean isLatin(int[][] square) {
        if (square.length == 1) return true;
        for (int i = 0; i < square.length; i++) {
            if (containsDuplicates(square[i])) return false;
        }

        for (int i = 1; i < square.length; i++) {
            if (!hasAllValues(square[0], square[i])) return false;
        }

        for (int i = 0; i < square.length; i++) {
            if (!hasAllValues(square[0], getColumn(square, i))) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] sq1 = { {1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
        int[][] sq2 = { {1, 2, 3}, {3, 1, 2}, {7, 8, 9}};

        System.out.println(ArrayTester.isLatin(sq1));
        System.out.println(ArrayTester.isLatin(sq2));
    }
}