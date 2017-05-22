package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Seminar {
	private final String location;
	private int seatsLeft;
	private final String name;
	private final String description;
	private final Map<Integer, Course> allCourses;
	
	public Seminar(String name, String description, int seats, String location){
		this.name = name;
		this.description = description;
		this.seatsLeft = seats;
		this.location = location;
		this.allCourses = new HashMap<Integer, Course>();
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public String getLocation(){
		return this.location;
	}
	
	public int getSeatsLeft(){
		return this.seatsLeft;
	}
	
	public String getStudentsList(){
		//StringBuilder seems to be better but is not real improvement
		StringBuilder studentsList = new StringBuilder();
		for (Entry<Integer, Course> entry : allCourses.entrySet()) {
		    studentsList.append(entry.getValue().studentsListToString());
		}
		return studentsList.toString();
	}
	
	public void addCourse(Course course){
		this.allCourses.put(course.getNumber(), course);
		if(course.getStudentList().size() > 0 && this.seatsLeft > 0){
			this.seatsLeft = this.seatsLeft - (this.allCourses.get(course.getNumber()).getStudentList().size());
		}
	}
	
	public void addStudentToCourse(int courseID, Student student){
		if(this.seatsLeft > 0){
			this.allCourses.get(courseID).addStudent(student);
			this.seatsLeft--;
		}
	}
	
	public Map<Integer, Course> getAllCourses(){
		return this.allCourses;
	}
}
