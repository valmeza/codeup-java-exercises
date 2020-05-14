package grades;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        //Key is a Sting and will represent the github usernames
        // Value is the Student object
        HashMap<String, Student> students = new HashMap<>();

        Student john = new Student("john");
        john.addGrade(100);
        john.addGrade(83);
        john.addGrade(90);

        Student luke = new Student ("luke");
        luke.addGrade(40);
        luke.addGrade(50);
        luke.addGrade(4);

        Student maria = new Student("maria");
        maria.addGrade(90);
        maria.addGrade(87);
        maria.addGrade(79);

        Student kyle = new Student("kyle");
        kyle.addGrade(9);
        kyle.addGrade(43);
        kyle.addGrade(3);

        students.put("tyrannnosaurusRex", john);
        students.put("lukeSkyWalker", luke);
        students.put("cinderella", maria);
        students.put("mrCool247", kyle);

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
        do {
            Scanner response = new Scanner(System.in);
            System.out.println("Would you like to see another student? [y/no]");
            String yesNo = response.nextLine();
            if(yesNo.equalsIgnoreCase("y")) {
                welcome(students);
            } else {
                System.out.println("Goodbye, and have a wonderful day!");
            }
            return;
        } while(true);
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
