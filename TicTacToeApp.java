import java.util.Scanner;

public class TicTacToeApp {

    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter slot (1-9): ");
        return sc.nextInt();
    }

    // UC4 method
    public static int[] convertSlotToPosition(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    public static void main(String[] args) {

        int slot = getUserInput();

        int[] position = convertSlotToPosition(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Col: " + position[1]);
    }
}