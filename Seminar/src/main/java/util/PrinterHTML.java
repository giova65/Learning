package util;

import model.Course;
import model.Seminar;
import model.Student;

public class PrinterHTML implements SeminarPrinter{

	public String print(Seminar seminar) {
		return null;
	}

	public String header(Seminar seminar) {
		return "<html>" + "<head><title>" + seminar.getName()
						+ "</title></head><body><div>"
						+ seminar.getName() + ":</div><ul><li>"
						+ seminar.getDescription() + "</li><li>"
						+ seminar.getLocation() + "</li><li>" + seminar.getSeatsLeft()
						+ "</li></ul><div>partecipanti:</div><ul>";
	}

	public String body(Course course) {
		String body = "";
		for(Student student : course.getStudentList()){
			body += "<li>" + student.getFullName()  + "</li>";
		}
		return body;
	}

	public String footer() {
		return "</ul>" + "</body>" + "</html>";
	}
	

}
