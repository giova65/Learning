
public class ReplaceMethodWithObject {

	class Account{
		int gamma(int inputVal, int quantity, int yearToDate){
			return new Gamma(inputVal, quantity, yearToDate, this).compute();
		}
		
		int delta(){
			return 0;
		}	
}
	
	class Gamma{

		private int _importantValue1;
		private int _importantValue2;
		private int _importantValue3;
		private final int _inputVal;
		private final int _quantity;
		private final int _yearToDate;
		private final Account _source;
		

		public Gamma(int inputVal, int quantity, int yearToDate, Account source) {
			super();
			
			_inputVal = inputVal;
			_quantity = quantity;
			_yearToDate = yearToDate;
			_source = source;
		}
		
		
		public int compute(){
			_importantValue1 = _inputVal * _quantity + _source.delta();
			_importantValue2 = _inputVal * _yearToDate + 100;
			if(_yearToDate - _importantValue1 > 100){
				_importantValue2 -= 20;
			}
			_importantValue3 = _importantValue2 * 7;
			return _importantValue3 - 2 * _importantValue1;
		}
	}
}
