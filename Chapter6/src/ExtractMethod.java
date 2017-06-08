public class ExtractMethod{
	
	private final String _name = "Giovanni";
	
	void printOwning(double amount){
		printDetails(amount);
	}

	private void printDetails(double amount) {
		System.out.println("name:" + _name);
		System.out.println("amount:" + amount);
	}
	
	

}
