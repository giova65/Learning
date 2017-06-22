public class InLineClass {
	private String _name;
	private String _officeAreaCode;
	private String _officeNumber;
	
	String getName(){
		return _name;
	}
	
	void setOfficeAreaCode(String arg){
		_officeAreaCode = arg;
	}
	
	void setOfficeNumber(String arg){
		_officeNumber = arg;
	}

	String getTelephoneNumber(){
		return _officeAreaCode + " " + _officeNumber;
	}
}