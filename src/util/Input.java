package util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Type Something: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");
        return scanner.nextLine().equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number between " + min + " and " + max);
        int number;
        try {
            number = Integer.valueOf(getString());
            if (number < min || number > max) {
                System.out.println("Out of range!");
                return number;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Try Again!");
            return getInt(min, max);
        }
        return number;
    }

    public int getInt() {
        int number;
        try {
            System.out.println("Enter an Integer: ");
           number = Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Try Again!");
            return getInt();
        }
        return number;
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a decimal between " + min + " and " + max);
        double number;
        try {
            number = Double.valueOf(getString());
            if (number < min || number > max) {
                System.out.println("Out of range!");
                return number;
            }
        } catch(NumberFormatException e) {
            System.out.println("Invalid number. Try Again!");
            return getDouble(min, max);
        }
        return number;
    }

    public double getDouble() {
        System.out.println("Enter a decimal: ");
        double number;
        try {
            number = Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Try Again!");
            return getDouble();
        }
        return number;
    }

    public int getBinary() {
        System.out.println("Enter a binary number: ");
        String s = getString();
        Integer binary = Integer.valueOf(s, 2);

        return binary;
    }

    public int getHexidecimal() {
        System.out.println("Enter a Hexidecimal number: ");
        String s = getString();
        Integer hex = Integer.valueOf(s, 16);

        return hex;
    }

}
