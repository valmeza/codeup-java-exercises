package util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter Something: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");
        return scanner.nextLine().equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number between " + min + " " + max);
        int number = Integer.parseInt(scanner.nextLine());
        if (number < min || number > max) {
            System.out.println("Out of range!");
            return getInt(min, max);
        }
        return number;
    }

    public int getInt() {
        System.out.println("Enter a number: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a decimal between " + min + " " + max);
        double number = Double.parseDouble(scanner.nextLine());
        if (number < min || number > max) {
            System.out.println("Out of range!");
            return getDouble(min, max);
        }
        return number;
    }

    public double getDouble() {
        System.out.println("Enter a decimal: ");
        return Double.parseDouble(scanner.nextLine());
    }
}
