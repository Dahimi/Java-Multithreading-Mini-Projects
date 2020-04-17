package human;

import java.util.*;

public class University  {
	private String name ; 
	private int age ; 
	private List<Student> students = new ArrayList();

	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public University(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

    public Student getStudentWithAverageGrade(double averageGrade){
        for(Student student : students ){
            if(student.getAverageGrade()== averageGrade) return student;
        }
        return null ;
    }
    public Student getStudentWithHighestAverageGrade() {
    	return Collections.max(students);
    }
    public Student getStudentWithLowestAverageGrade() {
      return Collections.min(students);  
    }
    public void expel(Student student){
        students.remove(student);
    }
}