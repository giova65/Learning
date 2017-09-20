package com.app.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.Time;

public class Course {
	
	public static final String ID = "Id";
	public static final String NAME = "Name";
	public static final String DESCRIPTION = "Description";
	public static final String LOCATION = "Location";
	public static final String START_DATE = "Start";
	public static final String TOTAL_SEATS = "TotalSeats";

	private final Integer _id;
	private final String _name;
	private final String _description;
	private final String _location;
	private final Time _startDate;
	private final Integer _totalSeats;

	private final List<Student> _students = new ArrayList<>();

	public Course(Integer id, String courseName, Time startDate, String location, Integer totalSeats, String description) {
		_name = courseName;
		_id = id;
		_description = description;
		_totalSeats = totalSeats;
		_location = location;
		_startDate = startDate;
	}

	public String name() {
		return _name;
	}

	public Integer id() {
		return _id;
	}

	public String description(){
		return _description;
	}

	public String location() {
		return _location;
	}

	public int seatsLeft() {
		return totalSeats() - _students.size();
	}

	public boolean enroll(Student student) {
		if (_students.size() < totalSeats()) {
			return _students.add(student);
		}

		return false;
	}

	public List<Student> students() {
		return Collections.unmodifiableList(_students);
	}

	public Time startDate() {
		return _startDate;
	}

	public Integer totalSeats() {
		return _totalSeats;
	}
}