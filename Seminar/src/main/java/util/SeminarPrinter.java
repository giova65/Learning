package util;

import java.util.Map.Entry;

import model.Course;
import model.Seminar;

public abstract class SeminarPrinter {

	public String print(Seminar seminar){
			String result = header(seminar);
			for (Entry<Integer, Course> entry : seminar.getAllCourses().entrySet()) {
				result += body(entry.getValue());
			}
			result += footer();
	
			return result;
	};
	
	public abstract String header(Seminar seminar);
	
	public abstract String body(Course course);
	
	public abstract String footer();
	
}
