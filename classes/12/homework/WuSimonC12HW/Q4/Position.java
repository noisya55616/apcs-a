public class Position {
    private int row, column;
    public Position(int r, int c) {
        row = r; column = c;
    }

    public String toString() {
        return "(" + row + ", " + column + ")";
    }

}
