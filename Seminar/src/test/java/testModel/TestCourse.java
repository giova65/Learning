package testModel;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import model.Course;
import model.Student;

public class TestCourse {

	@Test
	public void testGetName() {
		Course course = new Course("Cucina", 3, "Corso di cucina");
		assertThat(course.getName(), is("Cucina"));
	}

	@Test
	public void testGetNumber() {
		Course course = new Course("Cucina", 3, "Corso di cucina");
		assertThat(course.getNumber(), is(3));
	}

	@Test
	public void testGetDescription() {
		Course course = new Course("Cucina", 3, "Corso di cucina");
		assertThat(course.getDescription(), is("Corso di cucina"));
	}

	@Test
	public void testGetStudentList() {
		Course course = new Course("Cucina", 3, "Corso di cucina");
		assertThat(course.getStudentList().size(), is(0));
	}

	@Test
	public void testAddStudent() {
		Course course = new Course("Cucina", 3, "Corso di cucina");
		course.addStudent(new Student("Giovanni", "Mele"));
		assertThat(course.getStudentList().size(), is(1));
		assertThat(course.getStudentList().get(0).getFullName(), is("Giovanni Mele"));
	}

	@Test
	public void testRemoveStudent() {
		Course course = new Course("Cucina", 3, "Corso di cucina");
		course.addStudent(new Student("Giovanni", "Mele"));
		course.removeStudent(new Student("Giovanni", "Mele"));
		assertThat(course.getStudentList().size(), is(0));
	}
	
	@Test
	public void testStudentsList(){
		Course course = new Course("Cucina", 3, "Corso di cucina");
		course.addStudent(new Student("Giovanni", "Mele"));
		course.addStudent(new Student("Enrico", "Mangano"));
		assertThat(course.studentsListToString(), is("Giovanni Mele\nEnrico Mangano\n"));
	}
	

}
