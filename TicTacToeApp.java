import java.util.Scanner;

public class TicTacToeApp {

    // Method to take user input
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        // Call method
        int userSlot = getUserInput();

        // Print result (to verify)
        System.out.println("You selected slot: " + userSlot);
    }
}