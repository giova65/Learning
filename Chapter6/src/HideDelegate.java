
public class HideDelegate {

	class Person{
		Departement _departement;
		
		public Departement getDepartement(){
			return _departement;
		}
		
		public void setDepartement(Departement arg){
			_departement = arg;
		}
	}
	
	class Departement{
		private String _chargeCode;
		private final Person _manager;
		
		public Departement(Person manager){
			_manager = manager;
		}
		
		public Person getManager(){
			return _manager;
		}
	}
}
