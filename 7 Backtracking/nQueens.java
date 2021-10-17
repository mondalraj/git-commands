import java.util.Arrays;

public class nQueens {

    public static void placeNQueens(int n) {
        int[][] board = new int[n][n];
        placeQueens(board, 0);

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }

    public static boolean placeQueens(int[][] board, int row) {
        int n = board.length;
        if (row == n) {
            for (int i = 0; i < n; i++) {
                System.out.println(Arrays.toString(board[i]));
            }
            System.out.println();
            return true;
        }
        for (int col = 0; col < n; col++) {
            if (isSafeQueen(board, row, col)) {
                board[row][col] = 1;

                if (placeQueens(board, row + 1)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafeQueen(int[][] board, int row, int col) {
        int n = board.length;

        // chacking upper rows
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // checking left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // checking right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        placeNQueens(n);
    }
}