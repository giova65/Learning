
public class InLineMethod {

	private final int _numberOfLateDeliveries = 0;
	
	int getRating(){
		return (_numberOfLateDeliveries > 5) ? 2 : 1;
	}
	
}
