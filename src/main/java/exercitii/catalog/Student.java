package exercitii.catalog;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String CNP;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCNP() {
        return CNP;
    }
    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public Student(String firstName, String lastName, String CNP) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.CNP = CNP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return firstName.equals(student.firstName) && lastName.equals(student.lastName) && CNP.equals(student.CNP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, CNP);
    }
}
