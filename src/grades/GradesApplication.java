package grades;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        //Key is a Sting and will represent the github usernames
        // Value is the Student object
        HashMap<String, Student> students = new HashMap<>();

        Student john = new Student("tyrannosaurusRex");
        john.addGrade(100);
        john.addGrade(83);
        john.addGrade(90);

        Student luke = new Student ("lukeSkywalker");
        luke.addGrade(40);
        luke.addGrade(50);
        luke.addGrade(4);

        Student maria = new Student("cinderella");
        maria.addGrade(90);
        maria.addGrade(87);
        maria.addGrade(79);

        Student kyle = new Student("mrCool247");
        kyle.addGrade(9);
        kyle.addGrade(43);
        kyle.addGrade(3);

        students.put(john.getName(), john);
        students.put(luke.getName(), luke);
        students.put(maria.getName(), maria);
        students.put(kyle.getName(), kyle);
        welcome(students);
    }

    public static void welcome(HashMap<String, Student> students) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students");

        for(String username : students.keySet()) {
            System.out.print("| ");
            System.out.printf("%s", username);
            System.out.print(" | ");
        }
        System.out.println();
        System.out.println("What student would you like to see more information on?");
        String user = input.next();

        response(students, user);
    }

    public static void response(HashMap<String, Student> students, String username) {


        Student match;

        if(!students.containsKey(username)) {
            System.out.println("Sorry, no student was found with the Github username of " + username);
        } else {
            match = students.get(username);
            System.out.println("Name: " + match.getName() + " Github: " + username);
            System.out.printf("Current Grade Average: %,.1f%n", match.getGradeAverage());
        }
    }

}
