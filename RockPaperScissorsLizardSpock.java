import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * RockPaperScissors
 */
public class RockPaperScissorsLizardSpock {

    public static void main(String[] args) throws InterruptedException {
        int player, computer, pscore = 0, cscore = 0;
        String move = "", winner = "";
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        while (pscore < 5 && cscore < 5) {
            System.out.print("\n1. Rock\t\t2. Paper\t3. Scissors\t4. Lizard\t5. Spock\nChoose your next move: ");
            player = kb.nextInt();

            switch (player) {
                case 1:
                    move = "rock";
                    break;
                case 2:
                    move = "paper";
                    break;
                case 3:
                    move = "scissors";
                    break;
                case 4:
                    move = "lizard";
                    break;
                case 5:
                    move = "spock";
                    break;
            }

            System.out.print("Rock... ");
            TimeUnit.SECONDS.sleep((long) 1);
            System.out.print("Paper... ");
            TimeUnit.SECONDS.sleep((long) 1);
            System.out.print("Scissors... ");
            TimeUnit.SECONDS.sleep((long) 1);
            System.out.print(("Lizard... "));
            TimeUnit.SECONDS.sleep((long) 1);
            System.out.println("Spock... ");
            TimeUnit.SECONDS.sleep((long) 1);

            System.out.println("\nYou chose " + move + ".");

            computer = r.nextInt(5) + 1;

            switch (computer) {
                case 1:
                    move = "rock";
                    break;
                case 2:
                    move = "paper";
                    break;
                case 3:
                    move = "scissors";
                    break;
                case 4:
                    move = "lizard";
                    break;
                case 5:
                    move = "spock";
                    break;
            }
            System.out.println("The computer chose " + move + ".");


            if (player == computer) {
                winner = "tie";
            } else if 
            ((player == 1 && (computer == 3 || computer == 4)) || (player == 2 && (computer == 1 || computer == 5)) || (player == 3 && (computer == 2 || computer == 4)) || (player == 4 && (computer == 2 || computer == 5)) || (player == 5 && (computer == 1 || computer == 3))) {
                winner = "player";
            } else {
                winner = "computer";
            }


            if (winner == "computer") {
                System.out.println("You lose!");
                cscore++;
            } else if (winner == "player") {
                System.out.println("You win!");
                pscore++;
            } else if (winner == "tie") {
                System.out.println("Tie. No one wins.");
            }

            TimeUnit.SECONDS.sleep((long) 1);

            System.out.println("\nYour score: " + pscore);
            System.out.println(("Computer's score: " + cscore));

            TimeUnit.SECONDS.sleep((long) 1);

            

        }

        if (cscore == 5) {
            System.out.println("\nGAME OVER!");
        } else if (pscore == 5)
            System.out.println("\nYou won the game. Good job.");

        kb.close();
    }

}