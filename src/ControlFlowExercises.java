import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1. Loop Basics
        // a. While
        int i = 5;
        while (i <= 15) {
            System.out.println("While: i = " + i);
            i++;
        }
        // b. Do While
        int a = 0;
        do {
            System.out.println("Do while: a = " + a);
            a += 2;
        } while (a <= 100);

        int b = 100;
        do {
            System.out.println("Count backwards: b = " + b);
            b -= 5;
        } while (b >= -10);

        long c = 2L;
        do {
            System.out.println("c = " + c);
            c *= c;
        } while (c < 1000000);

        // c. for
        for (int y = 5; y <= 15; y++) {
            System.out.println("for loop: y = " + y);
        }

        for (int l = 0; l <= 100; l += 2) {
            System.out.println("for loop: l = " + l);
        }

        for (int backward = 100; backward >= -10; backward -= 5) {
            System.out.println("for loop: backward = " + backward);
        }

        for (long n = 2L; n < 1000000; n *= n) {
            System.out.println("for loop: n = " + n);
        }

        // 2. FizzBuzz
        for (int fizzbuzz = 1; fizzbuzz <= 100; fizzbuzz++) {
            if (fizzbuzz % 3 == 0 && fizzbuzz % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (fizzbuzz % 3 == 0) {
                System.out.println("Fizz");
            } else if (fizzbuzz % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(fizzbuzz);
            }
        }

        // 3. Table of powers
        System.out.println("What number would you like to go up to?");
        Scanner scanner = new Scanner(System.in);
        int inputSquared = Integer.parseInt(scanner.nextLine());

        System.out.println("Number" + "   |" + "Squared" + "   |" + "Cubed");
        for (int squared = 1; squared <= inputSquared; squared++) {
            System.out.println("Number: " + squared + "| " + "Squared: " + squared * squared + "| " + "Cubed: " + squared * squared * squared);
            System.out.println("____________________________________");
        }

        // 4. Convert given number grades into letter grades
//        Grade Ranges:
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

        String confirmation = "";
        do {
            System.out.println("Enter a number from 0 - 100");
            int result = Integer.parseInt(scanner.nextLine());
            if (result >= 88) {
                System.out.println("Grade: A");
            } else if (result >= 87) {
                System.out.println("Grade: B");
            } else if (result >= 79) {
                System.out.println("Grade: C");
            } else if (result >= 66) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
            System.out.println("Do you wish to continue? [y/n]");
            confirmation = scanner.nextLine();
        } while(confirmation.equalsIgnoreCase("Y"));
    }
}
