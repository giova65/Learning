import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExtractMethod{
	
	private final String _name = "Giovanni";
	private final List<String> _orders = new ArrayList<String>();
	
//	void printOwning(double amount){
//		printDetails(amount);
//	}
//
//	private void printDetails(double amount) {
//		System.out.println("name:" + _name);
//		System.out.println("amount:" + amount);
//	}
	
	void printOwing(){
		
		//print banner
		printBanner();
		
		//print details
		printDetails();
	}

	private void printBanner() {
		System.out.println("xxxxx");
		System.out.println("******");
		System.out.println("xxxxx");
	}

	private double calculate() {
		double outstanding = 0.0;
		Iterator e = _orders.iterator();
		while(e.hasNext()){
			String each = (String)e.next();
			outstanding += each.length();
		}
		return outstanding;
	}

private void printDetails() {
	System.out.println("name: " + _name);
	System.out.println("amount:" + calculate());
}
	
	

}
