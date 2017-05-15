
public class start {
	
	public static void main(String[] args) {
		Presentation present = new Presentation();
		present.insertSpeakers(new Speaker("Giovanni"),new Speaker("Manlio"),new Speaker("Enrico"));
		System.out.println(present.getSpeaker().getName());
	}

}
