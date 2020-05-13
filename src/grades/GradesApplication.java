package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Valeria");
        student1.addGrade(100);
        student1.addGrade(83);
        student1.addGrade(90);

        Student student2 = new Student ("Leo");
        student2.addGrade(40);
        student2.addGrade(50);
        student2.addGrade(4);

        Student student3 = new Student("Gina");
        student3.addGrade(90);
        student3.addGrade(87);
        student3.addGrade(79);

        Student student4 = new Student("Random");
        student4.addGrade(9);
        student4.addGrade(43);
        student4.addGrade(3);
    }
}
