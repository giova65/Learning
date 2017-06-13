
public class ReplaceTempWithQuery {
	
	private final int _quantity = 0;
	private final int _itemPrice = 0;
	
	public double method(){
		if(basePrice() > 10){
			return  basePrice() * 0.5;
		}else{
			return basePrice() * 1;
		}
	}
	
//	double basePrice(){
//		return _quantity * _itemPrice;
//	}
	
	
	/////////// second example
	
//	public double getPrice(){
//		int basePrice = _quantity * _itemPrice;
//		double discountFactor;
//		if(basePrice > 1000) discountFactor = 0.95;
//		else discountFactor = 0.98;
//		return basePrice * discountFactor;
//	}
	
	public double getPrice(){
		return basePrice() * discountFactor(basePrice());
	}
	
	public int basePrice(){
		return _quantity * _itemPrice;
	}
	
	public double discountFactor(double basePrice){
		if(basePrice > 1000){
			return 0.95;
		}else{
			return 0.98;
		}
	}
}
