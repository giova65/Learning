package model;

import java.util.ArrayList;

public class Course {
	
	private final String name;
	private final int number;
	private final String description;
	private final ArrayList<Student> studentList;
	
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
	
	public ArrayList<Student> getStudentList(){
		return this.studentList;
	}
	
	public String studentsListToString(){
		StringBuilder sb = new StringBuilder();
		for(Student student: this.studentList){
			sb.append(student.getFullName());
			sb.append("\n");
		}
		return sb.toString();
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
}
