package util;

import model.Seminar;

public class Printer {

		private final Seminar _seminar;

		public Printer(Seminar seminar) {
			_seminar = seminar;
		}

		public String printHtml() {
			return new PrinterHTML().print(_seminar);
		}

		public String printCSV() {
			return new PrinterCSV().print(_seminar); 
		}
}

