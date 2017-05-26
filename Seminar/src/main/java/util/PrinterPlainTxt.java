package util;

import model.Course;
import model.Seminar;

public class PrinterPlainTxt extends SeminarPrinter{

//	@Override
//	public String print(Seminar seminar) {
//		return null;
//	}

	@Override
	public String header(Seminar seminar) {
		return null;
	}

	@Override
	public String body(Course course) {
		return null;
	}

	@Override
	public String footer() {
		return null;
	}

}
