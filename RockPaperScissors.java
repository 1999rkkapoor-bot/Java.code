import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.print("Enter Rock, Paper or Scissors: ");
        String user = sc.nextLine();

        int computerIndex = rand.nextInt(3);
        String computer = options[computerIndex];

        System.out.println("Computer chose: " + computer);

        if(user.equalsIgnoreCase(computer)) {
            System.out.println("It's a Draw!");
        }
        else if(
            (user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))
        ) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
}