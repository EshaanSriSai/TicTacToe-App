import java.util.Scanner;

public class TicTacToeApp {

    static char[][] board = new char[3][3];

    // Initialize board
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print board
    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Input
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter slot (1-9): ");
        return sc.nextInt();
    }

    // Convert slot → row, col
    public static int[] convertSlotToPosition(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    // ✅ UC5 VALIDATION
    public static boolean isValidMove(int row, int col) {

        // Boundary check
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Empty check
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        initializeBoard();
        printBoard();

        int slot = getUserInput();
        int[] pos = convertSlotToPosition(slot);

        int row = pos[0];
        int col = pos[1];

        if (isValidMove(row, col)) {
            board[row][col] = 'X'; // temporary
            System.out.println("Move accepted ✅");
        } else {
            System.out.println("Invalid move ❌");
        }

        printBoard();
    }
}