package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {

	private final String _name;
	private final int _number;
	private final String _description;
//	Initially I've wrote ArrayList<Student>, Manlio hints to declare using Interface 
//	so I can easily change the initialization from ArrayList to any kind of List implementations.
	private final List<Student> _studentList;
	private final Date _initDate;
	
	public Course(String name, int number, String description){
		this._name = name;
		this._number = number;
		this._description = description;
		this._studentList = new ArrayList<Student>();
		this._initDate = new Date();
	}
	
	public String getName(){
		return this._name;
	}
	
	public int getNumber(){
		return this._number;
	}
	
	public String getDescription(){
		return this._description;
	}
	
	public List<Student> getStudentList(){
		return this._studentList;
	}
	
	public String getDate(){
		return this._initDate.toString();
	}
	
	public String studentsListToString(){
		String result = "";
		for(Student student: this._studentList){
			result += student.getFullName() + "\n";
		}
		return result;
	}

	public void addStudent(Student student) {
		if(student != null){
			this._studentList.add(student);
		}
	}

	public void removeStudent(Student student) {
		if(student != null){
			this._studentList.remove(student);
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_description == null) ? 0 : _description.hashCode());
		result = prime * result + ((_name == null) ? 0 : _name.hashCode());
		result = prime * result + _number;
		result = prime * result + ((_studentList == null) ? 0 : _studentList.hashCode());
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
		if (_description == null) {
			if (other._description != null)
				return false;
		} else if (!_description.equals(other._description))
			return false;
		if (_name == null) {
			if (other._name != null)
				return false;
		} else if (!_name.equals(other._name))
			return false;
		if (_number != other._number)
			return false;
		if (_studentList == null) {
			if (other._studentList != null)
				return false;
		} else if (!_studentList.equals(other._studentList))
			return false;
		return true;
	}
}
