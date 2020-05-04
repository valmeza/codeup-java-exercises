import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] args) {
        // 1. Loop Basics
        // a. While
        int i = 5;
        while(i <= 15) {
            System.out.println("While: i = " + i);
            i++;
        }
        // b. Do While
        int a = 0;
        do {
            System.out.println("Do while: a = " + a);
            a+=2;
        } while (a <= 100);

        int b = 100;
        do {
            System.out.println("Count backwards: b = " + b);
            b-=5;
        } while (b >= -10);

        long c = 2L;
        do {
            System.out.println("c = " + c);
            c*=c;
        } while (c < 1000000);

        // c. for
        for(int y = 5; y <= 15; y++) {
            System.out.println("for loop: y = " + y);
        }

        for(int l = 0; l <= 100; l+=2) {
            System.out.println("for loop: l = " + l);
        }

        for(int backward = 100; backward >= -10; backward-=5) {
            System.out.println("for loop: backward = " + backward);
        }

        for(long n = 2L; n < 1000000; n*=n) {
            System.out.println("for loop: n = " + n);
        }

        // 2. FizzBuzz
        for(int fizzbuzz = 1; fizzbuzz <= 100; fizzbuzz++) {
            if(fizzbuzz % 3 == 0 && fizzbuzz % 5 == 0) {
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

        for(int squared = 1; squared <= inputSquared; squared++){
            System.out.println("Number: " + squared +" "+ "Squared: " + squared * squared + " " + "Cubed: " + squared * squared * squared);
        }
    }
}
