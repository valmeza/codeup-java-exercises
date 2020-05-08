package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public void getString() {
        System.out.println("String: ");
        String input = scanner.nextLine();
        System.out.println(input);
    }

    public void yesNo() {
        System.out.println("Yes or No?");
        String response = scanner.nextLine();
        System.out.println(response.equalsIgnoreCase("Y"));
    }

    public void getInt(int min, int max) {
        System.out.println("Enter a number between 1-10");
        int number = scanner.nextInt();
        if (number >= min && number <= max) {
            System.out.println("Valid Number: " + number);
        } else {
            System.out.println("Invalid Number!");
            getInt(min, max);
        }
    }

    public void getInt() {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Number: " + number);
    }

    public void getDouble(double min, double max) {
        System.out.println("Enter a double: ");
        double number = scanner.nextDouble();
        if(number >= min && number <= max) {
            System.out.println("Valid number: " + number);
        } else {
            System.out.println("Invalid Number!");
            getDouble(min, max);
        }
    }

    public int getDouble() {
        System.out.println("Enter a double: ");
        double number = scanner.nextDouble();
        System.out.println("Double: " + number);
        return 0;
    }
}
