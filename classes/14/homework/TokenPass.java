public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount) {
        board = new int[playerCount];
        for (int i = 0; i < playerCount; i++) {
            board[i] = ((int) (Math.random() * 10.0)) + 1;
        }

        currentPlayer = (int) Math.random() * playerCount;
    }

    public void distributeCurrentPlayerTokens() {
        int k = board[currentPlayer];
        int i = currentPlayer;
        board[currentPlayer] = 0;

        while (k > 0) {
            i++;
            if (i >= board.length) i = 0;
            board[i]++; k--;
        }
    }
}
