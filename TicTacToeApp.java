public class TicTacToeApp {

    public static void main(String[] args) {

        // 1. Create 2D array (3x3 board)
        char[][] board = new char[3][3];

        // 2. Initialize board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // 3. Print board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}