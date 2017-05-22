package util;

import model.Course;
import model.Seminar;

public interface SeminarPrinter {

	public String print(Seminar seminar);
	
	public String header(Seminar seminar);
	
	public String body(Course course);
	
	public String footer();
	
}
