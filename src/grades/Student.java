package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public static void main(String[] args) {
        Student student1 = new Student("Valeria");
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(67);

        System.out.println("student1.getGradeAverage() = " + student1.getGradeAverage());
        
        Student student2 = new Student("Gina");
        student2.addGrade(89);
        student2.addGrade(65);
        student2.addGrade(0);

        System.out.println("student2.getGradeAverage() = " + student2.getGradeAverage());
        
        Student student3 = new Student("Leo");
        student3.addGrade(34);
        student3.addGrade(100);
        student3.addGrade(99);

        System.out.println("student3.getGradeAverage() = " + student3.getGradeAverage());
    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (Integer average : this.grades) {
            sum += average;
        }
        return sum / this.grades.size();
    }
}