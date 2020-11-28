import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    int[][] mat1 = new int[4][3]; // [rows][column]
    int[][] mat2 = new int[5][3];

    System.out.println(mat1.length); // length of a 2d array will return the
    System.out.println(mat2.length); // amount of rows (the first value)

    int[][][] box1 = new int[3][4][5];

    System.out.println(box1.length); // it will always return that first value!

    int[][] mat3 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    for (int i = 0; i < mat3.length; i++) {
        System.out.println(mat3[i][i] + "\t" + mat3[i][mat3.length - i - 1]); // print diagonals!
    }

    int[][] intArr1 = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    for (int i = 0; i < intArr1.length; i++) { // reversing rows (in class exercise)
        for (int j = 0; j < intArr1[i].length / 2; j++) {
            int temp = intArr1[i][j];
            intArr1[i][j] = intArr1[i][intArr1[i].length - 1 - j];
            intArr1[i][intArr1[i].length - 1 - j] = temp;
        }
    }

    for (int i = 0; i < intArr1.length; i++) {
        for (int j = 0; j < intArr1[i].length; j++) {
            System.out.print(intArr1[i][j] + "\t");
        }
        System.out.println("\n");
    }

    input.close();
  }
}