public class MethodsExercises {
    public static void main(String[] args) {
        //Main
        System.out.println("Addition: " + addition(1,1));
        System.out.println("Subtraction: " + subtraction(1,5));
        System.out.println("Multiplication: " + multiplication(5, 5));
        System.out.println("Division: " + division(0, 1));
        System.out.println("Modulus: " + modulus(5, 2));
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }
}
