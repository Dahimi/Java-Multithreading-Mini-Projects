package human;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends UniversityPerson {
    private int numberOfStudents;
   
    
    public Teacher(String name, int age, int numberOfStudents) {
        super(name, numberOfStudents);
        this.numberOfStudents = numberOfStudents;
    }

    public void live() {
        teach();
    }
    public String getPosition() {
    	return "Teacher";
    }


    public void teach() {
    }
   
    
}