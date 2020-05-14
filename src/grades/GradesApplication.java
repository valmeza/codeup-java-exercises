package grades;

import java.util.HashMap;

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

        students.put("github " + john.getName(), john);
        students.put("github " + luke.getName(), luke);
        students.put("github " + maria.getName(), maria);
        students.put("github " +  kyle.getName(), kyle);

        userResponse(students);
    }

    public static void userResponse(HashMap<String, Student> students) {
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of out students");

        for(String username : students.keySet()) {
            System.out.print("| ");
            System.out.printf("%s", username);
            System.out.print(" | ");
        }
    }
}
