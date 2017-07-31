package com.test.model;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.app.model.Course;
import com.app.model.Student;

import utils.Time;


public class CourseTest {
	
	private Course _course;
	
	@Before
	public void init(){
		_course = new Course(1, "test", new Time("24.07.2017"), "Mendrisio", 2, "is a test");
	}
	
	
	@Test
	public void enrollStudent() throws Exception {
		_course.enroll(new Student("Giovanni", "Mele"));
		assertThat(_course.seatsLeft(), is(1));
	}
	
	@Test
	public void noMoreSeats() throws Exception {
		_course.enroll(new Student("Giovanni", "Mele"));
		_course.enroll(new Student("Manlio", "Modugno"));
		assertThat(_course.enroll(new Student("Manlio", "Vacca")), is(false));
	}
	
	@Test
	public void listStudents() throws Exception {
		_course.enroll(new Student("Giovanni", "Mele"));
		assertThat(_course.students().size(), is(1));
	}
	
	@Test
	public void startDate() throws Exception {
		assertThat(_course.startDate().toString(), is(new Time("24.07.2017").toString()));
	}
	
	@Test
	public void totalSeats() throws Exception {
		assertThat(_course.totalSeats(), is(2));
	}
}
