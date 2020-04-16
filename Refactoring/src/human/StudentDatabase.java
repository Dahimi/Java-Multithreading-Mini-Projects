package human;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    public static List<Student> students = new ArrayList<>();

    public static void addStudentInfo(String name, int age, double averageGrade) {
        Student student = new Student(name, age, averageGrade);
        students.add(student);
        printStudentInfo(student.getName(), student);

    }

    public static void printStudentInfo(String name, Student student) {
        System.out.println("Name: " + name + " Age: " + student.getAge());
    }

    public static void removeStudent(int index) throws IndexOutOfBoundsException {
        students.remove(index);
    }
    

    public static void findJohnOrAlex() {
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (!found) {
                if (students.get(i).getName().equals("John")) {
                    System.out.println("John is in the student database.");
                    found = true;
                }

                if (students.get(i).getName().equals("Alex")) {
                    System.out.println("Alex is in the student database.");
                    found = true;
                }
            }
        }
    }
}