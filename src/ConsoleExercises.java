import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);


        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Number Entered: " + number);

        System.out.println("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.printf("Words Entered: %s, %s, %s \n", word1, word2, word3);
        scanner.nextLine();

        System.out.println("Write a sentence: ");
        String sentenceInput = scanner.nextLine();
        System.out.println(sentenceInput + "\n");

//        System.out.println("Enter length and width:");
//        int length = scanner.nextInt();
//        int width = scanner.nextInt();
//        int area = length * width;
//        int perimeter = length + length + width + width;
//        System.out.printf("The area is: %d \n", area);
//        System.out.printf("The perimeter is: %d", perimeter);

//        System.out.print("Width: \n");
//        String width = scanner.nextLine();
//        System.out.print("Length: \n");
//        String length = scanner.nextLine();
//        int perimeter = (Integer.parseInt(width) * 2) + (Integer.parseInt(length) * 2);
//        int area = (Integer.parseInt(width) * Integer.parseInt(length));
//        System.out.printf("Perimeter: %d%n", perimeter);
//        System.out.printf("Area: %d%n", area);

        System.out.println("Give me a Width");
        float width = Float.parseFloat(scanner.nextLine());

        System.out.println("Give me a Length");
        float length = Float.parseFloat(scanner.nextLine());

        float area = width * length;
        float perimeter = (width * 2) + (length * 2);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
