package model;

import util.Printer;

public class SeminarDetails {

	public static void main(String[] args) {
		
		Seminar seminar = new Seminar("Seminario", "Primo Seminario", 4, "Mendrisio");
		Course firstCourse = new Course("Inglese", 1, "Corso di inglese");
		firstCourse.addStudent(new Student("Giovanni", "Mele"));
		firstCourse.addStudent(new Student("Enrico", "Mangano"));
		firstCourse.addStudent(new Student("Manlio", "Modugno"));
		seminar.addCourse(firstCourse);
		
		String csv = new Printer(seminar).printCSV();
		String html = new Printer(seminar).printHtml();
		System.out.println(csv);
		System.out.println(html);
	}

}
