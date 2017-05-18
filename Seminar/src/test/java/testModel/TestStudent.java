package testModel;
import static org.junit.Assert.*;

import org.junit.Test;

import model.Student;

public class TestStudent {
	
	@Test
	public void testGetName(){
		Student student = new Student("Giovanni","Mele");
		assertEquals(student.getFullName(), "Giovanni Mele");
	}
}
