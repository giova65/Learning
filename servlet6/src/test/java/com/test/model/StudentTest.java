package com.test.model;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import com.app.model.Student;

public class StudentTest {

	@Test
	public void studentIs() throws Exception {
		Student student = new Student("Giovanni", "Mele");
		assertThat(student.name() + " " + student.lastname(), is("Giovanni Mele"));
	}
}
