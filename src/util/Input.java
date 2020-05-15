package util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return this.getString("Type Something: ");
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");
        return scanner.nextLine().equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        int number;
        try {
            number = Integer.valueOf(getString("Enter a number between " + min + " and " + max));
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
           number = Integer.valueOf(getString("Enter an Integer: "));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Try Again!");
            return getInt();
        }
        return number;
    }

    public double getDouble(double min, double max) {
        double number;
        try {
            number = Double.valueOf(getString("Enter a decimal between " + min + " and " + max));
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
        double number;
        try {
            number = Double.valueOf(getString("Enter a decimal: "));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Try Again!");
            return getDouble();
        }
        return number;
    }

    public int getBinary() {
        String s = getString("Enter a binary number: ");
        Integer binary = Integer.valueOf(s, 2);

        return binary;
    }

    public int getHexidecimal() {
        String s = getString("Enter a Hexidecimal number: ");
        Integer hex = Integer.valueOf(s, 16);

        return hex;
    }

}
