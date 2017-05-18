package model;

public class SeminarDetails {

	public static void main(String[] args) {
		
		Seminar seminar = new Seminar("Seminario", "Primo Seminario", 4, "Mendrisio");
		Course firstCourse = new Course("Inglese", 1, "Corso di inglese");
		Course secondCourse = new Course("Matematica", 2, "Corso di matematica");
		firstCourse.addStudent(new Student("Giovanni", "Mele"));
		firstCourse.addStudent(new Student("Enrico", "Mangano"));
		firstCourse.addStudent(new Student("Manlio", "Modugno"));
		seminar.addCourse(firstCourse);
		System.out.println("******************************\n");
		System.out.println("Seminario di " + seminar.getName() + " descrizione " + seminar.getDescription()+ "\n");
		System.out.println("Il seminario si terrà presso " + seminar.getLocation() + " e al momento sono ci sono ancora " + seminar.getSeatsLeft() + " disponibili \n");
		System.out.println("*****************************" + "\n\nGli studenti attualmente iscritti sono: \n");

		if(seminar.getSeatsLeft() == 4){
			System.out.println("AL MOMENTO NON SONO PRESENTI ISCRIZIONI");
		}else {
			System.out.println(seminar.getStudentsList());
		}
	}

}
