package sort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = Student.builder()
                .name("Costiuc")
                .surName("Sorin")
                .age(32)
                .build();
        Student student2 = Student.builder()
                .name("Cernescu")
                .surName("Stefan")
                .age(27)
                .build();
        Student student3 = Student.builder()
                .name("Sabie")
                .surName("Bogdan")
                .age(27)
                .build();

        List<Student> students = new ArrayList<>(List.of(student3, student1, student2));
        System.out.println(students);

//        students.sort(Comparator.comparingInt(Student::getAge));
//        System.out.println(students);

//        alternative comparison
        Collections.sort(students);
        System.out.println(students);
    }
}
