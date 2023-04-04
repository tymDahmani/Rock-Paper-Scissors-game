import java.util.Scanner;
import java.util.Random;

// a testing code project for rock paper scissors.
public class RPS {
    public static void main(String[] args) {
        // the scanner which will get the input from the user:
        Scanner scanner = new Scanner(System.in);

        System.out.println("make a move! (rock/paper/scissors) ");
        String playerMove = scanner.nextLine();

        // getting an input from the computer:
        Random random = new Random();
        int randomNum = random.nextInt(3);

        // computer's move:
        String computer_move;
        if (randomNum == 0) {
            computer_move = "rock";
        } else if (randomNum == 1) {
            computer_move = "paper";
        } else {
            computer_move = "scissors";
        }
        System.out.println("the computer choose: "+computer_move+ "!");

        // Print results
        if (playerMove.equals(computer_move)) {
            System.out.println("It's a draw!");
        } else if (playerWins(playerMove, computer_move)) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }

    }

    // a func for all the possibilities where the player can win:
    static boolean playerWins(String player_move, String computer_move) {
        if (player_move.equals("rock")) {
            return computer_move.equals("scissors");
        } else if (player_move.equals("paper")) {
            return computer_move.equals("rock");
        } else {
            return computer_move.equals("paper");
        }

}}
