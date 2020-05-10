package movies;

import util.Input;

import java.util.Arrays;

public class Movie {
    Input userInput = new Input();
    private String name;
    private String category;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String genre) {
        this.category = genre;
    }

    public Movie(String name, String category) {
//        System.out.println("What would you like to do?");
//        System.out.println();
//        System.out.println("0 - exit");
//        System.out.println("1 - view all movies");
//        System.out.println("2 - view movies in the animated category");
//        System.out.println("3 - view movies in the drama category");
//        System.out.println("4 - view movies in the horror category");
//        System.out.println("5 - view movies in the scifi category");
//        System.out.println();
        int user = userInput.getInt();
        System.out.println("Enter your choice: " + user);
        if(user == 1) {

        }
    }
}
