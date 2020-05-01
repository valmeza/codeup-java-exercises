import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);
//
//
//        System.out.println("Enter a number: ");
//        int number = scanner.nextInt();
//
//        System.out.println("Number Entered: " + number);
//
        System.out.println("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.printf("Words Entered: %s, %s, %s \n", word1, word2, word3);
        scanner.nextLine();

        System.out.println("Write a sentence: ");
        String sentenceInput = scanner.nextLine();
        System.out.println(sentenceInput + "\n");

    }
}
