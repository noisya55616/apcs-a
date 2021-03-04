public class Successors {
    public static Position findPosition(int num, int[][] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                if (intArr[i][j] == num) {
                    Position ret = new Position(i, j);
                    return ret;
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] intArr) {
        Position ret[][] = new Position[intArr.length][intArr[0].length];

        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                ret[i][j] = findPosition(intArr[i][j] + 1, intArr); 
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        int[][] arr = {{15, 5, 9, 10}, {12, 16, 11, 6}, {14, 8, 13, 7}};
        Position successor[][] = getSuccessorArray(arr);

        for (int i = 0; i < successor.length; i++) {
            for (int j = 0; j < successor[0].length; j++) {
                if (successor[i][j] != null) System.out.print(successor[i][j].toString() + "\t");
                else System.out.print("null\t");
            }
            System.out.print("\n");
        }
    }
}
