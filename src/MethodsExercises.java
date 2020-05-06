import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        //Main
//        getInteger(0, 0);
        Scanner input = new Scanner(System.in);
//        getInteger(input);
        factorialTable(input);
        dice(input);
//        System.out.println("Addition: " + addition(1, 1));
//        System.out.println("Subtraction: " + subtraction(1, 5));
//        System.out.println("Multiplication: " + multiplication(5, 5));
//        System.out.println("Multiplication Loop: " + multiplicationLoop(5, 5));
//        System.out.println("Division: " + division(0, 0));
//        System.out.println("Modulus: " + modulus(5, 2));
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    //version 1 of the multiplication method
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    // Bonus: version 2 of the multiplication method using a loop
    public static int multiplicationLoop(int num1, int num2) {
        int result = 0; // initialize
        while (num1 > 0) {
            result += num2; // adding the initial value 0 + the num2
            num1--; // decrementing this until its equal to 0
        }
        return result;
    }

    public static int division(int num1, int num2) {
        // bonus:
        // how to prevent a user from dividing zero
        if (num2 == 0) {
            System.out.println("Division by zero is impossible");
            return 0;
        }
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    // 2. Create a method that validates that user input is in a certain range
    public static int getInteger(Scanner number) {
        System.out.println("Pick a number between 1 - 10: ");
        int userInput = number.nextInt();
        if (userInput <= 10 && userInput != 0) {
            System.out.println("Your number is in range: " + userInput);
            return getInteger(number);
        } else {
            System.out.println("Invalid Number!");
            getInteger(number);
        }
        return userInput;
    }

    // 3. Calculate the factorial of a number.
    public static void factorialTable(Scanner number) {
        do {
            System.out.println("Pick a number between 1 - 10: ");
            long userInput = Long.parseLong(number.nextLine());
            long result = 1;

            if (userInput <= 10 && userInput != 0) {
                for (long i = 1; i <= userInput; i++) {
                    result *= i;
                    System.out.printf("%d!" + " = " + "%d%n", i, result);
                }
            } else {
                System.out.println("Invalid number");
                factorialTable(number);
            }

            System.out.println("Do you wish to continue?");
            String response = number.nextLine();
            if (!response.equalsIgnoreCase("y")) {
                return;
            }
        } while (true);
    }

    // 4. Create an application that simulates dice rolling
    public static void dice(Scanner dice) {
        while (true) {
            System.out.println("Enter a number of Sides for a pair of dice: ");
            double userInput = Integer.parseInt(dice.nextLine());

            System.out.println("Roll the dice? [roll/no]");
            String response = dice.nextLine();

            double dice1 = Math.floor((Math.random() * userInput) + 1);
            double dice2 = Math.floor((Math.random() * userInput) + 1);

            if (response.equalsIgnoreCase("roll")) {
                System.out.println("Diced rolled \n" + "Dice 1: " + dice1 + "\n" + "Dice 2: " + dice2);
            }

            System.out.println("Would you like to roll again? [y/n]");
            String rollAgain = dice.nextLine();

            if (!rollAgain.equalsIgnoreCase("y")) {
                return;
            }
        }
    }
}
