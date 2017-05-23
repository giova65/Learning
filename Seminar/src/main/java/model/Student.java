package model;

public class Student {
	private final String _name;
	private final String _surname; 

	public Student(String name, String surname){
		this._name = name;
		this._surname = surname;
	}
	
	public String getFullName(){
		return this._name + " " + this._surname;
	}
	
	public String getName(){
		return _name;
	}

	public String getSurname(){
		return _surname;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_name == null) ? 0 : _name.hashCode());
		result = prime * result + ((_surname == null) ? 0 : _surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (_name == null) {
			if (other._name != null)
				return false;
		} else if (!_name.equals(other._name))
			return false;
		if (_surname == null) {
			if (other._surname != null)
				return false;
		} else if (!_surname.equals(other._surname))
			return false;
		return true;
	}
}
