package model;

import java.util.HashMap;

public class Seminar {
	private final String location;
	private int seatsLeft;
	private final String name;
	private final String description;
	private final HashMap<Integer, Course> allCourses;
	
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
	
	public void addCourse(Course course){
		this.allCourses.put(course.getNumber(), course);
		this.seatsLeft = this.seatsLeft - course.getStudentList().size();
	}
	
	public HashMap<Integer, Course> getAllCourses(){
		return this.allCourses;
	}
}
