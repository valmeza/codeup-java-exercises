package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public static void main(String[] args) {
        Student valeria = new Student("Valeria");

        valeria.addGrade(100);
        System.out.println("valeria.getName() = " + valeria.getName());
        System.out.println("valeria.getGradeAverage = " + valeria.getGradeAverage());
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