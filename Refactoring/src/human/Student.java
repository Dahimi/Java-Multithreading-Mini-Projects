package human;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends UniversityPerson implements Comparable<Student>{
    private double averageGrade;
    

	private Date beginningOfSession;
    private Date endOfSession;
    private int course;

    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.averageGrade = averageGrade;
    }

    public int getCourse() {
        return course;
    }

    public void live() {
        learn();
    }

    public void learn() {
    }
    public String getPosition() {
    	return "Student";
    }
    

    public void incAverageGrade(double delta) {
        averageGrade += delta;
    }
    public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}

	public void setCourse(int course) {
		this.course = course;
	}

    public void setBeginningOfSession(Date date) {
        beginningOfSession = date ;
    }

    public void setEndOfSession(Date date) {
        endOfSession = date;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return (int) (10 * (this.averageGrade - student.getAverageGrade()));
	}
}