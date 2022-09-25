package sort;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student implements Comparable<Student> {
    private String name;
    private String surName;
    private int age;

    //alternative comparison
    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}
