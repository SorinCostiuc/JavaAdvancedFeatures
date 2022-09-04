package exercitii.catalog;

public class Main {
    public static void main(String[] args) {
        /*
       - Facem un catalog care va tine mai multi studenti (nume, prenume, email)
         */
        Student georgel = new Student("George", "Coconel", "234654987");
        Student vasilel = new Student("Vasile", "Vlahel", "7841321");
        Catalog studentGrade = new Catalog();
        studentGrade.addGrade(georgel, new Grade(10, Course.MATHEMATICS));
        studentGrade.addGrade(georgel, new Grade(8, Course.COMPUTER_SCIENCE));
        studentGrade.addGrade(georgel, new Grade(6, Course.COMPUTER_SCIENCE));
        studentGrade.addGrade(georgel, new Grade(4, Course.PHYSICS));

        studentGrade.addGrade(vasilel, new Grade(8, Course.MATHEMATICS));
        studentGrade.addGrade(vasilel, new Grade(10, Course.COMPUTER_SCIENCE));
        studentGrade.addGrade(vasilel, new Grade(9, Course.COMPUTER_SCIENCE));
        studentGrade.addGrade(vasilel, new Grade(7, Course.PHYSICS));

        studentGrade.printGrades(georgel);
        studentGrade.printGrades(vasilel);
        System.out.println("---------------" + "\n" + "---------------");
        studentGrade.printAverage(georgel);
        studentGrade.printAverage(vasilel);

    }
}
