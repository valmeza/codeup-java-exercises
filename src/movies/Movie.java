package movies;

import util.Input;

import java.util.Arrays;

public class Movie {
    private  String name;
    private  String category;
    Input userInput = new Input();

    public Movie(String name, String category) {
        System.out.println("Name: " + name + " " + "Genre: " + category);
    }

    // name getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // category getter and setter
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String genre) {
        this.category = genre;
    }
}
