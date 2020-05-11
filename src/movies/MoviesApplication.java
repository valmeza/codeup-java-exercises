package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {

        boolean running = true; // start at true unless user hits 0 to exit.

        while (running) {
            System.out.println(returnMenuDisplay()); // this will display our menu

            int response = returnResponse();
            running = executeChoice(response); // this is our way out of the loop
        }
    }

    private static boolean executeChoice(int choice) {
        boolean continueRunningApp = true;

        switch (choice) {
            case 0:
                continueRunningApp = false;
                break;
            case 1: // view all movies
                System.out.println("\n");
                viewMoviesByCategory("");
                System.out.println("\n");
                break;
            case 2: // view all movies
                System.out.println("\n");
                viewMoviesByCategory("animated");
                System.out.println("\n");
                break;
            case 3: // view all movies
                System.out.println("\n");
                viewMoviesByCategory("drama");
                System.out.println("\n");
                break;
            case 4: // view all movies
                System.out.println("\n");
                viewMoviesByCategory("horror");
                System.out.println("\n");
                break;
            case 5: // view all movies
                System.out.println("\n");
                viewMoviesByCategory("scifi");
                System.out.println("\n");
                break;

        }
        return continueRunningApp;
    }

    private static int returnResponse() {
        Input input = new Input();
        int response = input.getInt(0, 5);
        return returnResponse();
    }

    private static void viewMoviesByCategory(String category) {
        for(Movie movie : MoviesArray.findAll()) {
            if(movie.getCategory().equalsIgnoreCase("category")) {
                // display the movie
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
            }
        }
    }

    private static String returnMenuDisplay() { // creating a menu method to keep main clean
        String choices =
                "What would you like to do? What would you like to do?\n" +
                        "\n" +
                        "0 - exit\n" +
                        "1 - view all movies\n" +
                        "2 - view movies in the animated category\n" +
                        "3 - view movies in the drama category\n" +
                        "4 - view movies in the horror category\n" +
                        "5 - view movies in the scifi category\n";
        return choices;
    }
}
