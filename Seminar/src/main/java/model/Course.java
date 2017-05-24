package model;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private final String name;
	private final int number;
	private final String description;
//	Initially I've wrote ArrayList<Student>, Manlio hints to declare using Interface 
//	so I can easily change the initialization from ArrayList to any kind of List implementations.
	private final List<Student> studentList;
	
	public Course(String name, int number, String description){
		this.name = name;
		this.number = number;
		this.description = description;
		this.studentList = new ArrayList<Student>();
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getNumber(){
		return this.number;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public List<Student> getStudentList(){
		return this.studentList;
	}
	
	public String studentsListToString(){
		String result = "";
		for(Student student: this.studentList){
			result += student.getFullName() + "\n";
		}
		return result;
	}

	public void addStudent(Student student) {
		if(student != null){
			this.studentList.add(student);
		}
	}

	public void removeStudent(Student student) {
		if(student != null){
			this.studentList.remove(student);
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		result = prime * result + ((studentList == null) ? 0 : studentList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (studentList == null) {
			if (other.studentList != null)
				return false;
		} else if (!studentList.equals(other.studentList))
			return false;
		return true;
	}
}
