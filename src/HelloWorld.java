public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world from a new line!");
        System.out.print("Hello World w/o new line");
        System.out.print("Hello World w/o new line \n");

        // Exercise

        int myFavoriteNumber = 100;
        System.out.println(myFavoriteNumber);

        String myString = "Valeria";
        System.out.println(myString);

        long myNumber = 123;
        System.out.println(myNumber);

// Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        // 3.14 returns as a double, and the integer is within the range of the long.

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);
    }
}
