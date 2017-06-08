
public class ReplaceTempWithQuery {
	
	private final double _quantity = 0.0;
	private final double _itemPrice = 0.0;
	
	public double method(){
		if(basePrice() > 10){
			return  basePrice() * 0.5;
		}else{
			return basePrice() * 1;
		}
	}
	
	double basePrice(){
		return _quantity * _itemPrice;
	}
}
