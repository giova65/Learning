public class ExtractClass {
	class Person{
		private String _name;
		private Telephone _telephone;
		
		String getName(){
			return _name;
		}
		
		String getTelephoneNumber(){
			return _telephone.getOfficeAreaCode() + " " + _telephone.getOfficeNumber();
		}
	}
	
	class Telephone{

		private String _officeAreaCode;
		private String _officeNumber;
		
		String getOfficeAreaCode(){
			return _officeAreaCode;
		}
		void setOfficeAreaCode(String arg){
			_officeAreaCode = arg;
		}
		String getOfficeNumber(){
			return _officeNumber;
		}
		void setOfficeNumber(String arg){
			_officeNumber = arg;
		}
		
	}
}
