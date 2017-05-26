package util;

import java.util.Map.Entry;

import model.Course;
import model.Seminar;
import model.Student;

public class PrinterCSV extends SeminarPrinter{
	
//	@Override
//	public String print(Seminar seminar) {
//		String result = header(seminar);
//		for (Entry<Integer, Course> entry : seminar.getAllCourses().entrySet()) {
//			result += body(entry.getValue());
//		}
//		result += footer();
//
//		return result;
//	}

	@Override
	public String header(Seminar seminar) {
		String header = "";
		for (Entry<Integer, Course> entry : seminar.getAllCourses().entrySet()) {
			header += quote(entry.getValue().getNumber()) + ";";
			header += quote(entry.getValue().getDescription()) + ";";
			header += quote(seminar.getLocation()) + ";";
			header += quote(seminar.getSeatsLeft()) + System.getProperty("line.separator");
		}
		return header;
	}
	
	@Override
	public String body(Course course) {
		String body = "";
		for(Student student : course.getStudentList()){
			body += quote(student.getName()) + ";" + quote(student.getSurname()) + System.getProperty("line.separator");
		}
		return body;
	}
	
	@Override
	public String footer() {
		return "";
	}

	private String quote(Object field) {
		return wrap("\"", field);
	}

	private String wrap(String wrapper, Object wrapped) {
		return wrapper + wrapped + wrapper;
	}

	
}
