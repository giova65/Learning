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
		Seminar seminar = new Seminar("Seminario", "Nuovo seminario", 3, "Mendrisio");
		assertThat(seminar.getLocation(), is("Mendrisio"));
	}
	
	@Test
	public void testAddCourse(){
		Seminar seminar = new Seminar("Seminario", "Nuovo seminario", 3, "Mendrisio");
		seminar.addCourse(new Course("Cucina", 1, "corso di cucina"));
		assertThat(seminar.getSeatsLeft(), is(3));
		assertThat(seminar.getAllCourses().size(), is(1));
	}
	
	@Test
	public void testAfterAddStudent(){
		Seminar seminar = new Seminar("Seminario", "Nuovo seminario", 3, "Mendrisio");
		Course firstCourse = new Course("Cucina", 1, "corso di cucina");
		Course secondCourse = new Course("Inglese", 2, "corso di inglese");
		Student firstStudent = new Student("Giovanni", "Mele");
		Student secondStudent = new Student("Giovanni", "Mele");
		Student thirsStudent = new Student("Giovanni", "Mele");
		firstCourse.addStudent(firstStudent);
		secondCourse.addStudent(secondStudent);
		secondCourse.addStudent(thirsStudent);
		seminar.addCourse(firstCourse);
		seminar.addCourse(secondCourse);
		assertThat(seminar.getSeatsLeft(), is(0));
		assertThat(seminar.getAllCourses().size(), is(2));
		assertThat(seminar.getAllCourses().get(1).getStudentList().get(0).getFullName(), is("Giovanni Mele"));
	}
	
	@Test
	public void testAddStudentToCourse(){
		Seminar seminar = new Seminar("Seminario", "Nuovo seminario", 3, "Mendrisio");
		Course course = new Course("Cucina", 1, "corso di cucina");
		seminar.addCourse(course);
		Student student = new Student("Giovanni", "Mele");
		seminar.addStudentToCourse(1, student);
		assertThat(seminar.getSeatsLeft(), is(2));
		assertThat(seminar.getAllCourses().get(1).getStudentList().get(0).getFullName(), is("Giovanni Mele"));
	}
	
	@Test
	public void testGetStudentsList(){
		Seminar seminar = new Seminar("Seminario", "Nuovo seminario", 3, "Mendrisio");
		Course firstCourse = new Course("Cucina", 1, "corso di cucina");
		Course secondCourse = new Course("Inglese", 2, "corso di inglese");
		seminar.addCourse(firstCourse);
		seminar.addCourse(secondCourse);
		Student student1 = new Student("Giovanni", "Mele");
		Student student2 = new Student("Enrico", "Mangano");
		Student student3 = new Student("Manlio", "Modugno");
		seminar.addStudentToCourse(firstCourse.getNumber(), student1);
		seminar.addStudentToCourse(secondCourse.getNumber(), student2);
		seminar.addStudentToCourse(secondCourse.getNumber(), student3);
		assertThat(seminar.getSeatsLeft(), is(0));
		assertThat(seminar.getStudentsList(), is("Giovanni Mele\nEnrico Mangano\nManlio Modugno\n"));
	}
}
