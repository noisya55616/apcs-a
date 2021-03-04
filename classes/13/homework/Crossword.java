public class Crossword {
    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares) {
        int k = 1;
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[0].length; j++) {
                if (toBeLabelled(i, j, blackSquares)) puzzle[i][j] = new Square(true, 0);
                else {
                    puzzle[i][j] = new Square(false, k); k++;
                }
            }
        }
    }

    private boolean toBeLabelled(int r, int c, boolean[][] blackSquares) {
        if (r == 0 || c == 0) return false;
        if (blackSquares[r - 1][c] || blackSquares[r][c - 1]) return false;
        return true;
    }
}
