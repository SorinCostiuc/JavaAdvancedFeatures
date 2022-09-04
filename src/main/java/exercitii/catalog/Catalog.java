package exercitii.catalog;

import java.util.*;

public class Catalog {
    Map<Student, List<Grade>> studentGrades;

    public Catalog(Map<Student, List<Grade>> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public Catalog() {
        this.studentGrades = new HashMap<>();
    }


    public Catalog addGrade(Student student, Grade grade) {
        if (studentGrades.get(student) == null) {
            studentGrades.put(student, new ArrayList<>(Arrays.asList(grade)));
        } else {
            studentGrades.get(student).add(grade);
        }
        return this;
    }

    public void printGrades(Student student) {
        for (Grade studentGrade : studentGrades.get(student)) {
            System.out.println(studentGrade);
        }
    }
}
