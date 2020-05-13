package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student trex = new Student("John");
        trex.addGrade(100);
        trex.addGrade(83);
        trex.addGrade(90);

        Student lukeSkywalker = new Student ("luke");
        lukeSkywalker.addGrade(40);
        lukeSkywalker.addGrade(50);
        lukeSkywalker.addGrade(4);

        Student barbie = new Student("maria");
        barbie.addGrade(90);
        barbie.addGrade(87);
        barbie.addGrade(79);

        Student mrCool123 = new Student("kyle");
        mrCool123.addGrade(9);
        mrCool123.addGrade(43);
        mrCool123.addGrade(3);

        students.put("Github: " + trex.getName(), trex);
        students.put("Github: " + lukeSkywalker.getName(), lukeSkywalker);
        students.put("Github: " + barbie.getName(), barbie);
        students.put("Github: " +  mrCool123.getName(), mrCool123);

    }

    public static void userPrompt(HashMap<String, Student> students) {
        System.out.println("Welcome");
        System.out.println("Here is a list of student's Github Usernames: ");
    }
}
