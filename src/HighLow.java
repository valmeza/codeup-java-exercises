import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        highLow(input);
    }

    // 5. Game Development 101
    public static void highLow(Scanner guess) {
        int range = 100 - 1 + 1;
        int numberToGuess = ((int)(Math.random()* range) + 1);

        while (true) {
            System.out.println("Guess the number: ");
            int userInput = Integer.parseInt(guess.nextLine());

            if (userInput > numberToGuess) {
                System.out.println("Lower");
            } else if (userInput < numberToGuess) {
                System.out.println("Higher");
            } else {
                System.out.println("You Win!!!");
                break;
            }
        }
    }
}
