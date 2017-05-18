package model;

public class Student {
	private final String name;
	private final String surname; 
	
	public Student(String name, String surname){
		this.name = name;
		this.surname = surname;
	}
	
	public String getFullName(){
		return this.name + " " + this.surname;
	}
}
