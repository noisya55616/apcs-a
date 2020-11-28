import java.io.*; 
import java.util.*; 

public class Main {

	/**
	 * @param square is an input matrix
	 * @param row is the specific row number
	 * @return the sum of the integers in the specified row of the matrix
	 */
	public static int sumRow(int[][] square, int row) {
		int sum = 0;

		for (int i = 0; i < square[row].length; i++) {
			sum += square[row][i];
		}

		return sum;
	}

	/**
	 * @param square is an N x N input matrix
	 * @return true if all of the integers in the matrix are unique and from 1 to N^2
	 */
	public static boolean unique(int[][] square) {
		boolean[] visited = new boolean[square.length * square.length + 1];

		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				if (square[i][j] < 1 && square[i][j] > square.length * square.length) return false;
				else {
					if (visited[square[i][j]]) return false;
					else visited[square[i][j]] = true;
				}
			}
		}

		return true;
	}

	/**
	 * @param square is an input matrix
	 * @param col is the specific column number
	 * @return the sum of the integers in the specified column of the matrix
	 */
	public static int sumCol(int[][] square, int col) {
		int sum = 0;

		for (int i = 0; i < square.length; i++) {
			sum += square[i][col];
		}

		return sum;
	}

	public static boolean diagSumsAre(int[][] square, int sum) {
		int diag1 = 0; int diag2 = 0;

		for (int i = 0; i < square.length; i++) {
			diag1 += square[i][i]; diag2 += square[i][square.length - 1 - i];
		}

		return (diag1 == sum && diag2 == sum);
	}

	public static boolean isMagicSquare(int[][] square) {
		if (!unique(square)) return false;

		int sum = sumRow(square, 0);

		for (int i = 0; i < square.length; i++) {
			if (sumRow(square, i) != sum) return false;
		}

		for (int i = 0; i < square[0].length; i++) {
			if (sumCol(square, i) != sum) return false;
		}

		return diagSumsAre(square, sum);
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

		int[][] mat1 = { {16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1} };

		int[][] mat2 = { {2, 7, 6}, {9, 5, 1}, {4, 3, 8} };

		int[][] mat3 = { {8, 4, 6}, {1, 9, 5}, {7, 3, 2} };

		System.out.println("mat1: ");
		printMatrix(mat1);
		System.out.println("mat1 is a magic square: " + isMagicSquare(mat1));
		System.out.println("mat2: ");
		printMatrix(mat2);
		System.out.println("mat2 is a magic square: " + isMagicSquare(mat2));
		System.out.println("mat3: ");
		printMatrix(mat3);
		System.out.println("mat3 is a magic square: " + isMagicSquare(mat3));

        input.close();
    }
}