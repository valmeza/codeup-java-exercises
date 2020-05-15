package util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
//        System.out.println("Enter Something: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");
        return scanner.nextLine().equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number between " + min + " " + max);
        int number = 0;
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
        int number = 0;
        try {
           number = Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Try Again!");
            return getInt();
        }
        return number;
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a decimal between " + min + " " + max);
        double number = 0;
        try {
            number = Double.parseDouble(scanner.nextLine());
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
        double number  = 0;
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

    }

}
