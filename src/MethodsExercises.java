import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        //Main
//        getInteger(0, 0);
        System.out.println("Addition: " + addition(1, 1));
        System.out.println("Subtraction: " + subtraction(1, 5));
        System.out.println("Multiplication: " + multiplication(5, 5));
        System.out.println("Multiplication Loop: " + multiplicationLoop(5, 5));
        System.out.println("Division: " + division(0, 1));
        System.out.println("Modulus: " + modulus(5, 2));
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
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

//    public static int getInteger(int min, int max) {
//        System.out.println("Enter a number between 1 - 10: ");
//        int userInput = getInteger(1, 10);
//        return 0;
//    }
}
