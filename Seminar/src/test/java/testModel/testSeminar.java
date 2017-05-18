package testModel;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import model.Course;
import model.Seminar;
import model.Student;

public class testSeminar {
	
	@Test
	public void testGetName(){
		Seminar seminar = new Seminar("Seminario", "Nuovo seminario", 3, "Mendrisio");
		assertThat(seminar.getName(), is("Seminario"));
	}
	
	@Test
	public void testGetDescription(){
		Seminar seminar = new Seminar("Seminario", "Nuovo seminario", 3, "Mendrisio");
		assertThat(seminar.getDescription(), is("Nuovo seminario"));
	}
	
	@Test
	public void testGetLocation(){
		Seminar seminar = new Seminar("Seminario", "Nuovo semianrio", 3, "Mendrisio");
		assertThat(seminar.getLocation(), is("Mendrisio"));
	}
	
	@Test
	public void testAddCourse(){
		Seminar seminar = new Seminar("Seminario", "Nuovo semianrio", 3, "Mendrisio");
		seminar.addCourse(new Course("Cucina", 1, "corso di cucina"));
		assertThat(seminar.getSeatsLeft(), is(3));
		assertThat(seminar.getAllCourses().size(), is(1));
	}
	
	@Test
	public void testAfterAddStudent(){
		Seminar seminar = new Seminar("Seminario", "Nuovo semianrio", 3, "Mendrisio");
		Course course = new Course("Cucina", 1, "corso di cucina");
		Student student = new Student("Giovanni", "Mele");
		course.addStudent(student);
		seminar.addCourse(course);
		assertThat(seminar.getSeatsLeft(), is(2));
		assertThat(seminar.getAllCourses().size(), is(1));
		assertThat(seminar.getAllCourses().get(1).getStudentList().get(0).getFullName(), is("Giovanni Mele"));
	}
	
	@Test
	public void testAddStudentToCourse(){
		Seminar seminar = new Seminar("Seminario", "Nuovo semianrio", 3, "Mendrisio");
		Course course = new Course("Cucina", 1, "corso di cucina");
		seminar.addCourse(course);
		assertThat(seminar.getSeatsLeft(), is(3));
		assertThat(seminar.getAllCourses().size(), is(1));
		Student student = new Student("Giovanni", "Mele");
		seminar.addStudentToCourse(1, student);
		assertThat(seminar.getSeatsLeft(), is(2));
		assertThat(seminar.getAllCourses().get(1).getStudentList().get(0).getFullName(), is("Giovanni Mele"));
	}
}
