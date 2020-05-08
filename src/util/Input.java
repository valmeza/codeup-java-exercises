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

}
